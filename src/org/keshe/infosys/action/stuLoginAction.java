package org.keshe.infosys.action;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.keshe.infosys.dao.*;
import org.keshe.infosys.service.IChoiceService;
import org.keshe.infosys.service.IScoreService;
import org.keshe.infosys.service.IStuLoginService;
import org.keshe.infosys.service.IStuinfoService;
import org.keshe.infosys.service.ITopService;
import org.keshe.infosys.util.Pager;
import org.keshe.infosys.vo.Score;
import org.keshe.infosys.vo.Stuinfo;
import org.keshe.infosys.vo.Topicinfo;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.*;
import org.springframework.context.support.*;

public class stuLoginAction extends ActionSupport{
	private IStuinfoService stuinfoService;
	protected IChoiceService choiceService;
	protected ITopService topService;
	protected IScoreService  scoreService;
	protected IStuLoginService stuloginService;
	
	private Integer currentPage=1;
	private Stuinfo stuinfo;
	
	//登录
	@Override
	public String execute() throws Exception{
		boolean validated=false;
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Stuinfo s=stuloginService.login(stuinfo.getStuid(), stuinfo.getStudpwd());
		if(s!=null)
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
	
	public String getstuinfo(){
		List stuinFo=stuinfoService.getStuinfo(stuinfo.getStuid());
		Stuinfo s=(Stuinfo)stuinFo.get(0);
		stuinfo=(Stuinfo)stuinFo.get(0);
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("s", s);
		return SUCCESS;
	}
	
	public String updateStuinfo() throws Exception{
		stuinfoService.updateStuinfo(stuinfo.getStuid(), stuinfo.getStuname(),stuinfo.getStudpwd(), stuinfo.getClass_());
		return SUCCESS;
	}
	
	//得到个人选题的信息
		public String getChoice1(){
			List stuinFo=stuinfoService.getStuinfo(stuinfo.getStuid());
			stuinfo=(Stuinfo)stuinFo.get(0);

            if(stuinfo.getTopstate().equals("0")){
            	Map request=(Map)ActionContext.getContext().get("request");
            	request.put("stuinfo", stuinfo);
            }
            else{
    	        List choice=choiceService.getChoice();
    			Map request=(Map)ActionContext.getContext().get("request");
    			
    			for (int i = 0; i < choice.size(); i++) {  
    			 Object[] hql_result_arr = (Object[]) choice.get(i);//取其中一行的查询结果  
    	         //将查询结果分成两半，分别转化为相应的实体  
    	         Topicinfo t = (Topicinfo) hql_result_arr[0]; 
    	         Stuinfo s=(Stuinfo) hql_result_arr[1]; 
    	         if(s.getStuid().equals(stuinfo.getStuid())){
    	        	 request.put("topicinfo", t);
    	 			request.put("stuinfo", s);
    	         }
    			}	
            }
    	return SUCCESS;
		}
		
		 //选题
		public String selectTop() throws UnsupportedEncodingException{
			String topicname=new String(stuinfo.getTopicname().getBytes("ISO-8859-1"),"UTF-8");
			choiceService.selectTop(stuinfo.getStuid(), topicname);
			return SUCCESS;
		}
		
		//分页显示所有题目信息(学生端)
				public String browseTopPaging() throws Exception{
					List stuinfo1=stuinfoService.getStuinfo(stuinfo.getStuid());
					Stuinfo s=(Stuinfo)stuinfo1.get(0);
					int totalSize=topService.getTotalbyTop();
					Pager pager=new Pager(currentPage,totalSize);
					List top=topService.getTopPaging(currentPage, pager.getPageSize());
					Map request=(Map)ActionContext.getContext().get("request");
					request.put("top", top);
					request.put("pager",pager);
					request.put("topstate",s.getTopstate());
					return SUCCESS;
				}
				
				//分页显示所有题目信息(教师端)
				public String browseTOpPaging() throws Exception{
					int totalSize=topService.getTotalbyTop();
					Pager pager=new Pager(currentPage,totalSize);
					List top=topService.getTopPaging(currentPage, pager.getPageSize());
					Map request=(Map)ActionContext.getContext().get("request");
					request.put("top", top);
					request.put("pager",pager);
					return SUCCESS;
				}
				
				//获得学生成绩信息
				public String getScoer(){		
					List stuinfo1=stuinfoService.getStuinfo(stuinfo.getStuid());
					Stuinfo s=(Stuinfo)stuinfo1.get(0);
					List score= scoreService.getScore(s.getStuid());
					Score sc=(Score)score.get(0);
					Map request=(Map)ActionContext.getContext().get("request");
					request.put("score", sc);
					return SUCCESS;
				}
		
		
	//get、set方法
	public IStuinfoService getStuinfoService() {
		return stuinfoService;
	}


	public void setStuinfoService(IStuinfoService stuinfoService) {
		this.stuinfoService = stuinfoService;
	}


	public Stuinfo getStuinfo() {
		return stuinfo;
	}
	public void setStuinfo(Stuinfo stuinfo) {
		this.stuinfo = stuinfo;
	}

	public IChoiceService getChoiceService() {
		return choiceService;
	}

	public void setChoiceService(IChoiceService choiceService) {
		this.choiceService = choiceService;
	}

	public ITopService getTopService() {
		return topService;
	}

	public void setTopService(ITopService topService) {
		this.topService = topService;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public IScoreService getScoreService() {
		return scoreService;
	}

	public void setScoreService(IScoreService scoreService) {
		this.scoreService = scoreService;
	}

	public IStuLoginService getStuloginService() {
		return stuloginService;
	}

	public void setStuloginService(IStuLoginService stuloginService) {
		this.stuloginService = stuloginService;
	}
	

}
