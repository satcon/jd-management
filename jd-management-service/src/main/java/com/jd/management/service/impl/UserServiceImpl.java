package com.jd.management.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jd.management.common.Page;
import com.jd.management.condition.UserCondition;
import com.jd.management.dao.UserDao;
import com.jd.management.domain.User;
import com.jd.management.service.UserService;

/**
 * 用户服务实现
 * @author jiaodong
 */
@Service("userService")
public class UserServiceImpl implements UserService {


	/**
	 * Logger for this class
	 */
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	/**
	 * the UserDao
	 */
	@Resource
	private UserDao userDao;
	
	
	
	/*===============================================================================*/
	/*                                以下是增删改查方法
	/*===============================================================================*/
	/**
	 * 获取用户
	 * @param id
	 * @return the User
	 */
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public User getUser(Long id) {
		User user = userDao.getUserById(id);
		return user;
	}
	/**
	 * 插入用户
	 * @param user
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Integer insertUser(User user) {
	     Date date = new Date();
	     user.setIsDelete(0);
		 user.setCreateTime(date);
		 user.setUpdateTime(date);
		return userDao.insertUser(user);
	}
	/**
	 * 更新用户
	 * @param user
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Integer updateUser(User user) {
	     user.setUpdateTime(new Date());
		return userDao.updateUser(user);
	}
	/**
	 * 删除用户
	 * @param id
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Integer deleteUser(Long id) {
		return userDao.deleteUser(id);
	}
	public Page findUserList(Page page, UserCondition userCondition) {
		//page.setRows(userDao.findUserList(page, userCondition));
		return page;
	}

	/*===============================================================================*/
	/*                                以下是get/set方法
	/*===============================================================================*/
	/**
	 * @return the userDao
	 */
	public UserDao getUserDao() {
		return this.userDao;
	}
	
	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
