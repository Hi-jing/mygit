package com.ceshi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 * 处理商品数据交互
 * @author dhj
 *
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ceshi.bean.Good;
import com.ceshi.bean.Msg;
import com.ceshi.service.GoodService;
@Controller
public class GoodController {

	@Autowired
	GoodService goodService;
	
	/**
	 * 处理商品排名
	 * @return 销售最前7条good
	 */
	@RequestMapping(value="/goodRank",method=RequestMethod.GET)
	@ResponseBody
	public Msg goodRank(){
		List<Good> list = goodService.goodRank();
		return Msg.success().add("glist", list);
	}
	
	
	
}
