package com.ceshi.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceshi.bean.Go_kind;
import com.ceshi.bean.Go_paytype;
import com.ceshi.bean.Go_pictureWithBLOBs;
import com.ceshi.bean.Good;
import com.ceshi.dao.Go_kindMapper;
import com.ceshi.dao.Go_paytypeMapper;
import com.ceshi.dao.Go_pictureMapper;
import com.ceshi.dao.GoodMapper;


@Service
public class AddGoodWithAllMsgService {

	@Autowired
	Go_pictureMapper go_pictureMapper;
	
	@Autowired
	GoodMapper goodMapper;
	
	@Autowired
	Go_kindMapper go_kindMapper;
	
	
	@Autowired
	Go_paytypeMapper go_paytypeMapper;
	
	
	
	
	public void savePic(Map<String, byte[]> map) {
		
	}
	


	public void saveGoodAllMsg(Map<String, byte[]> map,Good good,Go_kind go_kind,Go_paytype go_paytype) {
		goodMapper.insertSelective(new Good(null,good.getGoType(),good.getGoName(),null,null,good.getGoTotal()));//good表插入，商品类型+商品名称 +库存量
		
		List<Good> allGood = goodMapper.selectByExample(null);//得到全部商品
		int goodId = allGood.get(allGood.size()-1).getGoId();//得到最新添加的一个商品id
		go_kindMapper.insertSelective(new Go_kind(null,goodId,go_kind.getKiName(),go_kind.getKiNowprice(),go_kind.getKiPreprice(),null,go_kind.getKiAddmoney()));//go_kind表插入  ,规格名称+原价+现价
		
		String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());//得当前系统时间
		go_paytypeMapper.insertSelective(new Go_paytype(null,goodId,go_paytype.getPtName(),go_paytype.getPtNeedintegral(),go_paytype.getPtStartdate(),go_paytype.getPtOverdate(),go_paytype.getPtAddmoney(),go_paytype.getPtMsg()));//go_paytype表插入   ,销售类型+需积分+促销开始时间+促销结束时间+补差金额
		
		if (map.get("004")!=null) {
			go_pictureMapper.insert(new Go_pictureWithBLOBs(null,goodId,map.get("001"),map.get("002"), map.get("003"), map.get("004"), map.get("005")));//go_picture表插入  ,五种类型图片添加 
		}else {
			go_pictureMapper.insert(new Go_pictureWithBLOBs(null,goodId,map.get("001"),map.get("002"), map.get("003"),null, map.get("005")));//go_picture表插入  ,五种类型图片添加 
		}
		
	}



}
