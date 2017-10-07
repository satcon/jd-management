package com.jd.management.service;

import com.jd.management.common.Page;
import com.jd.management.condition.UserCondition;
import com.jd.management.domain.User;
/**
 * 用户服务 
 * @author jiaodong
 */
public interface UserService {

	/**  
	 * 添加用户
	 * @param user
	 */
	public Integer insertUser(User user);
	/**  
	 * 更新用户
	 * @param user
	 */
	public Integer updateUser(User user);
	/**  
	 * 删除用户
	 * @param id 
	 */
	public Integer deleteUser(Long id);
	/**  
	 * 获取用户
	 * @param id
	 * @return 
	 */
	public User getUser(Long id);
	
	/**  
	 * 查找用户分页数据
	 * @param userCondition
	 * @return 
	 */
	public Page<User> findUserList(UserCondition userCondition);
	 
}
