package com.ceshi.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


	public List<Good> getPromotionGood() {
		List<Good> goods  = goodMapper.getPromotionGood();
		return goods;
	}


	public List<Map<String, String>> selectAllGoodInfo() {
		List<Good> goods  = goodMapper.getPromotionGood();
		List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
		for (Good gList : goods) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("商品id", gList.getGoId() + "");
			map.put("商品类型", gList.getGoType());
			map.put("商品名称", gList.getGoName());
			map.put("销量", gList.getGoBuysum()+"");
			map.put("库存", gList.getGoTotal()+"");


			map.put("规格", gList.getGo_kind().getKiName());
			map.put("现价", gList.getGo_kind().getKiNowprice()+"");
			map.put("原价", gList.getGo_kind().getKiPreprice()+"");
			map.put("状态", gList.getGo_kind().getKiState() == 1 ? "已上架" : "已下架");
			map.put("进货价", gList.getGo_kind().getKiAddmoney()+"");
			
			
			map.put("销售类型", getPtName(gList.getGo_paytype().getPtName()));
			
			if (gList.getGo_paytype().getPtNeedintegral() != null) {
				map.put("需积分", gList.getGo_paytype().getPtNeedintegral()+"");
			} else {
				map.put("需积分", "0");
			}
			
			if (gList.getGo_paytype().getPtStartdate() != null) {
				map.put("促销开始时间", gList.getGo_paytype().getPtStartdate());
			} else {
				map.put("促销开始时间", "");
			}
			
			
			if (gList.getGo_paytype().getPtOverdate() != null) {
				map.put("促销结束时间", gList.getGo_paytype().getPtOverdate());
			} else {
				map.put("促销结束时间", "");
			}
			

			mapList.add(map);
		}
		return mapList;
	}

	//销售类型名称（1：普通销售2：积分销售3：促销销售）
	private String getPtName(Integer ptName) {
		if (ptName == 1) {
			return "普通销售";
		}else if (ptName == 2) {
			return "积分销售";
		}else {
			return "促销销售";
		}
		
	}
	
	
	
}
