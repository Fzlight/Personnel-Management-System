package com.resume.dao;

import java.util.List;

import com.resume.po.Dept;

public interface DeptDao {

	List<Dept> findAll();

	Dept findById(Integer deptId);

}
