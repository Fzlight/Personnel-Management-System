package com.resume.po;
/*
 * Ա��ʵ����
 * */
public class Employee {
	private Integer empId;	//Ա���ı��
	private String empName;	//Ա��������
	private String salary;	//Ա������
	
	private Dept dept;	//���һ�����Ա����Ӧһ������
	
	
	//����get/set����
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	
}
