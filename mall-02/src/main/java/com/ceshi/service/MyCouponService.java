package com.ceshi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceshi.bean.Me_coupon;
import com.ceshi.bean.Me_couponExample;
import com.ceshi.dao.Me_couponMapper;

@Service
public class MyCouponService {
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	Me_couponMapper me_couponMapper;
	

	public List<Me_coupon> getMyCoupon(String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();//由session对象中获得用户名得到会员id
		Me_couponExample example = new Me_couponExample();
		com.ceshi.bean.Me_couponExample.Criteria criteria = example.createCriteria();
		criteria.andCouMemberidEqualTo(memberid);
		example.setOrderByClause("cou_mycouid");
		List<Me_coupon> list = me_couponMapper.selectByExample(example);
		
		return list;
	}
	
	
	
	
}
