package org.keshe.infosys.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import org.keshe.infosys.service.IChoiceService;
import org.keshe.infosys.util.Pager;
import org.keshe.infosys.vo.Stuinfo;
import org.keshe.infosys.vo.Topicinfo;

public class ChoiceAction extends ActionSupport {
	protected IChoiceService choiceService;
	private Integer currentPage=1;

	
	//显示所有的选题信息
	public String broeseChoice() throws Exception{
		List choice=choiceService.getAllChoice();
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("choice", choice);
		return SUCCESS;
	}
	
	//分页显示所有学生信息
	public String browseChoicePaging() throws Exception{
		List <Topicinfo> topicinfo = new ArrayList<Topicinfo>();  
        List <Stuinfo> stuinfo =new ArrayList<Stuinfo>(); 
		int totalSize=choiceService.getTotalbyChoice();
		Pager pager=new Pager(currentPage,totalSize);
		List choice=choiceService.getChoicePaging(currentPage, pager.getPageSize());
		
		for (int i = 0; i < choice.size(); i++) {  
            Object[] hql_result_arr = (Object[]) choice.get(i);//取其中一行的查询结果  
            //将查询结果分成两半，分别转化为相应的实体  
            Topicinfo t = (Topicinfo) hql_result_arr[0]; 
            topicinfo.add(t);
            Stuinfo s=(Stuinfo) hql_result_arr[1]; 
            stuinfo.add(s);
            //输出  
        }  
		
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("topicinfo", topicinfo);
		request.put("stuinfo", stuinfo);
		request.put("pager", pager);
		return SUCCESS;
	}
	
	
	public IChoiceService getChoiceService() {
		return choiceService;
	}
	public void setChoiceService(IChoiceService choiceService) {
		this.choiceService = choiceService;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

}
