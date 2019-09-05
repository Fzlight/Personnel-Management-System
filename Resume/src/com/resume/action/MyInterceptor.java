package com.resume.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor{
	
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext ac = ActionContext.getContext();
		if("showList".equals(invocation.getProxy().getMethod())||"login".equals(invocation.getProxy().getMethod())||"register".equals(invocation.getProxy().getMethod())){
			return invocation.invoke();
		}else {
			if(ac.getSession().get("adminInfo")==null) {
				return "login";
			}else
			{
			return invocation.invoke();
			}
		}
	}

}
