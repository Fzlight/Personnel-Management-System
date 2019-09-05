package com.resume.service;

import java.util.List;

import com.resume.po.Employee;

public interface EmployeeService {
	
	//��ѯ���е�Ա����Ϣ
	public List<Employee> findAll();

	public List<Employee> findByName(Employee employee);

	public Employee findById(int id);

	public void saveEmp(Employee employee);

	public void deleteEmp(Employee employee);

	public void updateEmp(Employee employee);
}
