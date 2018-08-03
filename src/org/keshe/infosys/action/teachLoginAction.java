package org.keshe.infosys.action;
import java.util.List;
import java.util.Map;

import org.keshe.infosys.dao.*;
import org.keshe.infosys.service.ITeachLoginService;
import org.keshe.infosys.service.ITeachService;
import org.keshe.infosys.vo.Teachinfo;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.*;
import org.springframework.context.support.*;

public class teachLoginAction extends ActionSupport{
	private ITeachService teachService;
	private Teachinfo teachinfo;
	private ITeachLoginService teachloginService;
	private String teachid;
	
	//登录
	@Override
	public String execute() throws Exception{
		boolean validated=false;
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Teachinfo t=teachloginService.login(teachinfo.getTeachid(), teachinfo.getTeachpwd());
		if(t!=null)
		{
			validated=true;
		}
		if(validated)
		{
			
			return SUCCESS;
		}
		else
		{
			
			return ERROR;
		}
	}
	
	//获得一个老师的信息
	public String getteach(){
		teachid=teachinfo.getTeachid();
		List teachinfo=teachService.getTeach(teachid);
		Teachinfo t=(Teachinfo)teachinfo.get(0);
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("t", t);
		return SUCCESS;
	}
	
	//修改老师的信息
	public String updateTeach(){
		teachService.updateTeach(teachid,  teachinfo.getTeachname(),  teachinfo.getTeachpwd());
		return SUCCESS;
	}
	
	//get、set方法
	public ITeachService getTeachService() {
		return teachService;
	}
	public void setTeachService(ITeachService teachService) {
		this.teachService = teachService;
	}
	
	public Teachinfo getTeachinfo() {
		return teachinfo;
	}

	public void setTeachinfo(Teachinfo teachinfo) {
		this.teachinfo = teachinfo;
	}

	public String getTeachid() {
		return teachid;
	}
	public void setTeachid(String teachid) {
		this.teachid = teachid;
	}

	public ITeachLoginService getTeachloginService() {
		return teachloginService;
	}

	public void setTeachloginService(ITeachLoginService teachloginService) {
		this.teachloginService = teachloginService;
	}
	
	

}
