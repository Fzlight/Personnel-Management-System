package com.resume.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.resume.dao.AdminDao;
import com.resume.po.Admin;

public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {

	public void saveAdmin(Admin admin) {
		getHibernateTemplate().save(admin);
	}

	public Admin find(Admin admin) {
		List<Admin> ad = getHibernateTemplate().findByExample(admin);
		if(ad.size()==0) {
			return  null;
		}else {
		return ad.get(0);
	}
	}
}
