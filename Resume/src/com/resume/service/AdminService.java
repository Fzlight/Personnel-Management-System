package com.resume.service;

import com.resume.po.Admin;

public interface AdminService {

	Admin login(Admin admin);

	void saveAdmin(Admin admin);

}
