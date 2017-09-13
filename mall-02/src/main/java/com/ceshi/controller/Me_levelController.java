package com.ceshi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ceshi.bean.Msg;
import com.ceshi.service.Me_levelService;

/**
 * 处理会员的crud
 * @author dhj
 *
 */
@Controller
public class Me_levelController {

	
	@Autowired
	Me_levelService  me_levelService ;

	

	
}
