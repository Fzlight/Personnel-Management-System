package com.resume.service.impl;

import com.resume.dao.AdminDao;
import com.resume.po.Admin;
import com.resume.service.AdminService;

public class AdminServiceImpl implements AdminService{
	private AdminDao adminDao ;
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	public Admin login(Admin admin) {
		return adminDao.find(admin);
	}
	public void saveAdmin(Admin admin) {
		adminDao.saveAdmin(admin);
	}

}
