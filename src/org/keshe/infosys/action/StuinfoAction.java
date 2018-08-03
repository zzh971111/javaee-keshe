package org.keshe.infosys.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


import org.keshe.infosys.service.IStuinfoService;
import org.keshe.infosys.util.Pager;
import org.keshe.infosys.vo.Stuinfo;

public class StuinfoAction extends ActionSupport {
	protected IStuinfoService stuinfoService;
	private Integer currentPage=1;
	private Stuinfo stu;
	private String stuid;
	private String info;

    
	//显示所有的学生信息
	public String browseStuinfo() throws Exception{
		List stuinfo=stuinfoService.getAllStuinfo();
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("stuinfo", stuinfo);
		return SUCCESS;
	}
	
	//分页显示所有学生信息
	public String browseStuinfoPaging() throws Exception{
		int totalSize=stuinfoService.getTotalbyStuinfo();
		Pager pager=new Pager(currentPage,totalSize);
		List stuinfo=stuinfoService.getStuinfoPaging(currentPage, pager.getPageSize());
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("stuinfo", stuinfo);
		request.put("pager",pager);
		return SUCCESS;
	}
	
	public String deleteStuinfo(){
		stuinfoService.deleteStuinfo(stuid);
		return SUCCESS;
	}
	
	public String getstuinfo(){
		List stuinfo=stuinfoService.getStuinfo(stuid);
		Stuinfo s=(Stuinfo)stuinfo.get(0);
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("s", s);
		return SUCCESS;
	}
	
	public String updateStuinfo() throws Exception{
		stuinfoService.updateStuinfo(stuid, stu.getStuname(), stu.getStudpwd(), stu.getClass_());
		return SUCCESS;
	}
	
	//查询学生信息
		public String queryStuinfo(){
			List stuinfo=stuinfoService.queryStuinfo(info);
			Map request=(Map)ActionContext.getContext().get("request");
			request.put("stuinfo", stuinfo);
			return SUCCESS;
		}


	public IStuinfoService getStuinfoService() {
		return stuinfoService;
	}

	public void setStuinfoService(IStuinfoService stuinfoService) {
		this.stuinfoService = stuinfoService;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Stuinfo getStu() {
		return stu;
	}

	public void setStu(Stuinfo stu) {
		this.stu = stu;
	}

	public String getStuid() {
		return stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	
}
