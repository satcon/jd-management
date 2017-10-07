package com.jd.management.controller;

import com.jd.management.common.Page;
import com.jd.management.condition.UserCondition;
import com.jd.management.domain.User;
import com.jd.management.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/sys/user")
public class UserController extends BaseController {
	
	/**
	 * 日志
	 */
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Resource(name = "userService")
    private UserService userService;
	
	@RequestMapping("viewUsers")
	public String viewUsers() throws Exception {
		logger.info("==> 用户首页");
		return "sysuser/index";
	}


	@ResponseBody
    @RequestMapping("findUsers")
	public Page<User> findUsers(UserCondition userCondition) {
	    logger.info("==> 分页查询用户");
        Page<User> page = new Page<User>();
        try {
            page =  this.userService.findUserList(userCondition);
        } catch (Exception e) {
            logger.error("==> 分页查询用户异常:", e);
        }

        return page;
    }
	
}
