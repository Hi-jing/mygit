package com.ceshi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceshi.bean.Me_address;
import com.ceshi.bean.Me_addressExample;
import com.ceshi.bean.Me_addressExample.Criteria;
import com.ceshi.bean.Me_message;
import com.ceshi.bean.Me_messageExample;
import com.ceshi.dao.Me_addressMapper;
import com.ceshi.dao.Me_messageMapper;

@Service
public class PersonalCenterlService {
	
	@Autowired
	Me_addressMapper me_addressMapper;
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	Me_messageMapper me_messageMapper;

	public boolean addAddress(String name,Me_address me_address) {
		int memberid = memberService.getInfo(name).get(0).getMeId();//由session对象中获得用户名得到会员id
		me_address.setAdMemberid(memberid);
		long j = me_addressMapper.insertSelective(me_address);
		return j!=0;
	}


	public List<Me_address> lookAllAddress(String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();//由session对象中获得用户名得到会员id
		Me_addressExample example = new Me_addressExample();
		Criteria criteria = example.createCriteria();
		criteria.andAdMemberidEqualTo(memberid);
		example.setOrderByClause("ad_label");
		List<Me_address> list = me_addressMapper.selectByExample(example);
		return list;
	}


	public void changeAddress(int adid,int my_default) {
		//int memberid = memberService.getInfo(name).get(0).getMeId();//由session对象中获得用户名得到会员id
		Me_addressExample example01 = new Me_addressExample();
		Criteria criteria01 = example01.createCriteria();
		criteria01.andAdIdEqualTo(adid);
		me_addressMapper.updateByExampleSelective(new Me_address("1"), example01);
		
		Me_addressExample example02 = new Me_addressExample();
		Criteria criteria02 = example02.createCriteria();
		criteria02.andAdIdEqualTo(my_default);
		me_addressMapper.updateByExampleSelective(new Me_address("0"), example02);
	}


	public boolean deleteAddress(int adid) {
		long l = me_addressMapper.deleteByPrimaryKey(adid);
		return l!=0;
	}


	public Me_address getLookOne(int adid) {
		Me_address me_address = me_addressMapper.selectByPrimaryKey(adid);
		return me_address;
	}


	public void editAddress(int adid, Me_address me_address) {
		Me_addressExample example = new Me_addressExample();
		Criteria criteria = example.createCriteria();
		criteria.andAdIdEqualTo(adid);
		me_addressMapper.updateByExampleSelective(me_address, example);
	}


	public List<Me_message> getMsg(String name) {
		int memberid = memberService.getInfo(name).get(0).getMeId();//由session对象中获得用户名得到会员id
		Me_messageExample example = new Me_messageExample();
		com.ceshi.bean.Me_messageExample.Criteria criteria = example.createCriteria();
		criteria.andMeMemberidEqualTo(memberid);
		example.setOrderByClause("me_id");
		List<Me_message> me_messages = me_messageMapper.selectByExampleWithBLOBs(example);
		return me_messages;
	}
	
	
	
	
	
}
