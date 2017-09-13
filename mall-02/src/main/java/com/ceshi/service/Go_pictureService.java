package com.ceshi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceshi.bean.Go_picture;
import com.ceshi.bean.Go_pictureExample;
import com.ceshi.bean.Go_pictureExample.Criteria;
import com.ceshi.bean.Go_pictureWithBLOBs;
import com.ceshi.dao.Go_pictureMapper;


@Service
public class Go_pictureService {

	@Autowired
	Go_pictureMapper go_pictureMapper;

	//校验用户名与密码是否匹配（会员）
	public Go_pictureWithBLOBs getPicByte() {
		// 创建查询条件
		//Go_pictureExample example = new Go_pictureExample();
//		Criteria criteria = example.createCriteria();
//		criteria.andPiIdEqualTo(1);
		Go_pictureWithBLOBs go_pictureWithBLOBs = go_pictureMapper.selectByPrimaryKey(2);
		return go_pictureWithBLOBs;
	}



}
