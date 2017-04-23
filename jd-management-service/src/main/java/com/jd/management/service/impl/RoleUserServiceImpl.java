package com.jd.management.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jd.management.common.Page;
import com.jd.management.condition.RoleUserCondition;
import com.jd.management.dao.RoleUserDao;
import com.jd.management.domain.RoleUser;
import com.jd.management.service.RoleUserService;

/**
 * 角色-用户关系服务实现
 * @author jiaodong
 */
@Component("roleUserService")
public class RoleUserServiceImpl implements RoleUserService {


	/**
	 * Logger for this class
	 */
	private static final Logger log = LoggerFactory.getLogger(RoleUserServiceImpl.class);
	/**
	 * the RoleUserDao
	 */
	@Resource
	private RoleUserDao roleUserDao;
	
	
	
	/*===============================================================================*/
	/*                                以下是增删改查方法
	/*===============================================================================*/
	/**
	 * 获取角色-用户关系
	 * @param id
	 * @return the RoleUser
	 */
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public RoleUser getRoleUser(Long id) {
		RoleUser roleUser = roleUserDao.getRoleUserById(id);
		return roleUser;
	}
	/**
	 * 插入角色-用户关系
	 * @param roleUser
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Integer insertRoleUser(RoleUser roleUser) {
	     Date date = new Date();
	     roleUser.setIsDelete(0);
		 roleUser.setCreateTime(date);
		 roleUser.setUpdateTime(date);
		return  roleUserDao.insertRoleUser(roleUser);
	}
	/**
	 * 更新角色-用户关系
	 * @param roleUser
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Integer updateRoleUser(RoleUser roleUser) {
	     roleUser.setUpdateTime(new Date());
		return roleUserDao.updateRoleUser(roleUser);
	}
	/**
	 * 删除角色-用户关系
	 * @param id
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Integer deleteRoleUser(Long id) {
		return roleUserDao.deleteRoleUser(id);
	}
	
	public Page findRoleUserList(Page page, RoleUserCondition roleUserCondition) {
		//page.setRows(roleUserDao.findRoleUserList(page, roleUserCondition));
		return page;
	}

	/*===============================================================================*/
	/*                                以下是get/set方法
	/*===============================================================================*/
	/**
	 * @return the roleUserDao
	 */
	public RoleUserDao getRoleUserDao() {
		return this.roleUserDao;
	}
	
	/**
	 * @param roleUserDao the roleUserDao to set
	 */
	public void setRoleUserDao(RoleUserDao roleUserDao) {
		this.roleUserDao = roleUserDao;
	}
	

}
