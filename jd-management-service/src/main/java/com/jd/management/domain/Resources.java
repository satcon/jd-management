package com.jd.management.domain;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import java.sql.Timestamp;

/**
 * 资源
 * @author jiaodong
 */
public class Resources implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 唯一标识
	 */
	private Long id;
	
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
	private int resourceType;
	
	/**
	 * 资源路径
	 */
	private String resourceUrl;
	
	/**
	 * 资源Level
	 */
	private int resourceLevel;
	
	/**
	 * 资源图标名
	 */
	private String resourceIcon;
	
	/**
	 * 资源排序
	 */
	private int resourceOrder;
	
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
	private Long parentId;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 更新时间
	 */
	private Date updateTime;
	
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
	private Timestamp ts;
	/**
	 * 有效标识
	 */
	private int yn;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
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
	public int getResourceType() {
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
	public int getResourceLevel() {
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
	public int getResourceOrder() {
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
	public Long getParentId() {
		return parentId;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
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
	public Timestamp getTs() {
		return ts;
	}

	/**
	 * @return the yn
	 */
	public int getYn() {
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
	public void setResourceType(int resourceType) {
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
	public void setResourceLevel(int resourceLevel) {
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
	public void setResourceOrder(int resourceOrder) {
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
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
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
	public void setTs(Timestamp ts) {
		this.ts = ts;
	}

	/**
	 * @param yn the yn to set
	 */
	public void setYn(int yn) {
		this.yn = yn;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Resources [id=" + id + ", resourceCode=" + resourceCode + ", resourceName=" + resourceName
				+ ", resourceType=" + resourceType + ", resourceUrl=" + resourceUrl + ", resourceLevel=" + resourceLevel
				+ ", resourceIcon=" + resourceIcon + ", resourceOrder=" + resourceOrder + ", status=" + status
				+ ", description=" + description + ", parentId=" + parentId + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", createUser=" + createUser + ", updateUser=" + updateUser + ", ts="
				+ ts + ", yn=" + yn + "]";
	}
}