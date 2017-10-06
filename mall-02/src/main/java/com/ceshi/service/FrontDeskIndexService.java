package com.ceshi.service;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceshi.bean.Go_evaluate;
import com.ceshi.bean.Go_evaluateExample;
import com.ceshi.bean.Go_kindExample;
import com.ceshi.bean.Go_pictureWithBLOBs;
import com.ceshi.bean.Good;
import com.ceshi.bean.GoodExample;
import com.ceshi.bean.Good_searchrecord;
import com.ceshi.bean.Good_searchrecordExample;
import com.ceshi.bean.Me_address;
import com.ceshi.bean.Me_addressExample;
import com.ceshi.bean.Me_addressExample.Criteria;
import com.ceshi.bean.Me_membercard;
import com.ceshi.bean.Me_membercardExample;
import com.ceshi.bean.Me_message;
import com.ceshi.bean.Member;
import com.ceshi.bean.MemberExample;
import com.ceshi.bean.Myorder;
import com.ceshi.bean.MyorderExample;
import com.ceshi.bean.Or_good;
import com.ceshi.dao.Go_evaluateMapper;
import com.ceshi.dao.Go_kindMapper;
import com.ceshi.dao.Go_pictureMapper;
import com.ceshi.dao.GoodMapper;
import com.ceshi.dao.Good_searchrecordMapper;
import com.ceshi.dao.Me_addressMapper;
import com.ceshi.dao.Me_membercardMapper;
import com.ceshi.dao.Me_messageMapper;
import com.ceshi.dao.MemberMapper;
import com.ceshi.dao.MyorderMapper;
import com.ceshi.dao.Or_goodMapper;


@Service
public class FrontDeskIndexService {

	@Autowired
	Go_pictureMapper go_pictureMapper;
	
	@Autowired
	GoodMapper goodMapper;
	
	
	@Autowired
	Good_searchrecordMapper good_searchrecordMapper;
	
	
	@Autowired
	Go_evaluateMapper go_evaluateMapper;
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	Me_addressMapper me_addressMapper;
	
	@Autowired
	MyorderMapper myorderMapper;
	
	@Autowired
	Go_kindMapper go_kindMapper;
	
	@Autowired
	Or_goodMapper or_goodMapper;
	
	
	@Autowired
	MemberMapper memberMapper;
	
	@Autowired
	Me_membercardMapper me_membercardMapper;
	
	
	@Autowired
	Me_messageMapper me_messageMapper;
	
	//得到促销商品中的轮播图片
	public List<Go_pictureWithBLOBs> getPi_lb() {
		List<Go_pictureWithBLOBs> go_pictureWithBLOBs =   go_pictureMapper.selectByGoodIdWithPi_Lb();
		return go_pictureWithBLOBs;
	}
	
	
	//得到goodid
	public List<Good> getGooId() {
		List<Good> gList = goodMapper.selectGoodIdByMaxBuySum();
		return gList;
	}


	//得到特价商品
	public List<Integer> getSpecialPrice() {
		 List<Integer> sIntegers = goodMapper.selectSpecialPriceGoodId();
		return sIntegers;
	}


	//得到轮播商品的id
	public List<Integer> getLbGoodId() {
		List<Integer> sIntegers = goodMapper.selectLbGoodId();
		return sIntegers;
	}


	//得到排队轮播商品中促销商品另外的特价商品
	public List<Good> getSpecialPriceGood(Integer integer1, Integer integer2, Integer integer3) {
		List<Good> gList = goodMapper.selectSpecialPriceGood(integer1,integer2,integer3);
		return gList;
	}


	//得到热销商品
	public List<Good> getHotSellGood() {
		List<Good> gList = goodMapper.selectHotSellGood();
		return gList;
	}


	//得到服装专区商品
	public List<Good> getClothing() {
		List<Good> gList = goodMapper.selectClothing();
		return gList;
	}


	//得到数码专区的商品
	public List<Good> getMobiles() {
		List<Good> gList = goodMapper.selectMobiles();
		return gList;
	}


	public boolean searchSave(String seval) {
		String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		int l = good_searchrecordMapper.insertSelective(new Good_searchrecord(null, seval, null, date, null));
		return l!=0;
	}


	public List<Good_searchrecord> checkSearchText() {
		Good_searchrecordExample example = new Good_searchrecordExample();
		example.setOrderByClause("se_id");
		List<Good_searchrecord> list = good_searchrecordMapper.selectByExample(example);
		return list;
	}


	public boolean deleteSearchText() {
		int l = good_searchrecordMapper.deleteByExample(null);
		return l!=0;
	}


	public List<Good> searchGood(String[] strings) {
		GoodExample example = new GoodExample();
		com.ceshi.bean.GoodExample.Criteria criteria = example.createCriteria();
		String like = "";
		for (int i = 0; i < strings.length; i++) {
			like += strings[i]+"%";
		}
		criteria.andGoNameLike("%"+like);
		example.setOrderByClause("go_buysum");
		List<Good> list = goodMapper.selectByExampleWithLike(example);
		return list;
	}


	public Good goodDetails(int goodid) {
		Good g = goodMapper.selectDetailsById(goodid);
		return g;
	}


	public List<Go_evaluate> getEvaluate(int goodid) {
		Go_evaluateExample example = new Go_evaluateExample();
		com.ceshi.bean.Go_evaluateExample.Criteria criteria = example.createCriteria();
		criteria.andEvGoodidEqualTo(goodid);
		example.setOrderByClause("e.ev_id");
		List<Go_evaluate> go_evaluates = go_evaluateMapper.selectByExampleWithEvaluate(example);
		return go_evaluates;
	}


	public Me_address affirmOrder(String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();
		Me_addressExample example = new Me_addressExample();
		com.ceshi.bean.Me_addressExample.Criteria criteria = example.createCriteria();
		criteria.andAdMemberidEqualTo(memberid);
		criteria.andAdLabelEqualTo(1+"");
		List<Me_address> list  = me_addressMapper.selectByExample(example);
		
		return list.get(0);
	}


	public boolean affirmPay(String name, int goodid, int kindid, int buysum,int  addressid,String  leavemsg) {
		int memberid = memberService.getInfo(name).get(0).getMeId();
		String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		double price = go_kindMapper.selectByPrimaryKey(kindid).getKiNowprice();
		
		
		int i = myorderMapper.insert(new Myorder(null,memberid,price,date,2,1,addressid,leavemsg,null,3,null,null,4,null,2));;
		List<Myorder> list = myorderMapper.selectByExample(null);
		int j =  or_goodMapper.insertSelective(new Or_good(null,list.get(list.size()-1).getOrId(),goodid,kindid,buysum));//插入订单商品表
		
		return j!=0&&i!=0;
	}


	public Member getPersonalData(String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();
		Member member = memberMapper.selectByPrimaryKey(memberid);
		return member;
	}


	public List<Myorder> getRecord(String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();
		MyorderExample example = new MyorderExample();
		com.ceshi.bean.MyorderExample.Criteria criteria = example.createCriteria();
		criteria.andOrMemberidEqualTo(memberid);
		example.setOrderByClause("or_id");
		List<Myorder> list = myorderMapper.selectByExample(example);
		return list;
	}


	public boolean isExist(String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();
		Me_membercardExample example = new Me_membercardExample();
		com.ceshi.bean.Me_membercardExample.Criteria criteria = example.createCriteria();
		criteria.andMcMemberidEqualTo(memberid);
		long i = me_membercardMapper.countByExample(example);
		return i!=0;
	}


	public void reduceMoney(String name,Double  price) {
		int memberid = memberService.getInfo(name).get(0).getMeId();
		Me_membercardExample example = new Me_membercardExample();
		com.ceshi.bean.Me_membercardExample.Criteria criteria = example.createCriteria();
		criteria.andMcMemberidEqualTo(memberid);
		List<Me_membercard> me_membercards = me_membercardMapper.selectByExample(example);
		me_membercardMapper.updateByExampleSelective(new Me_membercard(me_membercards.get(0).getMcMoney()-price), example);
	}


	public boolean feedbackInformation(String title, String content, String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();
		int i = me_messageMapper.insertSelective(new Me_message(null, memberid, 1, content, title, null));
		
		return i!=0;
	}


	public boolean passwordEdit(String password, String name) {
		MemberExample example = new MemberExample();
		com.ceshi.bean.MemberExample.Criteria criteria = example.createCriteria();
		criteria.andMeNicknameEqualTo(name);
		int i = memberMapper.updateByExampleSelective(new Member(password), example);
		return i!=0;
	}


	public Me_message getInfCenDet(int meId) {
		Me_message me_message = me_messageMapper.selectByPrimaryKey(meId);
		return me_message;
	}

	
	
}
