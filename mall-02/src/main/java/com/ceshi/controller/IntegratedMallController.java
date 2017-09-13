package com.ceshi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ceshi.bean.Coupon;
import com.ceshi.bean.Good;
import com.ceshi.bean.Integrallucky;
import com.ceshi.bean.Me_address;
import com.ceshi.bean.Me_membercard;
import com.ceshi.bean.Member;
import com.ceshi.bean.Msg;
import com.ceshi.bean.Myorder;
import com.ceshi.service.IntegratedMallService;

/**
 * 处理前台移动端Int-shop.html页面的数据
 * 
 * @author dhj
 *
 */
@Controller
public class IntegratedMallController {

	@Autowired
	IntegratedMallService integratedMallService;

	
	/**
	 * 对移动端Int-shop页面的补差商品查询
	 * 
	 * @return
	 */
	@RequestMapping("/frontDesk/Int-shop/BuChaGood")
	@ResponseBody
	public Msg getBuChaGoodInfo() {
			List<Good> goods = integratedMallService.getBuChaGood();
		return Msg.success().add("goods", goods);

	}

	
	/**
	 * 对移动端Int-shop页面的兑换记录最近一条与我的积分值查询
	 * 
	 * @return
	 */
	@RequestMapping("/frontDesk/int-shop/recentAndIntegral")
	@ResponseBody
	public Msg getRecentAndIntegral(HttpSession session) {
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			Myorder myorder = integratedMallService.getRecentRecord(name);
			return Msg.success().add("myorder", myorder);

		}else {
			return Msg.fail().add("msg", "没有登录！");
		}
		
		

	}
	
	
	/**
	 * 对移动端Int-shop页面的幸运抽奖页面的操作
	 * 
	 * @return
	 */
	@RequestMapping("/frontDesk/int-shop/integralLucky")
	@ResponseBody
	public Msg getIntegralLucky(HttpSession session,@RequestParam("lo_case")int lo_case ) {
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			//处理前移动端要先判断查出来的我的积分是否大于或等于100
			if (lo_case==1) {
				//处理减100积分逻辑并记录
				integratedMallService.updateIntegral(name,0,0,0);
				
			}else if (lo_case==2) {
				//处理减100积分与获得5元通用代金券逻辑并记录 和减库存
				integratedMallService.updateIntegralAndCoupon(name);
			}else if (lo_case==3) {
				//处理减100积分与8.8现金红包逻辑并记录
				integratedMallService.updateIntegralAndRedBao(name);
			}else if (lo_case==4) {
				//处理加100积分逻辑并记录
				integratedMallService.updateIntegral(name,3,0,1);
			}else {
				//处理减100积分   与获得满200减50优惠券逻辑    并记录   和减库存
				integratedMallService.updateIntegralAndCoupon02(name);
				
			}
			return Msg.success();

		}else {
			return Msg.fail().add("msg", "没有登录！");
		}
		
		

	}
	
	
	
	/**
	 * 对移动端Int-shop页面的中的award页面我的积分值查询
	 * 
	 * @return
	 */
	@RequestMapping("/frontDesk/int-shop/award/getIntegral")
	@ResponseBody
	public Msg getgetIntegral(HttpSession session) {
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			int integralValue = integratedMallService.getIntegral(name);
			return Msg.success().add("integral", integralValue);

		}else {
			return Msg.fail().add("msg", "没有登录！");
		}
		
		

	}
	
	
	
	/**
	 * 对移动端Int-shop页面的中的zone-exc页面优惠券查询
	 * 
	 * @return
	 */
	@RequestMapping("/frontDesk/int-shop/zone-exc/getCoupon")
	@ResponseBody
	public Msg getCoupon(HttpSession session) {
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			List<Coupon> couponslist = integratedMallService.getCoupon(name);
			return Msg.success().add("couponslist", couponslist);

		}else {
			return Msg.fail().add("msg", "没有登录！");
		}
		
		

	}
	
	
	
	/**
	 * 查询全部0元兑换商品
	 * @return
	 */
	@RequestMapping("/frontDesk/int-shop/zone-exch/getZeroGood")
	@ResponseBody
	public Msg getZeroGood() {
			List<Good> goods = integratedMallService.getZeroGood();
			return Msg.success().add("goods", goods);

	}
	
	
	/**
	 * 得到我的抽奖记录
	 * @return
	 */
	@RequestMapping("/frontDesk/int-shop/award/award-record")
	@ResponseBody
	public Msg getAwardRecord(HttpSession session) {
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			List<Integrallucky> integralluckies = integratedMallService.getAwardRecord(name);
				return Msg.success().add("integralluckies", integralluckies);
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}

	}
	
	
	
	/**
	 * 得到我的会员卡页面信息
	 * @return
	 */
	@RequestMapping("/frontDesk/personal/bal-center")
	@ResponseBody
	public Msg getBalCenter(HttpSession session) {
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			Me_membercard me_membercard = integratedMallService.getBalCenter(name);
			String vip_name = integratedMallService.getLevel(name);
			int in_val = integratedMallService.getIn_val(name);
				return Msg.success().add("me_membercard", me_membercard)
						.add("nick_name", name).add("vip_name", vip_name)
						.add("in_val", in_val);
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}

	}
	
	/**
	 * 0元兑换优惠券
	 * @return
	 */
	@RequestMapping("/frontDesk/int-shop/exchange/coupon")
	@ResponseBody
	public Msg exchangeCoupon(@RequestParam("couponid") int couponid, HttpSession session) {
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			boolean b = integratedMallService.exchangeCoupon(name,couponid);
			if (b) {
				return Msg.success().add("msg", "兑换成功");
			}else {
				return Msg.fail().add("msg", "兑换失败");
			}
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}

	}
	
	
	/**
	 * 0元兑换商品
	 * @return
	 */
	@RequestMapping("/frontDesk/int-shop/exchange/good")
	@ResponseBody
	public Msg exchangeGood(@RequestParam("goodid") int goodid,@RequestParam("in_val") int in_val, HttpSession session) {
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			System.out.println(goodid);
			boolean b = integratedMallService.exchangeGood(name,goodid,in_val);
			if (b) {
				return Msg.success().add("msg", "兑换成功");
			}else {
				return Msg.fail().add("msg", "兑换失败");
			}
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}

	}
	
	
	
	/**
	 * 会员卡办理
	 * @return
	 */
	@RequestMapping("/frontDesk/personl/membercard/manage")
	@ResponseBody
	public Msg manage(HttpSession session) {
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			boolean b = integratedMallService.manage(name);
			if (b) {
				return Msg.success().add("msg", "办理成功");
			}else {
				return Msg.fail().add("msg", "办理失败");
			}
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}

	}
	
	
	
	/**
	 * 更改密码，验证旧密码
	 * @return
	 */
	@RequestMapping("/frontDesk/personl/membercard/passSet/check")
	@ResponseBody
	public Msg passSetCheck(@RequestParam("password") int password,HttpSession session) {
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			boolean b = integratedMallService.passSetCheck(password,name);
			if (b) {
				return Msg.success().add("msg", "验证成功");
			}else {
				return Msg.fail().add("msg", "验证失败");
			}
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}

	}
	
	
	
	
	/**
	 * 更改密码，
	 * @return
	 */
	@RequestMapping("/frontDesk/personl/membercard/passSet/edit")
	@ResponseBody
	public Msg passSetEdit(@RequestParam("password") int password,HttpSession session) {
		
		String name = "";
		name = (String) session.getAttribute("username");
		if (name!=null&&!name.equals("")) {
			boolean b = integratedMallService.passSetEdit(password,name);
			if (b) {
				return Msg.success().add("msg", "更改成功");
			}else {
				return Msg.fail().add("msg", "更改失败");
			}
		}else {
			return Msg.fail().add("msg", "没有登录！");
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	


}
