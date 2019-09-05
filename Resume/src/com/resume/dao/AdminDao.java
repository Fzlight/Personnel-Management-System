package com.resume.dao;

import com.resume.po.Admin;

public interface AdminDao {


	void saveAdmin(Admin admin);

	Admin find(Admin admin);

}
