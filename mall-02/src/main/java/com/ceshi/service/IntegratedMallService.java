package com.ceshi.service;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.print.attribute.standard.Copies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.ceshi.bean.Coupon;
import com.ceshi.bean.CouponExample;
import com.ceshi.bean.EmployeeExample;
import com.ceshi.bean.Go_kind;
import com.ceshi.bean.Go_kindExample;
import com.ceshi.bean.Good;
import com.ceshi.bean.Integrallucky;
import com.ceshi.bean.IntegralluckyExample;
import com.ceshi.bean.Me_address;
import com.ceshi.bean.Me_addressExample;
import com.ceshi.bean.Me_coupon;
import com.ceshi.bean.Me_couponExample;
import com.ceshi.bean.Me_integral;
import com.ceshi.bean.Me_integralExample;
import com.ceshi.bean.Me_level;
import com.ceshi.bean.Me_membercard;
import com.ceshi.bean.Me_membercardExample;
import com.ceshi.bean.Member;
import com.ceshi.bean.Myorder;
import com.ceshi.bean.MyorderExample;
import com.ceshi.bean.Or_good;
import com.ceshi.bean.MyorderExample.Criteria;
import com.ceshi.dao.CouponMapper;
import com.ceshi.dao.Go_kindMapper;
import com.ceshi.dao.GoodMapper;
import com.ceshi.dao.IntegralluckyMapper;
import com.ceshi.dao.Me_addressMapper;
import com.ceshi.dao.Me_couponMapper;
import com.ceshi.dao.Me_integralMapper;
import com.ceshi.dao.Me_levelMapper;
import com.ceshi.dao.Me_membercardMapper;
import com.ceshi.dao.MemberMapper;
import com.ceshi.dao.MyorderMapper;
import com.ceshi.dao.Or_goodMapper;


@Service
public class IntegratedMallService {
	
	@Autowired
	GoodMapper goodMapper;
	
	@Autowired
	MyorderMapper myorderMapper;
	
	@Autowired
	Me_integralMapper me_integralMapper;
	
	@Autowired
	Me_couponMapper me_couponMapper;
	
	@Autowired
	CouponMapper couponMapper;
	
	@Autowired
	Me_membercardMapper Me_membercardMapper;
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	IntegralluckyMapper integralluckyMapper;
	
	@Autowired
	Go_kindMapper kindMapper;
	
	@Autowired
	Me_addressMapper me_addressMapper;
	
	@Autowired
	Or_goodMapper or_goodMapper;
	
	@Autowired
	MemberMapper memberMapper;
	
	@Autowired
	Me_levelMapper me_levelMapper;
	

	public List<Good> getBuChaGood() {
		List<Good> goods = goodMapper.selectBuChaGood();
		return goods;
	}

	
	public Myorder getRecentRecord(String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();//由session对象中获得用户名得到会员id
		
//		MyorderExample example = new MyorderExample();
//		
//		Criteria criteria = example.createCriteria();
//		criteria.andOrMemberidEqualTo(11);
//		example.setOrderByClause("m.or_id");
		Myorder myorder = myorderMapper.selectRecentAndIntegral(memberid);
		return myorder;
	}

	public void updateIntegral(String name,int ilSituation,int ilCouponid,int bb) {
		//更新我的积分
		int memberid = memberService.getInfo(name).get(0).getMeId();//由session对象中获得用户名得到会员id
		Me_integralExample example = new Me_integralExample();
		com.ceshi.bean.Me_integralExample.Criteria criteria = example.createCriteria();
		criteria.andInMemberidEqualTo(memberid);
		List<Me_integral> lIntegrals = me_integralMapper.selectByExample(example);
		if (bb==1) {
			me_integralMapper.updateByExampleSelective(new Me_integral(lIntegrals.get(0).getInValue()+100), example);
		}else{
			me_integralMapper.updateByExampleSelective(new Me_integral(lIntegrals.get(0).getInValue()-100), example);
		}
		
		String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());//得当前系统时间
		//将中奖情况记录
		integralluckyMapper.insert(new Integrallucky(null, memberid, ilSituation, date, ilCouponid));
		
	}



	public void updateIntegralAndRedBao(String name) {
		//更新我的积分并记录
		updateIntegral(name,1,0,0);
		
		//更新我的会员卡的金额
		int memberid = memberService.getInfo(name).get(0).getMeId();//由session对象中获得用户名得到会员id
		Me_membercardExample example = new Me_membercardExample();
		com.ceshi.bean.Me_membercardExample.Criteria criteria = example.createCriteria();
		criteria.andMcMemberidEqualTo(memberid);
		List<Me_membercard> list = Me_membercardMapper.selectByExample(example);
		Me_membercardMapper.updateByExampleSelective(new Me_membercard(list.get(0).getMcMoney()+8.8), example);
		
		
	}
	
	public void updateIntegralAndCoupon(String name) {
		
		//更新我的积分并记录
		updateIntegral(name,2,1,0);
		
		
		//减少库存
		CouponExample example = new CouponExample();
		com.ceshi.bean.CouponExample.Criteria criteria = example.createCriteria();
		criteria.andCoIdEqualTo(1);
		List<Coupon>  list = couponMapper.selectByExample(example);
		couponMapper.updateByExampleSelective(new Coupon(list.get(0).getCoTotal()-1), example);
		
		//增加入我的优惠券表
		int memberid = memberService.getInfo(name).get(0).getMeId();//由session对象中获得用户名得到会员id
		me_couponMapper.insertSelective(new Me_coupon(null,list.get(0).getCoId(),memberid,null,5.0,0,1,2,list.get(0).getCoStartdate(),list.get(0).getCoEnddate()));
	}

	public void updateIntegralAndCoupon02(String name) {
		
		//更新我的积分并记录
		updateIntegral(name,2,2,0);
		
		//减少库存
		CouponExample example = new CouponExample();
		com.ceshi.bean.CouponExample.Criteria criteria = example.createCriteria();
		criteria.andCoIdEqualTo(2);
		List<Coupon>  list = couponMapper.selectByExample(example);
		couponMapper.updateByExampleSelective(new Coupon(list.get(0).getCoTotal()-1), example);
		
		//增加入我的优惠券表
		int memberid = memberService.getInfo(name).get(0).getMeId();//由session对象中获得用户名得到会员id
		me_couponMapper.insertSelective(new Me_coupon(null,list.get(0).getCoId(),memberid,200.0,50.0,1,1,1,list.get(0).getCoStartdate(),list.get(0).getCoEnddate()));
		
	}

	//得到当前的积分值 
	public int getIntegral(String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();//由session对象中获得用户名得到会员id
		Me_integralExample example = new Me_integralExample();
		com.ceshi.bean.Me_integralExample.Criteria criteria = example.createCriteria();
		criteria.andInMemberidEqualTo(memberid);
		List<Me_integral> list = me_integralMapper.selectByExample(example);
		return list.get(0).getInValue();
	}

	//得到全部优惠券，不包括已经兑换的
	public List<Coupon> getCoupon(String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();//由session对象中获得用户名得到会员id
		Me_couponExample me_example = new Me_couponExample();
		com.ceshi.bean.Me_couponExample.Criteria me_criteria = me_example.createCriteria();
		me_criteria.andCouMemberidEqualTo(memberid);
		List<Me_coupon> liMe_coupons = me_couponMapper.selectByExample(me_example);
		
		
		CouponExample example = new CouponExample();
		com.ceshi.bean.CouponExample.Criteria criteria = example.createCriteria();
		criteria.andCoIdNotEqualTo(1);
		criteria.andCoIdNotEqualTo(2);
		for (int i = 0; i < liMe_coupons.size(); i++) {
			criteria.andCoIdNotEqualTo(liMe_coupons.get(i).getCouId());
		}
		example.setOrderByClause("co_total");
		
		List<Coupon>  list = couponMapper.selectByExample(example);
		return list;
	}


	public List<Good> getZeroGood() {
		List<Good> goods = goodMapper.selectZeroGood();
		return goods;
	}


	//得到我的抽奖记录
	public List<Integrallucky> getAwardRecord(String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();
		IntegralluckyExample example = new IntegralluckyExample();
		com.ceshi.bean.IntegralluckyExample.Criteria criteria = example.createCriteria();
		criteria.andIlMemberidEqualTo(memberid);
		example.setOrderByClause("il_id");
		List<Integrallucky> integralluckies  = integralluckyMapper.selectByExample(example);
		return integralluckies;
	}


	public Me_membercard getBalCenter(String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();
		Me_membercardExample example = new Me_membercardExample();
		com.ceshi.bean.Me_membercardExample.Criteria criteria = example.createCriteria();
		criteria.andMcMemberidEqualTo(memberid);
		List<Me_membercard> lMe_membercards = Me_membercardMapper.selectByExampleWithAll(example);
		if (lMe_membercards.size()>0) {
			return lMe_membercards.get(0);
		}else {
			return null;
		}
		
	}


	public boolean exchangeCoupon(String name,int couponid) {
		//1、得到优惠券的信息
		//2、添加入我的优惠券
//		CouponExample example = new CouponExample();
//		com.ceshi.bean.CouponExample.Criteria  criteria = example.createCriteria();
		
		Coupon coupon = couponMapper.selectByPrimaryKey(couponid);
		couponMapper.updateByPrimaryKeySelective(new Coupon(couponid,coupon.getCoTotal()-1));
		
		//增加入我的优惠券表
		int memberid = memberService.getInfo(name).get(0).getMeId();//由session对象中获得用户名得到会员id
		int i =  me_couponMapper.insertSelective(new Me_coupon(null,coupon.getCoId(),
				memberid,coupon.getCoNeedmoney(),
				coupon.getCoReductmoney(),coupon.getCoUsetype(),
				1,coupon.getCoType(),coupon.getCoStartdate(),
				coupon.getCoEnddate()));
		
		//更新我的积分
		Me_integralExample example = new Me_integralExample();
		com.ceshi.bean.Me_integralExample.Criteria criteria = example.createCriteria();
		criteria.andInMemberidEqualTo(memberid);
		List<Me_integral> lIntegrals = me_integralMapper.selectByExample(example);
		me_integralMapper.updateByExampleSelective(new Me_integral(lIntegrals.get(0).getInValue()-600), example);
		
		return i!=0;
	}


	public boolean exchangeGood(String name, int goodid ,int in_val) {
		int memberid = memberService.getInfo(name).get(0).getMeId();
//		System.out.println("kindid"+getKindId(goodid));
//		System.out.println(getAddressID(name));
		String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		//double price = kindMapper.selectByPrimaryKey(getKindId(goodid)).getKiNowprice();
		
		
		int i = myorderMapper.insert(new Myorder(null,memberid,0.0,date,2,1,getAddressID(name),null,null,4,null,null,1,in_val,1));;
		List<Myorder> list = myorderMapper.selectByExample(null);
		int j =  or_goodMapper.insertSelective(new Or_good(null,list.get(list.size()-1).getOrId(),goodid,getKindId(goodid),1));//插入订单商品表
		return j!=0&&i!=0;
//		return false;
	}
	
	//根据商品的id得到商品的规格 id
	public int getKindId(int goodid) {
		Go_kindExample example = new Go_kindExample();
		com.ceshi.bean.Go_kindExample.Criteria criteria = example.createCriteria();
		criteria.andKiGoodidEqualTo(goodid);
		List<Go_kind> kinds = kindMapper.selectByExample(example);
		return kinds.get(0).getKiGoodid();
	}
	
	//得到会员 的默认地址
	public int getAddressID(String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();
		Me_addressExample example = new Me_addressExample();
		com.ceshi.bean.Me_addressExample.Criteria criteria = example.createCriteria();
		criteria.andAdMemberidEqualTo(memberid);
		criteria.andAdLabelEqualTo(1+"");
		return me_addressMapper.selectByExample(example).get(0).getAdId();
	}


	public String getLevel(String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();
		Member member = memberMapper.selectByPrimaryKey(memberid);
		Me_level level = me_levelMapper.selectByPrimaryKey(member.getMeLevelid());
		return level.getLePhase();
	}


	public int getIn_val(String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();
		
		Me_integralExample example = new Me_integralExample();
		com.ceshi.bean.Me_integralExample.Criteria criteria = example.createCriteria();
		criteria.andInMemberidEqualTo(memberid);
		List<Me_integral> list = me_integralMapper.selectByExample(example);
		return list.get(0).getInValue();
	}


	public boolean manage(String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();
		Member member = memberMapper.selectByPrimaryKey(memberid);
		
		String date = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		String string = "";
		for (int i = date.length()-1; i >= 0; i--) {
			string += date.charAt(i);
		}
		long l = Long.valueOf(string);
		
		int b = Me_membercardMapper.insertSelective(new Me_membercard(null, memberid, null, null, member.getMeLevelid(),l , 123456));
		
		return b!=0;
	}


	public boolean passSetCheck(int password,String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();
		Me_membercardExample example = new Me_membercardExample();
		com.ceshi.bean.Me_membercardExample.Criteria criteria = example.createCriteria();
		criteria.andMcMemberidEqualTo(memberid);
		List<Me_membercard> list = Me_membercardMapper.selectByExample(example);
		if (password == list.get(0).getMcPaynumber()) {
			return true;
		}else{
			return false;
		}
		
	}


	public boolean passSetEdit(int password, String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();
		Me_membercardExample example = new Me_membercardExample();
		com.ceshi.bean.Me_membercardExample.Criteria criteria = example.createCriteria();
		criteria.andMcMemberidEqualTo(memberid);
		int i= Me_membercardMapper.updateByExampleSelective(new Me_membercard(password), example);
		return i!=0;
	}



	
	
}
