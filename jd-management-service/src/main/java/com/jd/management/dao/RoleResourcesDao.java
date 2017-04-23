package com.jd.management.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jd.management.common.Page;
import com.jd.management.condition.RoleResourcesCondition;
import com.jd.management.domain.RoleResources;

/**
 * 角色-资源关系Dao
 * @author jiaodong
 * @Date 2017-01-06 15:05:16
 */
@Repository("roleResourcesDao")
public class RoleResourcesDao extends BaseDao {

	/**
	 * 获取角色-资源关系
	 * @param id
	 * @return the RoleResources
	 */
	public RoleResources getRoleResourcesById(Long id) {
		return getSqlSession().selectOne(this.getSqlId("getRoleResourcesById"), id);
	}

	/**
	 * 插入角色-资源关系
	 * @param roleResources
	 */	 
	public Integer insertRoleResources(RoleResources roleResources) {
		return getSqlSession().insert(this.getSqlId("insertRoleResources"), roleResources);
	}
	/**
	 * 更新角色-资源关系
	 * @param roleResources
	 */
	public Integer updateRoleResources(RoleResources roleResources) {
		return getSqlSession().update(this.getSqlId("updateRoleResources"), roleResources);
	}
	/**
	 * 删除角色-资源关系
	 * @param id
	 */
	public Integer deleteRoleResources(Long id) {
		return getSqlSession().update(this.getSqlId("deleteRoleResources"), id);
	}
	/**  
	* @Description: 按条件获取角色-资源关系列表
	* @param page
	* @param user
	* @return 
	*/
	//public List findRoleResourcesList(@Param("page")Page page,@Param("po")RoleResourcesCondition roleResourcesCondition) {}
}
