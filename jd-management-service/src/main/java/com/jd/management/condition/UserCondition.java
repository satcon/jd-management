package com.jd.management.condition;

import java.io.Serializable;

import java.lang.Long;
import java.lang.String;
import java.util.Date;
import java.sql.Timestamp;

/**
 * 用户
 * @org ${entityMeta.projectMeta.domainName}
 * @author jiaodong
 * @Date 2017-01-06 15:05:16
 */
public class UserCondition extends BaseCondition implements Serializable {

    private static final long serialVersionUID = 1L;
	
	/**
	 * 唯一标识
	 */
	private String id;
 	
	/**
	 * 用户编码
	 */
	private String userCode;
 	
	/**
	 * 用户名称
	 */
	private String userName;
 	
	/**
	 * 固定电话
	 */
	private String telephone;
 	
	/**
	 * 手机号
	 */
	private String mobilePhone;
 	
	/**
	 * 电子邮件
	 */
	private String email;
 	
	/**
	 * 状态：0-离职，1-正常
	 */
	private String status;
 	
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
	 * @return the userCode
	 */
	public String getUserCode() {
		return userCode;
	}
	
	/**
	 * @param userCode the userCode to set
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	
	
	
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
	
	/**
	 * @return the mobilePhone
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}
	
	/**
	 * @param mobilePhone the mobilePhone to set
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	
	
	
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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