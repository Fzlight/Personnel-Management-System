package com.resume.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.resume.po.Admin;
import com.resume.po.Employee;
import com.resume.service.AdminService;

public class AdminAction extends ActionSupport implements ModelDriven<Admin>,RequestAware{
	private Admin admin = new Admin();
	private AdminService adminService;
	 private Map<String,Object> request;
	 
	 
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	public Admin getModel() {
		return admin;
	}
	public void setRequest(Map<String, Object> request) {
		this.request=request;
	}
	public String login() {
		Admin info = adminService.login(admin);
		if(info==null) {
			return "login";
		}else {
			ActionContext.getContext().getSession().put("adminInfo", info);
			return "index";
		}
	}
	public String register() {
		adminService.saveAdmin(admin);
		return "login";
	}
	public String cheakout() {
		ActionContext.getContext().getSession().remove("adminInfo");
		return  "index";
	}
	
}
