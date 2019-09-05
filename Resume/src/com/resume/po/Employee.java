package com.resume.po;
/*
 * 员工实体类
 * */
public class Employee {
	private Integer empId;	//员工的编号
	private String empName;	//员工的姓名
	private String salary;	//员工工资
	
	private Dept dept;	//多对一，多个员工对应一个部门
	
	
	//生成get/set方法
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
