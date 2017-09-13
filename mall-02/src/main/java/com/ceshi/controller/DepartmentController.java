package com.ceshi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ceshi.bean.Department;
import com.ceshi.bean.Msg;
import com.ceshi.service.DepartmentService;

/**
 * 处理部门相关请求
 * @author Administrator
 *
 */

@Controller
public class DepartmentController {

	@Autowired
	DepartmentService  departmentService ;
	
	/**
	 * 返回部门所有信息
	 */
	@RequestMapping("/depts")
	@ResponseBody
	public Msg getDepts(){
		List<Department> list = departmentService.getDepts();
		return Msg.success().add("depts", list);
	}
	
}
