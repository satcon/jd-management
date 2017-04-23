package com.jd.management.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jd.management.common.Page;
import com.jd.management.condition.RoleResourcesCondition;
import com.jd.management.dao.RoleResourcesDao;
import com.jd.management.domain.RoleResources;
import com.jd.management.service.RoleResourcesService;

/**
 * 角色-资源关系服务实现
 * @author jiaodong
 */
@Component("roleResourcesService")
public class RoleResourcesServiceImpl implements RoleResourcesService {


	/**
	 * Logger for this class
	 */
	private static final Logger log = LoggerFactory.getLogger(RoleResourcesServiceImpl.class);
	/**
	 * the RoleResourcesDao
	 */
	@Resource
	private RoleResourcesDao roleResourcesDao;
	
	
	
	/*===============================================================================*/
	/*                                以下是增删改查方法
	/*===============================================================================*/
	/**
	 * 获取角色-资源关系
	 * @param id
	 * @return the RoleResources
	 */
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public RoleResources getRoleResources(Long id) {
		RoleResources roleResources = roleResourcesDao.getRoleResourcesById(id);
		return roleResources;
	}
	/**
	 * 插入角色-资源关系
	 * @param roleResources
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Integer insertRoleResources(RoleResources roleResources) {
	     Date date = new Date();
	     roleResources.setIsDelete(0);
		 roleResources.setCreateTime(date);
		 roleResources.setUpdateTime(date);
		return  roleResourcesDao.insertRoleResources(roleResources);
	}
	/**
	 * 更新角色-资源关系
	 * @param roleResources
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Integer updateRoleResources(RoleResources roleResources) {
		roleResources.setUpdateTime(new Date());
		return roleResourcesDao.updateRoleResources(roleResources);
	}
	/**
	 * 删除角色-资源关系
	 * @param id
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Integer deleteRoleResources(Long id) {
		return roleResourcesDao.deleteRoleResources(id);
	}
	public Page findRoleResourcesList(Page page, RoleResourcesCondition roleResourcesCondition) {
		//page.setRows(roleResourcesDao.findRoleResourcesList(page, roleResourcesCondition));
		return page;
	}

	/*===============================================================================*/
	/*                                以下是get/set方法
	/*===============================================================================*/
	/**
	 * @return the roleResourcesDao
	 */
	public RoleResourcesDao getRoleResourcesDao() {
		return this.roleResourcesDao;
	}
	
	/**
	 * @param roleResourcesDao the roleResourcesDao to set
	 */
	public void setRoleResourcesDao(RoleResourcesDao roleResourcesDao) {
		this.roleResourcesDao = roleResourcesDao;
	}
	

}
