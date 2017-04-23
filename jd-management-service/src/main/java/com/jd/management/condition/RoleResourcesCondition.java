package com.jd.management.condition;

import java.io.Serializable;

import java.lang.Long;
import java.util.Date;
import java.lang.String;
import java.sql.Timestamp;

/**
 * 角色-资源关系
 * @org ${entityMeta.projectMeta.domainName}
 * @author jiaodong
 * @Date 2017-01-06 15:05:16
 */
public class RoleResourcesCondition implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 唯一标识
	 */
	private String id;
 	
	/**
	 * 角色ID，关联t_role.id
	 */
	private String roleId;
 	
	/**
	 * 资源ID，关联t_resource.id
	 */
	private String resourcesId;
 	
	/**
	 * 创建时间
	 */
	private String createTime;
 	
	/**
	 * 更新时间
	 */
	private String updateTime;
 	
	/**
	 * 创建用户
	 */
	private String createUser;
 	
	/**
	 * 更新用户
	 */
	private String updateUser;
 	
	/**
	 * 默认时间
	 */
	private String ts;
 	
	/**
	 * 刪除标志
	 */
	private String isDelete;
 	
	/**
	 * 版本号
	 */
	private String version;
 	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
	/**
	 * @return the roleId
	 */
	public String getRoleId() {
		return roleId;
	}
	
	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	
	
	
	/**
	 * @return the resourcesId
	 */
	public String getResourcesId() {
		return resourcesId;
	}
	
	/**
	 * @param resourcesId the resourcesId to set
	 */
	public void setResourcesId(String resourcesId) {
		this.resourcesId = resourcesId;
	}
	
	
	
	
	/**
	 * @return the createTime
	 */
	public String getCreateTime() {
		return createTime;
	}
	
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	
	
	
	/**
	 * @return the updateTime
	 */
	public String getUpdateTime() {
		return updateTime;
	}
	
	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
	
	
	
	/**
	 * @return the createUser
	 */
	public String getCreateUser() {
		return createUser;
	}
	
	/**
	 * @param createUser the createUser to set
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	
	
	
	/**
	 * @return the updateUser
	 */
	public String getUpdateUser() {
		return updateUser;
	}
	
	/**
	 * @param updateUser the updateUser to set
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	
	
	
	
	/**
	 * @return the ts
	 */
	public String getTs() {
		return ts;
	}
	
	/**
	 * @param ts the ts to set
	 */
	public void setTs(String ts) {
		this.ts = ts;
	}
	
	
	
	
	/**
	 * @return the isDelete
	 */
	public String getIsDelete() {
		return isDelete;
	}
	
	/**
	 * @param isDelete the isDelete to set
	 */
	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
	
	
	
	
	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}
	
	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	
	
	
	
}