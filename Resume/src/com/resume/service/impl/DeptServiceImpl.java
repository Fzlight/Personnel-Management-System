package com.resume.service.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.resume.dao.DeptDao;
import com.resume.dao.impl.DeptDaoImpl;
import com.resume.po.Dept;
import com.resume.service.DeptService;

public class DeptServiceImpl   implements DeptService {
	private DeptDao deptDao;

	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}

	public List<Dept> findAll() {
		
		return deptDao.findAll() ;
	}

	public Dept findById(Integer deptId) {
		return deptDao.findById(deptId);
	}

}
