package com.ceshi.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ceshi.bean.Msg;
import com.ceshi.bean.Myorder;
import com.ceshi.service.OrderService;

/**
 * 处理前台的order.html
 * 
 * @author dhj
 *
 */
@Controller
public class OrderController {

	@Autowired
	OrderService orderService;

	/**
	 * 处理order.html页面的信息
	 * 
	 * @param session
	 *            得到已登录的session对象
	 * @return 返回json格式数据给前台
	 */
	@RequestMapping(value = "/member/getOrder", method = RequestMethod.GET)
	@ResponseBody
	public Msg getPersonInfo(HttpSession session) {

		String name = "";
		name = (String) session.getAttribute("username");
		if (name != null && !name.equals("")) {
			List<Myorder> myorders = orderService.getInfo(name);
			int msgSum = orderService.getMsgSum(name);
			return Msg.success().add("msg", myorders).add("msgSum", msgSum);
		} else {
			return Msg.fail().add("msg", "没有登录！");
		}

	}

	/**
	 * 处理order.html页面的信息
	 */
	@RequestMapping(value = "/member/deleteOrder", method = RequestMethod.GET)
	@ResponseBody
	public Msg deleteOrder(@RequestParam("orderId") int orderId) {
		boolean isDeleteSuccess = orderService.deteleOrderById(orderId);
		if (isDeleteSuccess) {
			return Msg.success();
		} else {
			return Msg.fail();
		}

	}

	/**
	 * 查询最近七天有效订单数量(总订单数，积分订单数，普通订单数)
	 */
	@RequestMapping(value = "/administrator/getOrderSum", method = RequestMethod.GET)
	@ResponseBody
	public Msg getOrderSum() {
		
		List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
		for (int i = 0; i < 7; i++) {
			Map<String, Integer> map = new HashMap<String, Integer>();
			for (int j = 0; j < 3; j++) {
				map.put("allSum", (int) orderService.getOrderSum(0, getDateGroup()[i]));
				map.put("generalSum", (int) orderService.getOrderSum(2, getDateGroup()[i]));
				map.put("integralSum", (int) orderService.getOrderSum(1, getDateGroup()[i]));
			}
			list.add(map);
		}
		
    
		return Msg.success().add("orSum", list).add("date",getDateGroupSplit(getDateGroup()) );

	}
	
	
	
	public String[] getDateGroupSplit(String[] strings) {
		String[] strins = new String[7];
		// 最多分割出3个字符串
		for (int i = 0; i < strings.length; i++) {
			 String[] sourceStrArray = strings[i].split("-");
			 // 最多分割出3个字符串
	        sourceStrArray = strings[i].split("-", 2);
			strins[i] = sourceStrArray[1];
		}
		return strins;

	}
	

	//格式化date类型为string类型
	public String[] getDateGroup() {
		String[] strings = new String[7];
		Date dNow = new Date(); // 当前时间
		strings[0] = new SimpleDateFormat("yyyy-MM-dd").format(dNow);
		strings[1] = new SimpleDateFormat("yyyy-MM-dd").format(getDate(dNow, -1));
		strings[2] = new SimpleDateFormat("yyyy-MM-dd").format(getDate(dNow, -2));
		strings[3] = new SimpleDateFormat("yyyy-MM-dd").format(getDate(dNow, -3));
		strings[4] = new SimpleDateFormat("yyyy-MM-dd").format(getDate(dNow, -4));
		strings[5] = new SimpleDateFormat("yyyy-MM-dd").format(getDate(dNow, -5));
		strings[6] = new SimpleDateFormat("yyyy-MM-dd").format(getDate(dNow, -6));
		return strings;

	}

	//得到前七天的时间
	public Date getDate(Date date, int ff) {
		Date dBefore = new Date();
		Calendar calendar = Calendar.getInstance(); // 得到日历
		calendar.setTime(date);// 把当前时间赋给日历
		calendar.add(Calendar.DAY_OF_MONTH, ff); // 设置为前几天
		dBefore = calendar.getTime(); // 得到前几天的时间
		return dBefore;
	}
	
	
	
	/**
	 * 订单类型数量统计
	 */
	@RequestMapping(value = "/administrator/getOrderTypeSum", method = RequestMethod.GET)
	@ResponseBody
	public Msg getOrderTypeSum() {
		long zeroExchange = orderService.getOrderTypeSum(0);
		long buChaExchange = orderService.getOrderTypeSum(1);
		long ordinaryOrder = orderService.getOrderTypeSum(2);
		
		return Msg.success().add("zeroExchange", zeroExchange)
				.add("buChaExchange", buChaExchange)
				.add("ordinaryOrder", ordinaryOrder);

	}
	
	
	

}
