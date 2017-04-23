package com.jd.management.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jd.management.common.Page;
import com.jd.management.condition.RoleCondition;
import com.jd.management.domain.Role;

/**
 * 角色Dao
 * @author jiaodong
 * @Date 2017-01-06 15:05:16
 */
@Repository("roleDao")
public class RoleDao extends BaseDao {

	/**
	 * 获取角色
	 * @param id
	 * @return the Role
	 */
	public Role getRole(Long id) {
		return getSqlSession().selectOne(this.getSqlId("getRoleById"), id);
	}

	/**
	 * 插入角色
	 * @param role
	 */	 
	public Integer insertRole(Role role) {
		return getSqlSession().insert(this.getSqlId("insertRole"), role);
	}
	/**
	 * 更新角色
	 * @param role
	 */
	public Integer updateRole(Role role) {
		return getSqlSession().update(this.getSqlId("updateRole"), role);
	}
	/**
	 * 删除角色
	 * @param id
	 */
	public Integer deleteRole(Long id) {
		return getSqlSession().update(this.getSqlId("deleteRole"), id);
	}
	/**  
	* @Description: 按条件获取角色列表
	* @param page
	* @param user
	* @return 
	*/
	//public List findRoleList(@Param("page")Page page,@Param("po")RoleCondition roleCondition);
}
