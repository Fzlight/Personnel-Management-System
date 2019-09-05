package com.resume.service;

import java.util.List;

import com.resume.po.Dept;

public interface DeptService {

	List<Dept> findAll();

	Dept findById(Integer deptId);

}
