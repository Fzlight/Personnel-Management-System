package com.resume.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.resume.dao.DeptDao;
import com.resume.po.Dept;

public class DeptDaoImpl  extends HibernateDaoSupport implements DeptDao {

	public List<Dept> findAll() {		
		return (List<Dept>) getHibernateTemplate().find("from Dept") ;
	}

	public Dept findById(Integer deptId) {
		return (Dept) getHibernateTemplate().get(Dept.class, deptId);
	}

}
