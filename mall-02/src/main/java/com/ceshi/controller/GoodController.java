package com.ceshi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
/**
 * 处理商品数据交互
 * @author dhj
 *
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ceshi.bean.Good;
import com.ceshi.bean.Member;
import com.ceshi.bean.Msg;
import com.ceshi.service.GoodService;
import com.ceshi.utils.ViewExcel;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
	
	
	
	/**
	 * 得到促销商品所有信息
	 */
	@RequestMapping(value="/good/getPromotionGood",method=RequestMethod.GET)
	@ResponseBody
	public Msg getPromotionGood(@RequestParam(value = "pn", defaultValue = "1") Integer pn){
		
		PageHelper.startPage(pn, 8);
		List<Good> list = goodService.getPromotionGood();
		// pageInfo包装结果，交给页面
		PageInfo pageInfo = new PageInfo(list, 8);// 5：连续显示的页数
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	
	
	/**
	 * 导出数据为excel
	 */
	@RequestMapping(value = "/good/excel/export", method = RequestMethod.GET)
	public ModelAndView export(ModelMap map) throws Exception {
		List<Map<String, String>> list = goodService.selectAllGoodInfo();
		String[] titles = { "商品id", "商品类型", "商品名称", "销量", "库存", "规格", "现价", "原价", "状态", "进货价", "销售类型", "需积分",
				"促销开始时间", "促销结束时间"};
		ViewExcel excel = new ViewExcel(titles);
		map.put("excelList", list);
		return new ModelAndView(excel, map);
	}
	
	

	
	
}
