package com.ceshi.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.ceshi.bean.Me_address;
import com.ceshi.bean.Me_level;
import com.ceshi.bean.Member;
import com.ceshi.bean.Msg;
import com.ceshi.bean.Myorder;
import com.ceshi.service.MemberService;
import com.ceshi.utils.ViewExcel;
import com.ceshi.utils.sendsms;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 处理前台的会员crud
 * 
 * @author dhj
 *
 */
@Controller
public class MemberController {

	@Autowired
	MemberService memberService;

	/**
	 * 查询用户是否存在并机校验密码
	 * 
	 * @param name
	 *            前台ajax传来的用户名参数
	 * @param password
	 *            前台ajax传来的密码参数
	 * @param session
	 *            用于保存一次会话的对象
	 * @return
	 */

	@RequestMapping(value = "/member/check", method = RequestMethod.GET)
	@ResponseBody
	public Msg checkMember(@RequestParam("username") String name, @RequestParam("password") String password,
			HttpSession session) {

		// 首先判断是否已登录
		String username = "";
		username = (String) session.getAttribute("username");
		if (username != null && !username.equals("")) {
			session.removeAttribute("username");
		}
		
		boolean isPhone = false; //判断是否为手机号
		boolean isExist = false; //是否存在
		boolean isNum = name.matches("[0-9]+"); //是否为数字
		if(name.length() == 11&&isNum){
			isPhone = true;
			isExist  = memberService.checkPerson(name,password,isPhone,session);//手机号与密码登录
			
		}else{
			isPhone = false;
			isExist  = memberService.checkPerson(name,password,isPhone,session);//手机号与密码登录
		}
		
		

//		boolean b = memberService.check(name, password);

		if (isExist) {
				return Msg.success().add("name", (String) session.getAttribute("username"));

		} else {
			session.setAttribute("username", "");
			return Msg.fail().add("msg", "该会员不存在或密码有误！");
		}

	}
	
	

	/**
	 * 处理personal页面的信息
	 * 
	 * @param session
	 *            用于得到当前会话的对象
	 * @return
	 */
	@RequestMapping(value = "/member/getPersonal", method = RequestMethod.GET)
	@ResponseBody
	public Msg getPersonInfo(HttpSession session) {

		String name = "";
		name = (String) session.getAttribute("username");
		if (name != null && !name.equals("")) {
			List<Member> memberInfo = memberService.getInfo(name);
			return Msg.success().add("memberInfo", memberInfo);
		} else {
			return Msg.fail().add("msg", "没有登录！");
		}

	}

	@RequestMapping(value = "/member/register", method = RequestMethod.GET)
	@ResponseBody
	public Msg meRegister(@RequestParam("phone") String phone) {
		boolean b = memberService.checkPhone(phone);
		if (!b) {
			sendsms sms = new sendsms();
			int code = sms.getCheckCode(phone);
			return Msg.success().add("checkCode", code);
		} else {
			return Msg.fail().add("phoneError", "该手机号有已存在！");

		}

	}

	@RequestMapping(value = "/member/register/fillInfo", method = RequestMethod.GET)
	@ResponseBody
	public Msg registerFillInfo(@RequestParam("phone") String phone, @RequestParam("password") String password) {

		String username = memberService.addMember(phone, password);
		return Msg.success().add("username", username);

	}
	
	
	//********档案管理***************

	/**
	 * 档案管理中的会员档案查询
	 */
	@RequestMapping(value = "/member/management/query", method = RequestMethod.GET)
	@ResponseBody
	public Msg query(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		PageHelper.startPage(pn, 8);
		List<Member> list = memberService.queryMember();
		// pageInfo包装结果，交给页面
		PageInfo pageInfo = new PageInfo(list, 8);// 5：连续显示的页数
		return Msg.success().add("pageInfo", pageInfo);
	}

	/**
	 * 档案管理中的会员档案查询
	 */
	@RequestMapping(value = "/member/management/queryOne", method = RequestMethod.GET)
	@ResponseBody
	public Msg queryOne(@RequestParam("like") String like, @RequestParam("select") int sel) {
		List<Member> list = memberService.queryMemberOne(like, sel);
		
		// List<Member> list = new ArrayList<Member>();
		// list.add(member);
		// pageInfo包装结果，交给页面
		PageInfo pageInfo = new PageInfo(list, 8);// 5：连续显示的页数
		return Msg.success().add("pageInfo", pageInfo);
	}

	/**
	 * 导出数据为excel
	 */
	@RequestMapping(value = "/member/excel/export", method = RequestMethod.GET)
	public ModelAndView export(ModelMap map) throws Exception {
		System.out.println("到了");
		List<Map<String, String>> list = memberService.selectAllMemInfo();
		String[] titles = { "会员id", "会员姓名", "会员性别", "注册时间", "会员昵称", "手机号", "邮箱", "生日", "忠诚度", "会员卡号", "卡上金额", "会员卡状态",
				"会员等级", "优惠折扣比", "会员积分值" };
		ViewExcel excel = new ViewExcel(titles);
		map.put("excelList", list);
		return new ModelAndView(excel, map);
	}

	/**
	 * 根据用户id得到用户信息
	 */
	@RequestMapping(value = "/member/getInfoById", method = RequestMethod.GET)
	@ResponseBody
	public Msg getInfoById(@RequestParam("memid") int id) {
		Member member = memberService.getInfoById(id);
		return Msg.success().add("member", member);
	}

	/**
	 * 保存用户信息
	 */
	@RequestMapping(value = "/member/saveMem", method = RequestMethod.POST)
	@ResponseBody
	public Msg saveMem(@Valid Member member) {
		boolean b = memberService.saveMem(member);
		if (b) {
			return Msg.success();
		} else {
			return Msg.fail();
		}

	}

	/**
	 * 检验号码唯一性
	 */
	@RequestMapping(value = "/member/checkOnlyNumber", method = RequestMethod.GET)
	@ResponseBody
	public Msg checkOnlyNumber(@RequestParam("number") String number, @RequestParam("meId") int id) {
		boolean b = memberService.checkOnlyNumber(number, id);
		if (b) {
			return Msg.success();
		} else {
			return Msg.fail();
		}

	}

	/**
	 * 删除会员
	 */
	@RequestMapping(value = "/member/delete", method = RequestMethod.GET)
	@ResponseBody
	public Msg deleteMem(@RequestParam("meId") int id) {
		boolean b = memberService.delteMem(id);
		if (b) {
			return Msg.success();
		} else {
			return Msg.fail();
		}

	}

	/**
	 * 批量删除会员
	 */
	@RequestMapping(value = "/member/delete/batch", method = RequestMethod.GET)
	@ResponseBody
	public Msg deleteMemBatch(@RequestParam("allMeId") String allMeId) {
		String[] sourceStrArray = allMeId.split(",");
		boolean b = false;
		for (int i = 0; i < sourceStrArray.length; i++) {
			 b = memberService.deleteMemBatch(Integer.valueOf(sourceStrArray[i]));
		}
		if (b) {
			return Msg.success();
		}else{
			return Msg.fail();
		}
		
	}

	/**
	 * 会员增长趋势数据查询
	 * 
	 * @throws ParseException
	 */
	@RequestMapping(value = "/member/management/growthTrend", method = RequestMethod.GET)
	@ResponseBody
	public Msg growthTrend(@RequestParam("stTime") String stTime, @RequestParam("eTime") String eTime)
			throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date01 = formatter.parse(stTime);
		Date date02 = formatter.parse(eTime);
		List<Date> list = getBetweenDates(date01, date02);
		List<Integer> list2 = memberService.growthTrend(stTime, list, eTime);
		
		String[] stringX = new String[list2.size()];//X轴
		int[] intY = new int[list2.size()];//X轴
		for (int i = 0; i < list2.size(); i++) {
			if (i == 0) {
				stringX[i] = stTime;
				intY[i] = list2.get(i);
			}else if (i == list2.size()-1) {
				stringX[i] = eTime;
				intY[i] = list2.get(i);
			}else {
				stringX[i] = new SimpleDateFormat("yyyy-MM-dd").format(list.get(i-1));
				intY[i] = list2.get(i);
			}
		}
		return Msg.success().add("stringX", stringX).add("intY", intY);
	}

	/*
	 * 得到两个日期之间的日期
	 */
	public List<Date> getBetweenDates(Date start, Date end) {
		List<Date> result = new ArrayList<Date>();
		Calendar tempStart = Calendar.getInstance();
		tempStart.setTime(start);
		tempStart.add(Calendar.DAY_OF_YEAR, 1);

		Calendar tempEnd = Calendar.getInstance();
		tempEnd.setTime(end);
		while (tempStart.before(tempEnd)) {
			result.add(tempStart.getTime());
			tempStart.add(Calendar.DAY_OF_YEAR, 1);
		}
		return result;
	}
	
	//**************档案管理中的积分服务**************
	
	/**
	 * 档案管理中的积分服务查询
	 */
	@RequestMapping(value = "/member/management/integral/query", method = RequestMethod.GET)
	@ResponseBody
	public Msg integralQuery(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		PageHelper.startPage(pn, 7);
		List<Myorder> list = memberService.integralQuery();
		// pageInfo包装结果，交给页面
		PageInfo pageInfo = new PageInfo(list, 7);// 5：连续显示的页数
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	
	/**
	 * 积分消费记录表导出数据为excel
	 */
	@RequestMapping(value = "/member/integral/record/excel/export", method = RequestMethod.GET)
	public ModelAndView integralExport(ModelMap map) throws Exception {
		System.out.println("到了");  
		List<Map<String, String>> list = memberService.selectAllIntegralInfo();
		String[] titles = { "订单id", "会员姓名", "会员昵称", "收货地址", "手机号","邮编","下单时间", "实付", "消费积分值", "订单类型","客户留言" };
		ViewExcel excel = new ViewExcel(titles);
		map.put("excelList", list);
		return new ModelAndView(excel, map);
	}
	
	
	/**
	 * 得到积分订单的详情。并且有会员信息与收货地址信息
	 */
	@RequestMapping(value = "/member/integral/record/getOrderDetails", method = RequestMethod.GET)
	@ResponseBody
	public Msg getOrderDetails(@RequestParam("orid") int id) {
		Myorder myorder = memberService.getOrderDetails(id);
		return Msg.success().add("myorder", myorder);
	}
	
	
	
	/**
	 * 积分消费记录表搜索
	 * @RequestParam:like:搜索输入框的内容；
	 */
	@RequestMapping(value = "/member/integral/record/searchOrder", method = RequestMethod.GET)
	@ResponseBody
	public Msg searchOrder(@RequestParam("like") String like) {
		List<Myorder> list = memberService.searchOrder(like);
		PageInfo pageInfo = new PageInfo(list, 7);// 5：连续显示的页数
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	
	
	/**
	 * 会员等级管理表
	 */
	@RequestMapping(value = "/member/management/level", method = RequestMethod.GET)
	@ResponseBody
	public Msg managementLevel() {
		List<Me_level> list = memberService.managementLevel();
		return Msg.success().add("list", list);
	}
	
	/**
	 * 会员等级管理表修改等级个数
	 * @RequestParam:number:等级个数
	 */
	@RequestMapping(value = "/member/management/level/edit", method = RequestMethod.GET)
	@ResponseBody
	public Msg managementLevel(@RequestParam("number") int number) {
		//首先判断传来的数是否大于等级个数
		//1、大于：则添加，先查询有多少个，
		//2、小于：则删除，
		int num = memberService.getLevelSum();
		if (number > num) {
			boolean b = memberService.addLevel(num,number);
			if (b) {
				return Msg.success().add("msg", "添加成功");
			}else {
				return Msg.fail().add("msg", "添加失败");
			}
			
		}else if (number < num) {
			
			boolean b = memberService.deleteLevel(num,number);
			if (b) {
				return Msg.success().add("msg", "删除成功");
			}else {
				return Msg.fail().add("msg", "删除失败");
			}
			
		}else {
			return Msg.success().add("msg", "等于不做处理");
		}
	
	}
	
	
	/**
	 * 根据会员id得到会员等级信息
	 */
	@RequestMapping(value = "/member/management/level/getLevelMsg", method = RequestMethod.GET)
	@ResponseBody
	public Msg getLevelMsg(@RequestParam("leId") int leid ) {
		Me_level level   = memberService.getLevelMsg(leid);
		return Msg.success().add("levelmsg",level);
		
	}
	
	
	
	/**
	 * 会员等级管理表根据等级id修改信息
	 */
	@RequestMapping(value = "/member/management/level/editMsg", method = RequestMethod.GET)
	@ResponseBody
	public Msg levelEditMsg(@Valid Me_level me_level) {
		boolean b  = memberService.levelEditMsg(me_level);
		if (b) {
			return Msg.success().add("msg", "修改成功");
		}else{
			return Msg.fail().add("msg", "修改失败");
		}
		
	}
	
	
	//******************积分营销中的积分换购分析*************
	/**
	 * 积分营销中的积分换购分析
	 */
	@RequestMapping(value = "/member/integral/serviceExchange/getTabelInfo", method = RequestMethod.GET)
	@ResponseBody
	public Msg getTabelInfo(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		
		PageHelper.startPage(pn, 8);
		List<Member> list = memberService.getTabelInfo();
		// pageInfo包装结果，交给页面
		PageInfo pageInfo = new PageInfo(list, 8);// 5：连续显示的页数
		return Msg.success().add("pageInfo", pageInfo);
		
	}
	
	
	/**
	 * 积分营销中的积分换购分析
	 */
	@RequestMapping(value = "/member/integral/serviceExchange/getChartInfo", method = RequestMethod.GET)
	@ResponseBody
	public Msg getChartInfo(@RequestParam("memid") int memid) {
		Map<String, Integer> map =  memberService.getChartInfo(memid);
		return Msg.success().add("map", map);
		
	}
	
	
	
	
	
	
	
	

}
