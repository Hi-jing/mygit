package com.ceshi.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.crypto.MacSpi;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.validation.constraints.Null;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ceshi.bean.Employee;
import com.ceshi.bean.Go_kind;
import com.ceshi.bean.Go_paytype;
import com.ceshi.bean.Good;
import com.ceshi.bean.Msg;
import com.ceshi.service.AddGoodWithAllMsgService;
import com.ceshi.utils.staticHelper;

/**
 * 一次性添加商品全部信息
 * @author dhj
 *
 */
@Controller
public class AddGoodWithAllMsgController {
	staticHelper staticHelper;

	@Autowired
	AddGoodWithAllMsgService addGoodWithAllMsgService;
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/saveGoodMsg",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveGoodMsg(@Valid Good good,@Valid Go_kind go_kind,@Valid Go_paytype go_paytype,HttpSession session,BindingResult result){
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

			if ((Map<String, byte[]>)session.getAttribute("s_map")==null) {
				System.out.println("session为空");
				return Msg.fail();
			}
			else{
				addGoodWithAllMsgService.saveGoodAllMsg((Map<String, byte[]>)session.getAttribute("s_map"),good,go_kind,go_paytype);
				session.removeAttribute("s_map");
				staticHelper = new staticHelper();
				staticHelper.s_map.remove("004");
				return Msg.success();
			}
		}
	
		
	}
	
	
	
	//将前台传来的MultipartFile数组转化为byte[]数组保存于Map集合 
	public Map<String,byte[]> getAllPicByte(MultipartFile[] files) throws IOException {
		Map<String, byte[]> map = new HashMap<String, byte[]>();
		 for(int i = 0,j = 1;i<files.length;i++,j++){
			 map.put("pic0"+j, files[i].getBytes());
		 }
		return map;
	}

	
}
