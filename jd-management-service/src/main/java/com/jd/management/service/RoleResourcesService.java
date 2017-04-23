package com.jd.management.service;

import com.jd.management.common.Page;
import com.jd.management.condition.RoleResourcesCondition;
import com.jd.management.domain.RoleResources;
/**
 * 角色-资源关系服务 
 * @author jiaodong
 */
public interface RoleResourcesService {

	/**  
	 * 添加角色-资源关系
	 * @param roleResources
	 */
	public Integer insertRoleResources(RoleResources roleResources);
	/**  
	 * 更新角色-资源关系
	 * @param roleResources
	 */
	public Integer updateRoleResources(RoleResources roleResources);
	/**  
	 * 删除角色-资源关系
	 * @param id 
	 */
	public Integer deleteRoleResources(Long id);
	/**  
	 * 获取角色-资源关系
	 * @param id
	 * @return 
	 */
	public RoleResources getRoleResources(Long id);
	
	/**  
	 * 查找角色-资源关系分页数据
	 * @param page
	 * @param roleResourcesCondition
	 * @return 
	 */
	public Page findRoleResourcesList(Page page,RoleResourcesCondition roleResourcesCondition);
	 
}
