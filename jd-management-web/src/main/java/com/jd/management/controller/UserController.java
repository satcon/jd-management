package com.jd.management.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys/user")
public class UserController extends BaseController {
	
	/**
	 * 日志
	 */
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("viewMenus")
	public String viewUsers() throws Exception {
		logger.info("---【用户首页】");
		return "sysuser/index";
	}
	
}
