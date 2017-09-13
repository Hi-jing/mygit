package com.ceshi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ceshi.bean.Administrator;
import com.ceshi.bean.Employee;
import com.ceshi.bean.Msg;
import com.ceshi.service.AdministratorService;
import com.ceshi.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 处理员工crud
 * @author dhj
 *
 */
@Controller
public class EmployeeController {

	@Autowired
	EmployeeService  employeeService ;
	
	
	/**
	 * 校验员工是否存在
	 */
	@RequestMapping(value="/checkuser",method=RequestMethod.POST)
	@ResponseBody
	public Msg checkuser(@RequestParam("empName")String empName){
		String regx = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})";
		if (!empName.matches(regx)) {
			return Msg.fail().add("va_msg", "用户名可以是2-5位中文或是6-16位英文和数字组合");
		}
		//从数据库用户名校验
		boolean b = employeeService.checkuser(empName);
		if (b) {
			return Msg.success();
		}else {
			return Msg.fail().add("va_msg", "用户名不可用");
		}
		
	}
	
	/**
	 * 员工增加
	 * 后端校验：1、导入JSR303校验
	 * 		2、导入Hibernate-Validator
	 */
	@RequestMapping(value="/emp",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveEmp(@Valid Employee employee,BindingResult result){
		if (result.hasErrors()) {
			Map<String, Object> map = new HashMap<String, Object>();
			
			List<FieldError> errors = result.getFieldErrors();
			for(FieldError fieldError : errors){
				System.out.println("错误的字段名："+fieldError.getField());
				System.out.println("错误信息："+fieldError.getDefaultMessage());
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			//校验失败
			return Msg.fail().add("errorFields", map);
		}else {
			employeeService.saveEmp(employee);
			return Msg.success();
		}
		
	}
	
	/**
	 * 查询员工（ajax请求和以json数据交互）
	 */
	@RequestMapping("/emps")
	@ResponseBody
	public Msg getEmpsWithJSON(@RequestParam(value="pn",defaultValue="1")Integer pn){
		
		PageHelper.startPage(pn,5);
		List<Employee> emps = employeeService.getAll();
		//pageInfo包装结果，交给页面
		PageInfo pageInfo = new PageInfo(emps,5);//5：连续显示的页数
		return Msg.success().add("pageInfo", pageInfo);
	}
	/**
	 * 查询员工（分页查询,非ajax请求和以json数据交互）
	 */
//	@RequestMapping("/emps")
//	public String getEmps(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){
//		//这不是一个分页查询
//		//引入PageHelper分页插件
//		//在查询之前只需要调用
//		PageHelper.startPage(pn,5);
//		List<Employee> emps = employeeService.getAll();
//		//pageInfo包装结果，交给页面
//		PageInfo pageInfo = new PageInfo(emps,5);//5：连续显示的页数
//		model.addAttribute("pageInfo",pageInfo);
//		
//		return "list";
//	}
	

	
	
	
}
