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

    /**
     * 菜单配置页面
     *
     * @return
     * @throws Exception
     */
	@RequestMapping("/viewMenus")
	public String viewMenus() throws Exception {
		logger.info("==> [系统菜单]");
		return "sysmenu/index";
	}

    /**
     * 查询所有菜单
     *
     * @param condition
     * @throws Exception
     */
    @ResponseBody
	@RequestMapping("/findMenuList")
	public List<Resources> findMenuList(ResourcesCondition condition) throws Exception {
		try {
			logger.info("==> [findMenuList]");
			return resourcesService.findResourcesList(condition);
		} catch (Exception e) {
			logger.error("==>异常：", e);
			return null;
		}
	}


    /**
     * 查询所有树形菜单
     *
     * @param response
     * @param resourceCondition
     * @return
     * @throws Exception
     */
	@ResponseBody
	@RequestMapping("/findTreeMenus")
	public List<Resources> findTreeMenus(HttpServletResponse response, ResourcesCondition resourceCondition) throws Exception {
		logger.info("==> [findTreeMenus]");
		List<Resources> resourceList = null;
		try {
			resourceList = this.resourcesService.findResourcesList(resourceCondition);
		} catch (Exception e) {
			logger.error("==> 查询菜单异常：", e);
		}
        return resourceList;
	}
}
