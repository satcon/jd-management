package com.jd.management.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.jd.management.condition.ResourcesCondition;
import com.jd.management.domain.Resources;
import com.jd.management.service.ResourcesService;


@Controller
@RequestMapping("/sys/resources")
public class ResourcesController extends BaseController{
	
	private static final Logger logger = LoggerFactory.getLogger(ResourcesController.class);
	
	@Autowired
	private ResourcesService resourcesService;
	
	@RequestMapping("/viewMenus")
	public String viewMenus() throws Exception {
		logger.info("==> [系统菜单]");
		return "sysmenu/index";
	}
	
	@RequestMapping("/findMenus")
	public void findMenus(HttpServletResponse response) throws Exception {
		try {
			logger.info("==> [findMenus]");
			//resourcesService.findResourcesList(page, resourcesCondition);
		} catch (Exception e) {
			logger.error("==>异常：", e);
			throw e;
		}
	}
	

	@ResponseBody
	@RequestMapping("/findTreeMenus")
	public void findTreeMenus(HttpServletResponse response, ResourcesCondition resourceCondition) throws Exception {
		logger.info("==>[findTreeMenus]");
		List<Resources> resourceList = null;
		try {
			resourceList = this.resourcesService.findResourcesList(resourceCondition);
		} catch (Exception e) {
			logger.error("==> 查询菜单异常：", e);
		}
		writeJson(response, resourceList);
	}
}
