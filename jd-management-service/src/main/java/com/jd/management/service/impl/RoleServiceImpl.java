package com.jd.management.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jd.management.common.Page;
import com.jd.management.condition.RoleCondition;
import com.jd.management.dao.RoleDao;
import com.jd.management.domain.Role;
import com.jd.management.service.RoleService;

/**
 * 角色服务实现
 * @author jiaodong
 */
@Component("roleService")
public class RoleServiceImpl implements RoleService {


	/**
	 * Logger for this class
	 */
	private static final Logger log = LoggerFactory.getLogger(RoleServiceImpl.class);
	/**
	 * the RoleDao
	 */
	@Resource
	private RoleDao roleDao;
	
	
	
	/*===============================================================================*/
	/*                                以下是增删改查方法
	/*===============================================================================*/
	/**
	 * 获取角色
	 * @param id
	 * @return the Role
	 */
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public Role getRole(Long id) {
		Role role = roleDao.getRole(id);
		return role;
	}
	/**
	 * 插入角色
	 * @param role
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Integer insertRole(Role role) {
	     Date date = new Date();
	     role.setIsDelete(0);
		 role.setCreateTime(date);
		 role.setUpdateTime(date);
		return  roleDao.insertRole(role);
	}
	/**
	 * 更新角色
	 * @param role
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Integer updateRole(Role role) {
	     role.setUpdateTime(new Date());
		return roleDao.updateRole(role);
	}
	/**
	 * 删除角色
	 * @param id
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Integer deleteRole(Long id) {
		return roleDao.deleteRole(id);
	}
	public Page findRoleList(Page page, RoleCondition roleCondition) {
		//page.setRows(roleDao.findRoleList(page, roleCondition));
		return page;
	}

	/*===============================================================================*/
	/*                                以下是get/set方法
	/*===============================================================================*/
	/**
	 * @return the roleDao
	 */
	public RoleDao getRoleDao() {
		return this.roleDao;
	}
	
	/**
	 * @param roleDao the roleDao to set
	 */
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}
	

}
