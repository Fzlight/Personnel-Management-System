package com.resume.po;
/*
 * ����ʵ����
 * */
public class Dept {
	
	
	private Integer deptId; 	//��������
	private String deptName;	//���ű��
	
	//����get/set����
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
