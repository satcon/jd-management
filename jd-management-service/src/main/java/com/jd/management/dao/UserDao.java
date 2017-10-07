package com.jd.management.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jd.management.common.Page;
import com.jd.management.condition.UserCondition;
import com.jd.management.domain.User;

/**
 * 用户Dao
 * @author jiaodong
 * @Date 2017-01-06 15:05:16
 */
@Repository("userDao")
public class UserDao extends BaseDao {

	/**
	 * 获取用户
	 * @param id
	 * @return the User
	 */
	public User getUserById(Long id) {
		return getSqlSession().selectOne(this.getSqlId("getUserById"), id);
	}

	/**
	 * 插入用户
	 * @param user
	 */	 
	public Integer insertUser(User user) {
		return getSqlSession().insert(this.getSqlId("insertUser"), user);
	}
	/**
	 * 更新用户
	 * @param user
	 */
	public Integer updateUser(User user) {
		return getSqlSession().update(this.getSqlId("updateUser"), user);
	}
	/**
	 * 删除用户
	 * @param id
	 */
	public Integer deleteUser(Long id) {
		return getSqlSession().update(this.getSqlId("deleteUser"), id);
	}
	/**  
	* 按条件分页获取用户列表
	* @param userCondition
	* @return
	*/
	public List<User> findUserList(UserCondition userCondition) {
	    return getSqlSession().selectList(this.getSqlId("findUserList"), userCondition);
    }

    /**
     * 查询总数
     *
     * @param userCondition
     * @return
     */
    public Integer countUserList(UserCondition userCondition) {
        return getSqlSession().selectOne(this.getSqlId("countUserList"), userCondition);
    }
}
