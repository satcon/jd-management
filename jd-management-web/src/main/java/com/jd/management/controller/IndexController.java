package com.jd.management.controller;


import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController extends BaseController {
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index() {
		logger.info("==> index首页");
		return "layout/layout";
	}


    @RequestMapping(value = "west", method = RequestMethod.GET)
    public String west() {
        logger.info("==> 左侧菜单");
        return "/static/frame/west";
    }

    @RequestMapping(value = "center", method = RequestMethod.GET)
    public String center() {
        logger.info("==> 左侧菜单");
        return "/static/frame/center";
    }
	

	@ResponseBody
	@RequestMapping("/error/notFound")
	public String notFound(HttpServletRequest request) {
		logger.info("==> 404页面:" + request.getRequestURI());
		return "error/404";
	}
}
