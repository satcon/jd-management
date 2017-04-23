package com.jd.management.service;

import com.jd.management.common.Page;
import com.jd.management.condition.RoleUserCondition;
import com.jd.management.domain.RoleUser;
/**
 * 角色-用户关系服务 
 * @author jiaodong
 */
public interface RoleUserService {

	/**  
	 * 添加角色-用户关系
	 * @param roleUser
	 */
	public Integer insertRoleUser(RoleUser roleUser);
	/**  
	 * 更新角色-用户关系
	 * @param roleUser
	 */
	public Integer updateRoleUser(RoleUser roleUser);
	/**  
	 * 删除角色-用户关系
	 * @param id 
	 */
	public Integer deleteRoleUser(Long id);
	/**  
	 * 获取角色-用户关系
	 * @param id
	 * @return 
	 */
	public RoleUser getRoleUser(Long id);
	
	/**  
	 * 查找角色-用户关系分页数据
	 * @param page
	 * @param roleUserCondition
	 * @return 
	 */
	public Page findRoleUserList(Page page,RoleUserCondition roleUserCondition);
	 
}
