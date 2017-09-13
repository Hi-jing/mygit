package com.ceshi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ceshi.bean.Me_address;
import com.ceshi.bean.Me_message;
import com.ceshi.bean.Msg;
import com.ceshi.bean.Myorder;
import com.ceshi.service.PersonalCenterlService;

/**
 * 处理前台移动端个人中心页面的数据
 * 
 * @author dhj
 *
 */
@Controller
public class PersonalCenterController {

	@Autowired
	PersonalCenterlService personalCenterlService;
	
	
	/**
	 * 添加我的地址
	 * @return
	 */
	@RequestMapping(value="/frontDesk/personal/address/add",method=RequestMethod.POST)
	@ResponseBody
	public Msg getRecentAndIntegral(HttpSession session,@Valid Me_address me_address) {
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			if (me_address.getAdId() == null) {
				boolean b = personalCenterlService.addAddress(name,me_address);
				if (b) {
					return Msg.success();
				}else {
					return Msg.fail();
				}
			}else {
				personalCenterlService.editAddress(me_address.getAdId(),me_address);
				return Msg.success();
			}
			
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}
		
		

	}
	
	
	/**
	 * 查询我的地址
	 * @return
	 */
	@RequestMapping(value="/frontDesk/personal/address/look",method=RequestMethod.GET)
	@ResponseBody
	public Msg getRecentAndIntegral(HttpSession session) {
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			List<Me_address> list = personalCenterlService.lookAllAddress(name);
				return Msg.success().add("addressList", list);
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}
		
		

	}
	
	
	
	/**
	 * 更新我的默认地址
	 * @return
	 */
	@RequestMapping(value="/frontDesk/personal/address/change",method=RequestMethod.GET)
	@ResponseBody
	public Msg getChangeDefault(HttpSession session,@RequestParam("adid") int adid,@RequestParam("my_default") int my_default) {
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			personalCenterlService.changeAddress(adid,my_default);
			return Msg.success();
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}
		
		

	}
	
	
	
	/**
	 * 删除我的地址
	 * @return
	 */
	@RequestMapping(value="/frontDesk/personal/address/delete",method=RequestMethod.GET)
	@ResponseBody
	public Msg getDeleteAddress(HttpSession session,@RequestParam("adid") int adid) {
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			boolean b  = personalCenterlService.deleteAddress(adid);
			if (b) {
				return Msg.success().add("msg", "删除成功！");
			}else {
				return Msg.fail().add("msg", "该地址与订单表外键关连！");
			}
			
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}
		
		

	}
	
	
	
	/**
	 * 编辑查询单个的地址
	 * @return
	 */
	@RequestMapping(value="/frontDesk/personal/address/lookOne",method=RequestMethod.GET)
	@ResponseBody
	public Msg getLookOne(HttpSession session,@RequestParam("adid") int adid) {
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			Me_address me_address = personalCenterlService.getLookOne(adid);
			return Msg.success().add("me_address", me_address);
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}
		
		

	}
	
	
	/**
	 * 修改我的地址
	 * @return
	 */
	@RequestMapping(value="/frontDesk/personal/address/editOne",method=RequestMethod.GET)
	@ResponseBody
	public Msg getEditOne(HttpSession session,@RequestParam("adid") int adid) {
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			Me_address me_address = personalCenterlService.getLookOne(adid);
			return Msg.success().add("me_address", me_address);
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}
		
		

	}
	
	
	
	/**
	 * 查询我的消息
	 * @return
	 */
	@RequestMapping(value="/frontDesk/personal/msg",method=RequestMethod.GET)
	@ResponseBody
	public Msg getMsg(HttpSession session) {
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			List<Me_message> list  = personalCenterlService.getMsg(name);
			return Msg.success().add("list", list);
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	



}
