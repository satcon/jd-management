package com.jd.management.service;

import java.util.List;

import com.jd.management.common.Page;
import com.jd.management.condition.ResourcesCondition;
import com.jd.management.domain.Resources;
/**
 * 资源服务 
 * @author jiaodong
 */
public interface ResourcesService {

	/**  
	 * 添加资源
	 * @param resources
	 */
	public Integer insertResources(Resources resources);
	/**  
	 * 更新资源
	 * @param resources
	 */
	public Integer updateResources(Resources resources);
	/**  
	 * 删除资源
	 * @param id 
	 */
	public Integer deleteResources(Long id);
	/**  
	 * 获取资源
	 * @param id
	 * @return 
	 */
	public Resources getResources(Long id);
	
	/**  
	 * 查找资源分页数据
	 * @param page
	 * @param resourcesCondition
	 * @return 
	 */
	public List<Resources> findResourcesList(ResourcesCondition resourcesCondition);
	 
}
