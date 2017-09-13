package com.ceshi.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ceshi.bean.Ad_loginrecord;
import com.ceshi.bean.Administrator;
import com.ceshi.bean.Msg;
import com.ceshi.service.AdministratorService;

/**
 * 处理管理员crud
 * @author dhj
 *
 */
@Controller
public class AdministratorController {

	
	@Autowired
	AdministratorService  administratorService ;
	
	/**
	 * 校验用户名与密码是否匹配
	 * @param name 输入的用户名
	 * @param password  输入的密码
	 * @return  校验是否成功与返回信息
	 */
	@RequestMapping(value="/admin",method=RequestMethod.POST)
	@ResponseBody
	public Msg checkAdmin(@RequestParam("adUsername")String name,
			@RequestParam("adPassword")String password,
			HttpServletRequest request,HttpServletResponse response,HttpSession session){
		
		boolean b = administratorService.check(name,password);
		if (b) {
			
			//保存cookies
			String[] isSave = request.getParameterValues("isSave");
			if (isSave!=null&&isSave.length>0) {
				Cookie cookie = new Cookie("ad_username", name);
				cookie.setMaxAge(86400);
				response.addCookie(cookie);
			}else {
				Cookie[] cookies = request.getCookies();
				if (cookies!=null&&cookies.length>0) {
					for (Cookie c : cookies) {
						if (c.getName().equals("ad_username")) {
							c.setMaxAge(0);
							response.addCookie(c);
						}
					}
				}
			}
			//将管理员登录信息记录
			administratorService.loginRecord(name);
			session.setAttribute("ad_username", name);
			return Msg.success().add("name", name);
			
		}else {
			return Msg.fail().add("msg", "用户名与密码不匹配！");
		}

	}
	
	/**
	 *  校验用户名是否存在
	 * @param name  输入的用户名
	 * @return  校验是否成功与返回信息
	 */
	@RequestMapping(value="/checkAdName",method=RequestMethod.POST)
	@ResponseBody
	public Msg checkAdName(@RequestParam("adName")String name){
		boolean b = administratorService.checkAdName(name);
		if (b) {
			return Msg.success(); //存在
		}else {
			return Msg.fail().add("msg", "该用户名不存在");//不存在
		}

	}
	
	
	/**
	 * 删除session对象
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/deleteSession",method=RequestMethod.GET)
	@ResponseBody
	public Msg deleteSession(HttpSession session){
		session.removeAttribute("ad_username");
		return Msg.success();

	}
	
	
	/**
	 * 得到最近6条的管理员登录信息
	 * @return
	 */
	@RequestMapping(value="/getAdLoginRecord",method=RequestMethod.GET)
	@ResponseBody
	public Msg getAdLoginRecord(){
		List<Ad_loginrecord> ad_loginrecords = administratorService.getAdLoginRecord();
		return Msg.success().add("loginRecord", ad_loginrecords);

	}
	
	
	
}
