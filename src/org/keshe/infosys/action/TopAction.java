package org.keshe.infosys.action;


import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.keshe.infosys.service.ITopService;
import org.keshe.infosys.vo.Topicinfo;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TopAction extends ActionSupport{
	protected ITopService topService;
	private Integer currentPage=1;
	private Topicinfo topic;
	private String info;
	private String topicid;
	
		
		public String getTop() throws UnsupportedEncodingException{
			topicid=new String(topicid.getBytes("ISO-8859-1"),"UTF-8");
			System.out.println("topicid="+topicid);
			List top=topService.getTop(topicid);
			Topicinfo t=(Topicinfo)top.get(0);
			Map request=(Map)ActionContext.getContext().get("request");
			request.put("t", t);
			return SUCCESS;
		}
		
		public String updateTop(){
			topService.updateTop(topicid, topic.getTopicname(), topic.getDetail());
			return SUCCESS;
		}
		
		public String deleteTop(){
			topService.deleteTop(topicid);
			return SUCCESS;
		}
		
		public String addTop(){
			topService.addTop(topic);
			return SUCCESS;
		}
		
		//查询题目信息
				public String querytop(){
					System.out.println("运行到查询Action");
					List topic=topService.querytop(info);
					Map request=(Map)ActionContext.getContext().get("request");
					request.put("topic", topic);
					System.out.println("查询Action运行结束");
					return SUCCESS;
				}
		
        //get、set方法
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


		public Topicinfo getTopic() {
			return topic;
		}


		public void setTopic(Topicinfo topic) {
			this.topic = topic;
		}


		public String getTopicid() {
			return topicid;
		}


		public void setTopicid(String topicid) {
			
			this.topicid = topicid;
		}

		public String getInfo() {
			return info;
		}

		public void setInfo(String info) {
			this.info = info;
		}
		
}
