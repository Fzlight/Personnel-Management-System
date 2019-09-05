package com.resume.po;

import java.io.Serializable;

public class Admin {
	
	private Integer adminId;	//管理员编号
	private String adminName;	//管理员姓名
	private String adminPwd;	//管理员密码
	
	//生成的get/set方法
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPwd() {
		return adminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}

}
