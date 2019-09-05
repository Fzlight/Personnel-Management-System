package com.resume.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.resume.dao.EmployeeDao;
import com.resume.po.Employee;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {
	public List<Employee> findAll() {		
		return (List<Employee>) getHibernateTemplate().find("from Employee");
	}

	public List<Employee> findByName(Employee employee) {
		
		return getHibernateTemplate().findByExample(employee);
	}

	public Employee findById(int id) {
		
		return getHibernateTemplate().get(Employee.class, id);
	}

	public void save(Employee employee) {
		getHibernateTemplate().save(employee);
		getHibernateTemplate().flush();
	}

	public void delete(Employee employee) {
		getHibernateTemplate().delete(employee);
	}

	public void updateEmp(Employee employee) {
		getHibernateTemplate().update(employee);
	}
  }