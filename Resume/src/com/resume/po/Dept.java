package com.resume.po;
/*
 * 部门实体类
 * */
public class Dept {
	
	
	private Integer deptId; 	//部门名称
	private String deptName;	//部门编号
	
	//生成get/set方法
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	
}
