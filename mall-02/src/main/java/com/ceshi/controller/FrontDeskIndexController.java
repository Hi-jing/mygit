package com.ceshi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.ceshi.bean.Go_evaluate;
import com.ceshi.bean.Go_pictureWithBLOBs;
import com.ceshi.bean.Good;
import com.ceshi.bean.Good_searchrecord;
import com.ceshi.bean.Me_address;
import com.ceshi.bean.Me_message;
import com.ceshi.bean.Member;
import com.ceshi.bean.Msg;
import com.ceshi.bean.Myorder;
import com.ceshi.service.FrontDeskIndexService;

/**
 * 处理前台移动端index页面的数据
 * 
 * @author dhj
 *
 */
@Controller
public class FrontDeskIndexController {

	@Autowired
	FrontDeskIndexService frontDeskIndexService;

	/**
	 * 对移动端index页面的轮播图片查询
	 * 
	 * @return
	 */
	@RequestMapping("/frontDesk/index/lb")
	@ResponseBody
	public Msg getIndexInfoLb(HttpSession session) {
		List<Go_pictureWithBLOBs> go_pictureWithBLOBsList = frontDeskIndexService.getPi_lb();

		return Msg.success().add("picbyte", go_pictureWithBLOBsList);

	}

	/**
	 * 对移动端index页面的特价商品查询
	 * 
	 * @return
	 */
	@RequestMapping("/frontDesk/index/specialPrice")
	@ResponseBody
	public Msg getIndexInfoSpecialPrice() {

		List<Integer> specialPriceGoodId = frontDeskIndexService.getSpecialPrice();

		List<Integer> lbGoodId = frontDeskIndexService.getLbGoodId();

		for (int i = 0; i < lbGoodId.size(); i++) {
			for (int j = 0; j < specialPriceGoodId.size(); j++) {
				if (lbGoodId.get(i).equals(specialPriceGoodId.get(j))) {
					specialPriceGoodId.remove(j);
				}
			}

		}
		List<Good> gList = frontDeskIndexService.getSpecialPriceGood(specialPriceGoodId.get(0),
				specialPriceGoodId.get(1), specialPriceGoodId.get(2));
		return Msg.success().add("gList", gList);

	}

	/**
	 * 对移动端index页面的热销商品查询
	 * 
	 * @return
	 */
	@RequestMapping("/frontDesk/index/HotSellGood")
	@ResponseBody
	public Msg getIndexInfoHotSellGood() {

		List<Good> gList = frontDeskIndexService.getHotSellGood();
		return Msg.success().add("gList", gList);

	}

	/**
	 * 对移动端index页面的服装商品查询
	 * 
	 * @return
	 */
	@RequestMapping("/frontDesk/index/clothing")
	@ResponseBody
	public Msg getIndexInfoClothing() {

		List<Good> gList = frontDeskIndexService.getClothing();
		return Msg.success().add("gList", gList);

	}

	/**
	 * 对移动端index页面的手机数码商品查询
	 * 
	 * @return
	 */
	@RequestMapping("/frontDesk/index/mobiles")
	@ResponseBody
	public Msg getIndexInfoMobiles() {

		List<Good> gList = frontDeskIndexService.getMobiles();
		return Msg.success().add("gList", gList);

	}
	
	
	
	/**
	 * 对移动端index页面的搜索内容进行保存
	 * 
	 * @return
	 */
	@RequestMapping("/frontDesk/index/search")
	@ResponseBody
	public Msg searchSave(@RequestParam("se_val") String seval) {

		boolean b  = frontDeskIndexService.searchSave(seval);
		if (b) {
			return Msg.success().add("msg", "保存成功");
		}else {
			return Msg.fail().add("msg", "保存失败");
		}

	}
	
	
	
	/**
	 * 对移动端index页面的搜索内容进行查询
	 * 
	 * @return
	 */
	@RequestMapping("/frontDesk/index/searchText/check")
	@ResponseBody
	public Msg checkSearchText() {

		List<Good_searchrecord> list  = frontDeskIndexService.checkSearchText();
			return Msg.success().add("list", list);

	}
	
	
	/**
	 * 对移动端index页面的搜索内容进行删除
	 * 
	 * @return
	 */
	@RequestMapping("/frontDesk/index/searchText/delete")
	@ResponseBody
	public Msg deleteSearchText() {

		boolean b  = frontDeskIndexService.deleteSearchText();
		if (b) {
			return Msg.success().add("msg", "删除成功");
		}else {
			return Msg.fail().add("msg", "删除失败");
		}
			

	}
	
	
	/**
	 * 对移动端index页面的搜索后的商品
	 * 
	 * @return
	 */
	@RequestMapping("/frontDesk/index/good/search")
	@ResponseBody
	public Msg searchGood(@RequestParam("search_text") String text) {
		String textStrings = text.trim();
		String[] strings = new String[textStrings.length()];
		for (int i = 0; i < textStrings.length(); i++) {
			strings[i] = textStrings.substring(i, i+1);
		}
		List<Good> list  = frontDeskIndexService.searchGood(strings);
			return Msg.success().add("list", list);
			

	}
	
	
	
	/**
	 * 对移动端商品详情查询（不包含商品评价）
	 * 
	 * @return
	 */
	@RequestMapping("/frontDesk/index/good/details")
	@ResponseBody
	public Msg goodDetails(@RequestParam("goodid") int goodid) {
			Good good = frontDeskIndexService.goodDetails(goodid);
			return Msg.success().add("good", good);
			

	}
	
	/**
	 * 对移动端商品详情查询（包含商品评价）
	 * 
	 * @return
	 */
	@RequestMapping("/frontDesk/index/good/evaluate")
	@ResponseBody
	public Msg getEvaluate(@RequestParam("goodid") int goodid) {
		List<Go_evaluate> gEvaluate = frontDeskIndexService.getEvaluate(goodid);
		return Msg.success().add("gEvaluate", gEvaluate);
			

	}
	
	
	
	
	/**
	 * 确认订单得到我的默认地址
	 * @return
	 */
	@RequestMapping("/frontDesk/index/good/affirm-order")
	@ResponseBody
	public Msg affirmOrder(HttpSession session) {
		//1、得到该会员 的默认收货地址 
		//2、根据goodid获得商品信息(页面跳转传值 ：缩略图，商品名称，规格名称，数量，现价)
		
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			
			Me_address me_address = frontDeskIndexService.affirmOrder(name);
			return Msg.success().add("me_address", me_address);

		}else {
			return Msg.fail().add("msg", "没有登录！");
		}

	}
	
	
	
	/**
	 * 确认订单付款
	 * @return
	 */
	@RequestMapping("/frontDesk/index/good/affirm-order/pay")
	@ResponseBody
	public Msg affirmPay(HttpSession session,@RequestParam("goodid") int  goodid,
			@RequestParam("kindid") int  kindid,
			@RequestParam("buysum") int  buysum,
			@RequestParam("addressid") int  addressid,
			@RequestParam("leavemsg") String  leavemsg,
			@RequestParam("price") Double  price) {
		//收货地址由页面中获取
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			
			boolean b  = frontDeskIndexService.affirmPay(name,goodid,kindid,buysum,addressid,leavemsg);
			if (b) {
				frontDeskIndexService.reduceMoney(name,price);
				return Msg.success().add("msg", "付款成功");
			}else {
				return Msg.fail().add("msg", "付款失败");
			}

		}else {
			return Msg.fail().add("msg", "没有登录！");
		}

	}
	
	
	
	
	/**
	 * 个人信息资料查看
	 * @return
	 */
	@RequestMapping("/frontDesk/personal/personal-date")
	@ResponseBody
	public Msg getPersonalData(HttpSession session) {
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			Member member = frontDeskIndexService.getPersonalData(name);
			return Msg.success().add("member", member);
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}

	}
	
	
	/**
	 * 个人信息资料查看
	 * @return
	 */
	@RequestMapping("/frontDesk/personal/membercard/trade-record")
	@ResponseBody
	public Msg getRecord(HttpSession session) {
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			List<Myorder> myorder = frontDeskIndexService.getRecord(name);
			return Msg.success().add("myorder", myorder);
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}

	}
	
	
	/**
	 * 个人信息资料查看
	 * @return
	 */
	@RequestMapping("/frontDesk/personal/membercard/isExist")
	@ResponseBody
	public Msg isExist(HttpSession session) {
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {

			boolean b = frontDeskIndexService.isExist(name);
			if (b) {
				return Msg.success().add("msg", "会员卡存在");
			}else {
				return Msg.fail().add("msg", "会员卡不存在");
			}
			
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}

	}
	
	
	
	
	/**
	 *用户注销
	 * @return
	 */
	@RequestMapping("/frontDesk/personal/cancel")
	@ResponseBody
	public Msg cancel(HttpSession session) {
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			session.removeAttribute("username");
				return Msg.success().add("msg", "注销成功");
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}

	}
	
	
	
	/**
	 *用户反馈信息
	 * @return
	 */
	@RequestMapping("/frontDesk/personal/feedback/information")
	@ResponseBody
	public Msg feedbackInformation(@RequestParam("title") String title, 
			@RequestParam("content") String content, HttpSession session) {
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			boolean b = frontDeskIndexService.feedbackInformation(title,content,name);
			if (b) {
				return Msg.success().add("msg", "反馈成功");
			}else
			{
				return Msg.fail().add("msg", "反馈失败");
			}
				
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}

	}
	
	
	
	/**
	 *用户反馈信息
	 * @return
	 */
	@RequestMapping("/frontDesk/personal/password/edit")
	@ResponseBody
	public Msg passwordEdit(@RequestParam("password") String password,HttpSession session) {
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			boolean b = frontDeskIndexService.passwordEdit(password,name);
			if (b) {
				return Msg.success().add("msg", "更改成功");
			}else
			{
				return Msg.fail().add("msg", "更改失败");
			}
				
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}

	}
	
	
	
	
	/**
	 *查看个人信息中心的信息
	 * @return
	 */
	@RequestMapping("/frontDesk/personal/getInfCenDet")
	@ResponseBody
	public Msg getInfCenDet(@RequestParam("meId") int meId,HttpSession session) {
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			Me_message m = frontDeskIndexService.getInfCenDet(meId);
				return Msg.success().add("message", m);
	
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}

	}
	
	
	
	
	
	
	
	
	
	

}
