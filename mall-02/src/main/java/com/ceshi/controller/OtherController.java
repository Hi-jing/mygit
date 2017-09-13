package com.ceshi.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ceshi.bean.Me_address;
import com.ceshi.bean.Msg;

/**
 * 
 * @author dhj
 *
 */
@Controller
public class OtherController {

	// @Autowired
	// OtherService otherService ;

	/**
	 * 校验用户名与密码是否匹配
	 * 
	 * @param name
	 *            输入的用户名
	 * @param password
	 *            输入的密码
	 * @return 校验是否成功与返回信息
	 */

	@RequestMapping("/jumpPage")
	public String jumpPage(HttpSession session,Model model) {
		String name = "";
		name = (String) session.getAttribute("ad_username");
		model.addAttribute("name",name);
		return "home";

	}



}
