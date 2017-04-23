package com.jd.management.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jd.management.condition.ResourcesCondition;
import com.jd.management.domain.Resources;

/**
 * 资源Dao
 * @author jiaodong
 * @Date 2017-01-06 15:05:16
 */
@Repository("resourcesDao")
public class ResourcesDao extends BaseDao{

	/**
	 * 获取资源
	 * 
	 * @param id 主键ID
	 * @return the Resources
	 */
	public Resources getResourcesById(Long id) {
		return getSqlSession().selectOne(this.getSqlId("getResourcesById"), id);
	}

	/**
	 * 插入资源
	 * @param resources
	 */	 
	public Integer insertResources(Resources resources) {
		return getSqlSession().insert(this.getSqlId("insertResources"), resources);
	}
	/**
	 * 更新资源
	 * @param resources
	 */
	public Integer updateResources(Resources resources) {
		return getSqlSession().update(this.getSqlId("updateResources"), resources);
	}
	/**
	 * 删除资源
	 * @param id
	 */
	public Integer deleteResources(Long id) {
		return getSqlSession().update(this.getSqlId("deleteResources"), id);
	}
	/**  
	* @Description: 按条件获取资源列表
	* @param page
	* @param user
	* @return 
	*/
	public List<Resources> findResourcesList(ResourcesCondition resourcesCondition) {
		return getSqlSession().selectList(this.getSqlId("findResourcesList"), resourcesCondition);
	}
}
