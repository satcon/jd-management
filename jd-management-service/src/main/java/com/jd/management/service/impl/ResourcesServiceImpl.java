package com.jd.management.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.jd.management.condition.ResourcesCondition;
import com.jd.management.dao.ResourcesDao;
import com.jd.management.domain.Resources;
import com.jd.management.service.ResourcesService;

/**
 * 资源服务实现
 * @author jiaodong
 */
@Service("resourcesService")
public class ResourcesServiceImpl implements ResourcesService {


	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(ResourcesServiceImpl.class);
	/**
	 * the ResourcesDao
	 */
	@Resource
	private ResourcesDao resourcesDao;
	
	
	
	/*===============================================================================*/
	/*                                以下是增删改查方法
	/*===============================================================================*/
	/**
	 * 获取资源
	 * @param id
	 * @return the Resources
	 */
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public Resources getResources(Long id) {
		Resources resources = resourcesDao.getResourcesById(id);
		return resources;
	}
	/**
	 * 插入资源
	 * @param resources
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Integer insertResources(Resources resources) {
		Date date = new Date();
		resources.setYn(1);
		resources.setCreateTime(date);
		resources.setUpdateTime(date);
		return resourcesDao.insertResources(resources);
	}
	/**
	 * 更新资源
	 * @param resources
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Integer updateResources(Resources resources) {
		resources.setUpdateTime(new Date());
		return resourcesDao.updateResources(resources);
	}
	/**
	 * 删除资源
	 * @param id
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Integer deleteResources(Long id) {
		return resourcesDao.deleteResources(id);
	}
	
	/**
	 * 查询资源
	 * 
	 * @param resourcesCondition
	 * @return
	 */
	@Override
	public List<Resources> findResourcesList(ResourcesCondition resourcesCondition) {
		return resourcesDao.findResourcesList(resourcesCondition);
	}

	/*===============================================================================*/
	/*                                以下是get/set方法
	/*===============================================================================*/
	/**
	 * @return the resourcesDao
	 */
	public ResourcesDao getResourcesDao() {
		return this.resourcesDao;
	}
	
	/**
	 * @param resourcesDao the resourcesDao to set
	 */
	public void setResourcesDao(ResourcesDao resourcesDao) {
		this.resourcesDao = resourcesDao;
	}
	

}
