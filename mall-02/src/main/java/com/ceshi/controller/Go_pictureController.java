
package com.ceshi.controller;

import java.io.IOException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ceshi.bean.Msg;
import com.ceshi.service.AddGoodWithAllMsgService;
import com.ceshi.service.Go_pictureService;
import com.ceshi.utils.staticHelper;

/**
 * 处理会员的crud
 * 
 * @author dhj
 *
 */
@Controller
public class Go_pictureController {

	staticHelper staticHelper;

	@Autowired
	Go_pictureService go_pictureService;

	@Autowired
	AddGoodWithAllMsgService addGoodWithAllMsgService;

	@RequestMapping(value = "/byte", method = RequestMethod.GET)
	@ResponseBody
	public Msg getByte() {
		byte[] g = go_pictureService.getPicByte().getPiHang();
		return Msg.success().add("go_picture", g);
		// return Msg.success();
	}

	/**
	 * ajax异步保存图片于session中
	 * 
	 * @param files 页面中传来的MultipartFile对象
	 * @param session
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/pic")
	@ResponseBody
	public Msg uploadPhoto(@RequestParam MultipartFile files, HttpSession session) throws IOException {
		String[] names = files.getOriginalFilename().split("\\.");
		System.out.println(names[0]);
		saveSession(names[0], files,session);

		return Msg.success();
	}

	public void saveSession(String name, MultipartFile files, HttpSession session) throws IOException {
		staticHelper = new staticHelper();
		
		staticHelper.s_map.put(name, files.getBytes());
		if (session.getAttribute("s_map") != null) {
			session.removeAttribute("s_map");
		}
		session.setAttribute("s_map", staticHelper.s_map);
	}

}
