package com.jd.management.service;

import com.jd.management.common.Page;
import com.jd.management.condition.RoleCondition;
import com.jd.management.domain.Role;
/**
 * 角色服务 
 * @author jiaodong
 */
public interface RoleService {

	/**  
	 * 添加角色
	 * @param role
	 */
	public Integer insertRole(Role role);
	/**  
	 * 更新角色
	 * @param role
	 */
	public Integer updateRole(Role role);
	/**  
	 * 删除角色
	 * @param id 
	 */
	public Integer deleteRole(Long id);
	/**  
	 * 获取角色
	 * @param id
	 * @return 
	 */
	public Role getRole(Long id);
	
	/**  
	 * 查找角色分页数据
	 * @param page
	 * @param roleCondition
	 * @return 
	 */
	public Page findRoleList(Page page,RoleCondition roleCondition);
	 
}
