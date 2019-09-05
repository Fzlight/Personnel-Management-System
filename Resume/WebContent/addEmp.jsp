<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加员工信息的页面</title>

<!-- 使用bootstrap优化页面 -->
<script type="text/javascript" src="resource/js/jquery.js"></script>
<script type="text/javascript" src="resource/js/bootstrap.min.js"></script>

<link href="resource/css/bootstrap.min.css" rel="stylesheet" />

<style type="text/css">
	tr th,td{text-align:center;}
</style>

</head>
<body>

<center>
<h1>企业人事管理系统</h1>
<h2>员工添加</h2>
<s:if test="#session.adminInfo != null">
<%-- <h2 align="right">欢迎您管理员：${adminInfo.adminName }</h2> --%>

<h2 align="right">欢迎您管理员：
	<s:property value="#session.adminInfo.adminName"/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<s:a href="#">退出</s:a>
</h2>

</s:if>
<s:else>
	<s:a href="login.jsp">登陆</s:a>
	<s:a href="register.jsp">注册</s:a>
</s:else>

<s:form action="SaveEmp" theme="simple" method="get">
	
	<table class="table table-striped table-bordered table-hover table-condensed">
		<tr>
			<td>员工姓名</td>
			<td>
				<s:textfield name="empName" id="empName"></s:textfield>
			</td>
		</tr>
		<tr>
			<td>员工薪资</td>
			<td>
				<s:textfield name="salary" id="salary"></s:textfield>
			</td>
		</tr>
		<tr>
			<td>部门选择</td>
			<td>
				<%-- 
				<select style="width:150px;height:26px;">
					<option value="-1">请选择</option>
					<option value="1">开发部</option>
					<option value="2">经理部</option>
					<option value="3">销售部</option>
			
				</select> 
				--%>
				
				<!-- struts2标签进行迭代输出 
				-->
				
				<s:select name="deptId" headerKey="-1" headerValue="请选择" 
					list="#request.listDept" listKey="deptId" listValue="deptName">
					
				</s:select>
				
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<s:submit value="添加员工"></s:submit>
				<a href="javascript:window.history.go(-1)" class="btn btn-default">返回上一级</a>
				<s:reset value="重置信息"></s:reset>
			</td>
		</tr>
	</table>
</s:form>

</center>

</body>
</html>