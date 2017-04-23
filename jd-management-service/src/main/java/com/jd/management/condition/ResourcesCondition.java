package com.jd.management.condition;

import java.io.Serializable;
import java.lang.String;

/**
 * 资源
 * @org ${entityMeta.projectMeta.domainName}
 * @author jiaodong
 * @Date 2017-01-06 15:05:16
 */
public class ResourcesCondition implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 唯一标识
	 */
	private String id;
 	
	/**
	 * 资源编码
	 */
	private String resourceCode;
 	
	/**
	 * 资源名称
	 */
	private String resourceName;
 	
	/**
	 * 资源类型 1:菜单资源 2:功能资源 3:虚拟资源
	 */
	private String resourceType;
 	
	/**
	 * 资源路径
	 */
	private String resourceUrl;
 	
	/**
	 * 资源Level
	 */
	private String resourceLevel;
 	
	/**
	 * 资源图标名
	 */
	private String resourceIcon;
 	
	/**
	 * 资源排序
	 */
	private String resourceOrder;
 	
	/**
	 * 资源状态
	 */
	private String status;
 	
	/**
	 * 资源描述
	 */
	private String description;
 	
	/**
	 * 资源父节点ID
	 */
	private String parentId;
 	
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
	private String yn;
 	
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
	 * @return the resourceCode
	 */
	public String getResourceCode() {
		return resourceCode;
	}

	/**
	 * @return the resourceName
	 */
	public String getResourceName() {
		return resourceName;
	}

	/**
	 * @return the resourceType
	 */
	public String getResourceType() {
		return resourceType;
	}

	/**
	 * @return the resourceUrl
	 */
	public String getResourceUrl() {
		return resourceUrl;
	}

	/**
	 * @return the resourceLevel
	 */
	public String getResourceLevel() {
		return resourceLevel;
	}

	/**
	 * @return the resourceIcon
	 */
	public String getResourceIcon() {
		return resourceIcon;
	}

	/**
	 * @return the resourceOrder
	 */
	public String getResourceOrder() {
		return resourceOrder;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the parentId
	 */
	public String getParentId() {
		return parentId;
	}

	/**
	 * @return the createTime
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * @return the updateTime
	 */
	public String getUpdateTime() {
		return updateTime;
	}

	/**
	 * @return the createUser
	 */
	public String getCreateUser() {
		return createUser;
	}

	/**
	 * @return the updateUser
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * @return the ts
	 */
	public String getTs() {
		return ts;
	}

	/**
	 * @return the yn
	 */
	public String getYn() {
		return yn;
	}

	/**
	 * @param resourceCode the resourceCode to set
	 */
	public void setResourceCode(String resourceCode) {
		this.resourceCode = resourceCode;
	}

	/**
	 * @param resourceName the resourceName to set
	 */
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	/**
	 * @param resourceType the resourceType to set
	 */
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	/**
	 * @param resourceUrl the resourceUrl to set
	 */
	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	/**
	 * @param resourceLevel the resourceLevel to set
	 */
	public void setResourceLevel(String resourceLevel) {
		this.resourceLevel = resourceLevel;
	}

	/**
	 * @param resourceIcon the resourceIcon to set
	 */
	public void setResourceIcon(String resourceIcon) {
		this.resourceIcon = resourceIcon;
	}

	/**
	 * @param resourceOrder the resourceOrder to set
	 */
	public void setResourceOrder(String resourceOrder) {
		this.resourceOrder = resourceOrder;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @param createUser the createUser to set
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	/**
	 * @param updateUser the updateUser to set
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * @param ts the ts to set
	 */
	public void setTs(String ts) {
		this.ts = ts;
	}

	/**
	 * @param yn the yn to set
	 */
	public void setYn(String yn) {
		this.yn = yn;
	}
}