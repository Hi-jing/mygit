package com.ceshi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceshi.bean.Good;
import com.ceshi.dao.GoodMapper;

@Service
public class GoodService {

	@Autowired
	GoodMapper goodMapper;
	

	public List<Good> goodRank() {
		List<Good> goods = goodMapper.selectGoodRank();
		return goods;
	}
	
	
	
}
