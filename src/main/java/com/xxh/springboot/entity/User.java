package com.xxh.springboot.entity;

import java.sql.Timestamp;
import java.util.Date;

public class User {

	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 手机号码
	 */
	private String userPhone;
	/**
	 * 注册时间
	 */
	private Date registerTime;
	/**
	 * 用户状态
	 */
	private Integer userStatus;
	/**
	 * 版本
	 */
	private Integer versionNO;
	
	private String remarks;
	
	private Date createTime;
	public User() {
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	public Integer getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}
	public Integer getVersionNO() {
		return versionNO;
	}
	public void setVersionNO(Integer versionNO) {
		this.versionNO = versionNO;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", userPhone="
				+ userPhone + ", registerTime=" + registerTime + ", userStatus=" + userStatus + ", versionNO="
				+ versionNO + ", remarks=" + remarks + ", createTime=" + createTime + "]";
	}






	
	
}
