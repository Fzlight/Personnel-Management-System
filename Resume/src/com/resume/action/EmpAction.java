package com.resume.action;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.resume.dao.DeptDao;
import com.resume.po.Dept;
import com.resume.po.Employee;
import com.resume.service.DeptService;
import com.resume.service.EmployeeService;
import com.resume.service.impl.EmployeeServiceImpl;

public class EmpAction extends ActionSupport implements ModelDriven<Employee>,RequestAware {
	 private EmployeeService employeeService ;
	 private DeptService deptService ;
	 private Employee employee = new Employee();
	 private Map<String,Object> request;
	 private Integer deptId;
	 public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	private ActionContext ac ;
	 
	 
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	
	public Employee getModel() {
		return employee;
	}
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	public void setDeptService(DeptService deptService) {
		this.deptService = deptService;
	}
	
	public String showList() {
		List<Employee> list = employeeService.findAll();
		request.put("listEmp", list);
		return "list";
	}
	public String queryByName() {
		List<Employee> list = employeeService.findByName(employee);
		request.put("listEmp", list);
		return "list";
	}

	public String addEmp() {
		request.put("listDept", deptService.findAll());
		return "addEmp";
	}
	
	public String updateEmp() {
		request.put("listDept", deptService.findAll());
		employee = employeeService.findById((Integer)request.get("empId"));
		System.out.println(employee.getEmpName());
		ac = ActionContext.getContext();
		ac.put("updateName",employee.getEmpName());
		ac.put("updateSalary",employee.getSalary());
		return "updateEmp";
	}
	
	public String deleteEmp() {
		employeeService.deleteEmp(employee);
		return showList();
	}
	
	public String saveEmp() {
		Dept dept = deptService.findById(deptId);
		employee.setDept(dept);
		employeeService.saveEmp(employee);
		System.out.println(employee.getEmpName()+"-----"+employee.getDept()+"-----"+employee.getSalary());
		return showList();
	}

	public String updateEmpData() {
		Dept dept = deptService.findById(deptId);
		employee.setDept(dept);
		employeeService.updateEmp(employee);
		return "index";
	}
}
