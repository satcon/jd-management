package com.jd.management.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jd.management.common.Page;
import com.jd.management.condition.RoleUserCondition;
import com.jd.management.domain.RoleUser;

/**
 * 角色-用户关系Dao
 * @author jiaodong
 * @Date 2017-01-06 15:05:16
 */
@Repository("roleUserDao")
public class RoleUserDao extends BaseDao {

	/**
	 * 获取角色-用户关系
	 * @param id
	 * @return the RoleUser
	 */
	public RoleUser getRoleUserById(Long id) {
		return getSqlSession().selectOne(this.getSqlId("getRoleUserById"), id);
	}

	/**
	 * 插入角色-用户关系
	 * @param roleUser
	 */	 
	public Integer insertRoleUser(RoleUser roleUser) {
		return getSqlSession().insert(this.getSqlId("insertRoleUser"), roleUser);
	}
	/**
	 * 更新角色-用户关系
	 * @param roleUser
	 */
	public Integer updateRoleUser(RoleUser roleUser) {
		return getSqlSession().update(this.getSqlId("updateRoleUser"), roleUser);
	}
	/**
	 * 删除角色-用户关系
	 * @param id
	 */
	public Integer deleteRoleUser(Long id) {
		return getSqlSession().update(this.getSqlId("deleteRoleUser"), id);
	}
	/**  
	* @Description: 按条件获取角色-用户关系列表
	* @param page
	* @param user
	* @return 
	*/
	//public List findRoleUserList(@Param("page")Page page,@Param("po")RoleUserCondition roleUserCondition) {}
}
