package org.keshe.infosys.action;
import org.keshe.infosys.dao.*;
import org.keshe.infosys.service.IRegisterService;
import org.keshe.infosys.vo.*;
import org.springframework.context.*;
import org.springframework.context.support.*;

import com.opensymphony.xwork2.*;
public class registerAction extends ActionSupport{
	private Stuinfo stuinfo;
	protected IregisterDAO registerDAO;
	protected IRegisterService registerService;
	public String register() throws Exception{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		this.registerService.save(stuinfo);
		return SUCCESS;
	}
	public Stuinfo getStuinfo() {
		return stuinfo;
	}
	public void setStuinfo(Stuinfo stuinfo) {
		this.stuinfo = stuinfo;
	}
	public IregisterDAO getRegisterDAO() {
		return registerDAO;
	}
	public void setRegisterDAO(IregisterDAO registerDAO) {
		this.registerDAO = registerDAO;
	}
	public IRegisterService getRegisterService() {
		return registerService;
	}
	public void setRegisterService(IRegisterService registerService) {
		this.registerService = registerService;
	}
	

}
