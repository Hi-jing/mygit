package com.ceshi.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceshi.bean.Me_address;
import com.ceshi.bean.Me_integral;
import com.ceshi.bean.Me_level;
import com.ceshi.bean.Member;
import com.ceshi.bean.MemberExample;
import com.ceshi.bean.MemberExample.Criteria;
import com.ceshi.bean.Myorder;
import com.ceshi.bean.MyorderExample;
import com.ceshi.dao.Me_addressMapper;
import com.ceshi.dao.Me_integralMapper;
import com.ceshi.dao.Me_levelMapper;
import com.ceshi.dao.MemberMapper;
import com.ceshi.dao.MyorderMapper;

@Service
public class MemberService {

	@Autowired
	MemberMapper memberMapper;

	@Autowired
	Me_integralMapper me_integralMapper;

	@Autowired
	MyorderMapper myorderMapper;
	
	@Autowired
	Me_levelMapper me_levelMapper;

	// 校验用户名与密码是否匹配（会员）
//	public boolean check(String name, String password) {
//		// 创建查询条件
//		MemberExample example = new MemberExample();
//		Criteria criteria = example.createCriteria();
//		criteria.andMeNicknameEqualTo(name);
//		criteria.andMePasswordEqualTo(password);
//		long l = memberMapper.countByExample(example);
//		return l != 0;
//	}

	public List<Member> getInfo(String name) {
		MemberExample example = new MemberExample();
		Criteria criteria = example.createCriteria();
		criteria.andMeNicknameEqualTo(name);
		List<Member> member = memberMapper.selectByExampleWithLevel(example);
		return member;
	}

	public boolean checkPhone(String phone) {
		MemberExample example = new MemberExample();
		Criteria criteria = example.createCriteria();
		criteria.andMePhoneEqualTo(phone);
		long l = memberMapper.countByExample(example);
		System.out.println(l);
		return l != 0;
	}

	public String addMember(String phone, String password) {
		String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());// 得当前系统时间

		String uid = UUID.randomUUID().toString().substring(0, 5);
		long i = memberMapper.insertSelective(new Member(date, uid, password, phone, 1));

		MemberExample example = new MemberExample();
		Criteria criteria = example.createCriteria();
		criteria.andMePhoneEqualTo(phone);
		List<Member> list = memberMapper.selectByExample(example);

		me_integralMapper
				.insertSelective(new Me_integral(null, 1, list.get(0).getMeId(), null, null, null, null, null));

		System.out.println(i);
		return uid;
	}

	public List<Member> queryMember() {
		List<Member> list = memberMapper.selectByExample(null);
		return list;
	}

	public List<Map<String, String>> selectAllMemInfo() {
		List<Member> list = memberMapper.selectMemWithAll();
		List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
		for (Member mlist : list) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("会员id", mlist.getMeId() + "");
			map.put("会员姓名", mlist.getMeName());
			map.put("会员性别", mlist.getMeSex());
			map.put("注册时间", mlist.getMeRegister());
			map.put("会员昵称", mlist.getMeNickname());
			map.put("手机号", mlist.getMePhone());
			map.put("邮箱", mlist.getMeEmail());
			map.put("生日", mlist.getMeBrithday());
			map.put("忠诚度", String.valueOf(mlist.getMeLoyalty()));

			if (mlist.getMe_membercard() != null) {
				map.put("会员卡号", String.valueOf(mlist.getMe_membercard().getMcCardnumber()));
				map.put("卡上金额", String.valueOf(mlist.getMe_membercard().getMcMoney()));
				map.put("会员卡状态", mlist.getMe_membercard().getMcState() == 1 ? "有效" : "无效");
				map.put("会员积分值", String.valueOf(mlist.getMe_integral().getInValue()));
			} else {
				map.put("会员卡号", "");
				map.put("卡上金额", "");
				map.put("会员卡状态", "");
				map.put("会员积分值", "");
			}

			map.put("会员等级", mlist.getMe_level().getLePhase());
			map.put("优惠折扣比", String.valueOf(mlist.getMe_level().getLeDiscount()));

			mapList.add(map);
		}
		return mapList;
	}

	public Member getInfoById(int id) {
		Member member = memberMapper.selectByPrimaryKey(id);
		return member;
	}

	public boolean saveMem(Member member) {
		long l = memberMapper.updateByPrimaryKeySelective(member);
		return l != 0;
	}

	public boolean checkOnlyNumber(String number, int id) {
		MemberExample example = new MemberExample();
		Criteria criteria = example.createCriteria();
		criteria.andMePhoneEqualTo(number);
		List<Member> list = memberMapper.selectByExample(example);
		if (list.size() == 0) {
			return true;
		} else {
			return list.get(0).getMeId() == id;
		}

	}

	public boolean delteMem(int id) {
		int i = memberMapper.deleteByPrimaryKey(id);
		return i != 0;
	}

	public List<Member> queryMemberOne(String like, int sel) {
		MemberExample example = new MemberExample();
		Criteria criteria = example.createCriteria();
		if (sel == 1) {
			criteria.andMeIdEqualTo(Integer.valueOf(like));
		} else if (sel == 2) {
			criteria.andMeNicknameLike("%" + like + "%");
		} else {
			criteria.andMeNameLike("%" + like + "%");
		}

		List<Member> member = memberMapper.selectByExample(example);
		return member;
	}

	public void deleteMemBatch(int id) {
		memberMapper.deleteByPrimaryKey(id);
	}

	public List<Integer> growthTrend(String stTime, List<Date> list, String eTime) {
		List<Integer> list2 = new ArrayList<Integer>();

		for (int i = 0; i < list.size() + 2; i++) {
			if (i == 0) {
				MemberExample example = new MemberExample();
				Criteria Criteria = example.createCriteria();
				Criteria.andMeRegisterLike(stTime + "%");
				int l = (int) memberMapper.countByExample(example);
				// Map<String, Integer> map = new HashMap<String, Integer>();
				// map.put(stTime, l);
				list2.add(l);
			} else if (i == list.size() + 1) {
				MemberExample example = new MemberExample();
				Criteria Criteria = example.createCriteria();
				Criteria.andMeRegisterLike(eTime + "%");
				int l = (int) memberMapper.countByExample(example);
				// Map<String, Integer> map = new HashMap<String, Integer>();
				// map.put(eTime, l);
				list2.add(l);
			} else {
				MemberExample example = new MemberExample();
				Criteria Criteria = example.createCriteria();
				String date = new SimpleDateFormat("yyyy-MM-dd").format(list.get(i - 1));
				Criteria.andMeRegisterLike(date + "%");
				int l = (int) memberMapper.countByExample(example);
				// Map<String, Integer> map = new HashMap<String, Integer>();
				// map.put(date, l);
				list2.add(l);
			}
		}

		return list2;
	}

	public List<Myorder> integralQuery() {
//		MyorderExample example = new MyorderExample();
//		com.ceshi.bean.MyorderExample.Criteria criteria = example.createCriteria();
//		criteria.andOrTypeEqualTo(1);
//		criteria.andOrBuytypeNotEqualTo(3);
//		criteria.andOrBuytypeNotEqualTo(4);
//		criteria.andOrExpendvalIsNotNull();
		List<Myorder> oList = myorderMapper.selectWithMem();
		return oList;
	}

	public List<Map<String, String>> selectAllIntegralInfo() {
		List<Myorder> list = myorderMapper.selectAllIntegralInfo();
		List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
		for (Myorder mlist : list) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("订单id", mlist.getOrId() + "");
			map.put("会员姓名", mlist.getMember().getMeName());
			map.put("会员昵称", mlist.getMember().getMeNickname());
			map.put("手机号", mlist.getMe_address().getAdPhone());
			map.put("收货地址", mlist.getMe_address().getAdAddress());
			map.put("邮编", mlist.getMe_address().getAdZipcode());
			map.put("下单时间", mlist.getOrDate());
			map.put("实付", mlist.getOrCostmoney() + "");
			map.put("消费积分值", mlist.getOrExpendval() + "");
			map.put("订单类型", mlist.getOrType() == 1 ? "积分订单" : "普通订单");
			map.put("客户留言", mlist.getOrLeavemsg());

			mapList.add(map);
		}
		return mapList;
	}

	public Myorder getOrderDetails(int id) {
		MyorderExample example = new MyorderExample();
		com.ceshi.bean.MyorderExample.Criteria criteria = example.createCriteria();
		criteria.andOrIdEqualTo(id);
		List<Myorder> list = myorderMapper.selectWithMemAndAdd(example);
		return list.get(0);

	}

	public List<Myorder> searchOrder(String like) {
		MyorderExample example = new MyorderExample();
		com.ceshi.bean.MyorderExample.Criteria criteria = example.createCriteria();

		criteria.andOrIdEqualTo(Integer.valueOf(like));
		/*
		 * WHERE o.or_expendval !=0
	and (o.or_buytype = 1 OR o.or_buytype = 2)
	AND o.or_type =1
		 */
		criteria.andOrExpendvalNotEqualTo(0);
		criteria.andOrBuytypeBetween(1, 2);
		criteria.andOrTypeEqualTo(1);
		List<Myorder> list = myorderMapper.selectByExampleWithMem(example);
		return list;
	}

	public List<Me_level> managementLevel() {
		
		List<Me_level> levels = me_levelMapper.selectByExample(null);
		return levels;
	}

	public int getLevelSum() {
		int i = (int) me_levelMapper.countByExample(null);
		return i;
	}

	public boolean deleteLevel(int num, int number) {
		boolean b = false;
		for (int i = 0; i < (num-number); i++) {
			int j = me_levelMapper.deleteByPrimaryKey(number+1+i);
			b = (j!=0);
		}
		return b;
	}

	public boolean addLevel(int num, int number) {
		boolean b = false;
		for (int i = 0; i < (number-num); i++) {
			int j = me_levelMapper.insert(new Me_level((num+1+i), "vip"+(num+1+i), 0, 600, 9.5));
			b = (j!=0);
		}
		return b;
	}

	public boolean levelEditMsg(Me_level me_level) {
		me_levelMapper.updateByPrimaryKeySelective(me_level);
		return false;
	}

	public List<Member> getTabelInfo() {
		List<Member> members = memberMapper.selectByExample(null);
		return members;
	}

	public boolean checkPerson(String name, String password, boolean isPhone,HttpSession session) {
		MemberExample example = new MemberExample();
		Criteria criteria = example.createCriteria();
		criteria.andMePasswordEqualTo(password);
		if(isPhone){
			criteria.andMePhoneEqualTo(name);
		}else{
			criteria.andMeNicknameEqualTo(name);
		}
		long b  = memberMapper.countByExample(example);
		if (b!=0&&isPhone) {
			session.setAttribute("username", getNickName(name));
		}else if (b!=0&&!isPhone) {
			session.setAttribute("username", name);
		}
		return b!=0;
	}
	
	
	public String getNickName(String phone) {
		MemberExample example = new MemberExample();
		Criteria criteria = example.createCriteria();
		criteria.andMePhoneEqualTo(phone);
		return memberMapper.selectByExample(example).get(0).getMeNickname();
	}

	public Me_level getLevelMsg(int leid) {
		Me_level me_level = me_levelMapper.selectByPrimaryKey(leid);
		return me_level;
	}

}
