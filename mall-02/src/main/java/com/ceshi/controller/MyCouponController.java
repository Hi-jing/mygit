package com.ceshi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ceshi.bean.Me_coupon;
import com.ceshi.bean.Msg;
import com.ceshi.service.MyCouponService;

@Controller
public class MyCouponController {
	
	@Autowired
	MyCouponService myCouponService;
	

	@RequestMapping("/frontDesk/personal/my-coupon/getCoupon")
	@ResponseBody
	public Msg getMyCoupon(HttpSession session){
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			List<Me_coupon> list = myCouponService.getMyCoupon(name);
			return Msg.success().add("my_coupon", list);

		}else {
			return Msg.fail().add("msg", "没有登录！");
		}
	}
}
