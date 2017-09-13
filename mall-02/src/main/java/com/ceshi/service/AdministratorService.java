package com.ceshi.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceshi.bean.Ad_loginrecord;
import com.ceshi.bean.Ad_loginrecordExample;
import com.ceshi.bean.Administrator;
import com.ceshi.bean.AdministratorExample;
import com.ceshi.bean.AdministratorExample.Criteria;
import com.ceshi.dao.Ad_loginrecordMapper;
import com.ceshi.dao.AdministratorMapper;

@Service
public class AdministratorService {

	@Autowired
	AdministratorMapper administratorMapper;
	
	@Autowired
	Ad_loginrecordMapper ad_loginrecordMapper;

	//校验用户名与密码是否匹配（管理员）
	public boolean check(String name, String password) {

		// 创建查询条件
		AdministratorExample example = new AdministratorExample();
		Criteria criteria = example.createCriteria();
		criteria.andAdUsernameEqualTo(name);
		criteria.andAdPasswordEqualTo(password);
		long l = administratorMapper.countByExample(example);
		return l != 0;
	}

	
	//校验用户名是否存在
	public boolean checkAdName(String name) {
		// 创建查询条件
		AdministratorExample example = new AdministratorExample();
		Criteria criteria = example.createCriteria();
		criteria.andAdUsernameEqualTo(name);
		long l = administratorMapper.countByExample(example);
		return l != 0;//true：用户名存在 false:用户名不存在 
	}


	public void loginRecord(String name) {
		int ad_id = getAdId(name);
		String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());//得当前系统时间
		ad_loginrecordMapper.insertSelective(new Ad_loginrecord(null,ad_id,date));
	}
	
	
	//通过用户名得到id
	public int getAdId(String name) {
		AdministratorExample example = new AdministratorExample();
		Criteria criteria = example.createCriteria();
		criteria.andAdUsernameEqualTo(name);
		List<Administrator> alist = administratorMapper.selectByExample(example);
		return alist.get(0).getAdId();
	}


	public List<Ad_loginrecord> getAdLoginRecord() {
		Ad_loginrecordExample example = new Ad_loginrecordExample();
		example.setOrderByClause("lo_id");
		List<Ad_loginrecord> ad_loginrecords = ad_loginrecordMapper.selectByExample(example);
		return ad_loginrecords;
	}

}
