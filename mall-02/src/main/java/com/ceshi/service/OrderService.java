package com.ceshi.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceshi.bean.Me_message;
import com.ceshi.bean.Me_messageExample;
import com.ceshi.bean.Myorder;
import com.ceshi.bean.MyorderExample;
import com.ceshi.bean.MyorderExample.Criteria;
import com.ceshi.dao.Me_messageMapper;
import com.ceshi.dao.MyorderMapper;


@Service
public class OrderService {

	@Autowired
	MyorderMapper myorderMapper;
	
	@Autowired
	Me_messageMapper me_messageMapper;
	
	@Autowired
	MemberService memberService;

	//得到我的订单所有订单的信息
	public List<Myorder> getInfo(String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();//由session对象中获得用户名得到会员id
		
		MyorderExample example = new MyorderExample();
		Criteria criteria = example.createCriteria();
		criteria.andOrMemberidEqualTo(memberid);
		example.setOrderByClause("m.or_id");
		List<Myorder> myorders = myorderMapper.selectByExampleWithAll(example);
		return myorders;
	}

	public boolean deteleOrderById(int orderId) {
		int deleteSum= myorderMapper.deleteByPrimaryKey(orderId);
		System.out.println(deleteSum);
		return (deleteSum == -2147482646) ? true : false;
	}

	public int getMsgSum(String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();//由session对象中获得用户名得到会员id
		Me_messageExample messageExample = new Me_messageExample();
		com.ceshi.bean.Me_messageExample.Criteria criteria = messageExample.createCriteria();
		criteria.andMeMemberidEqualTo(memberid);
		List<Me_message> me_messages = me_messageMapper.selectByExample(messageExample);
		return me_messages.size();
	}

	public long getOrderSum(int what,String date) {
		MyorderExample example = new MyorderExample();
		com.ceshi.bean.MyorderExample.Criteria criteria = example.createCriteria();
		if (what != 0) {
			criteria.andOrTypeEqualTo(what);
		}
		criteria.andOrDateLike(date+"%");
		long h = myorderMapper.countByExample(example);
		return h;
	}

	public long getOrderTypeSum(int i) {
		MyorderExample example = new MyorderExample();
		com.ceshi.bean.MyorderExample.Criteria criteria = example.createCriteria();
		if (i == 0) {
			criteria.andOrTypeEqualTo(1);
			criteria.andOrCostmoneyEqualTo(0.0);
		}else if (i == 1) {
			criteria.andOrTypeEqualTo(1);
			criteria.andOrCostmoneyNotEqualTo(0.0);
		}else {
			criteria.andOrTypeEqualTo(2);
		}
		long l = myorderMapper.countByExample(example);
		return l;
	}
	





}
