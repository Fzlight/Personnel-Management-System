package com.resume.service.impl;

import java.util.List;

import com.resume.dao.impl.EmployeeDaoImpl;
import com.resume.po.Employee;
import com.resume.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDaoImpl empDao ;
	
	public void setEmpDao(EmployeeDaoImpl empDao) {
		this.empDao = empDao;
	}

	public List<Employee> findAll() {
		return  empDao.findAll();
	}

	public List<Employee> findByName(Employee employee) {
		return empDao.findByName(employee);
	}

	public Employee findById(int id) {
		Employee e = empDao.findById(id);
		return e;
	}

	public void saveEmp(Employee employee) {
		empDao.save(employee);
	}

	public void deleteEmp(Employee employee) {
		empDao.delete(employee);
	}

	public void updateEmp(Employee employee) {
		empDao.updateEmp(employee);
	}


	

}
