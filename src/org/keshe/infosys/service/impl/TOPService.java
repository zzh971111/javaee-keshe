package org.keshe.infosys.service.impl;

import java.util.List;
import org.keshe.infosys.dao.ITopDAO;
import org.keshe.infosys.service.ITopService;
import org.keshe.infosys.vo.Topicinfo;

public class TOPService implements ITopService {
	private ITopDAO topDAO; //属性TopDAO
	
	//分页得所有的题目信息
	public List getTopPaging(int currentPage,int pageSize){
		return topDAO.getTopPaging(currentPage, pageSize);
	}
	
	//得到题目信息记录的总数目
	public int getTotalbyTop(){
		return topDAO.getTotalbyTop();
	}
	
	//得到某个题目信息
	public List getTop(String topicid){
		return topDAO.getTop(topicid);
	}
	
	//修改题目信息
	public void updateTop( String topicid, String topicname, String detail){
		topDAO.updateTop(topicid, topicname, detail);
	}
	
	//删除学生信息
	public void deleteTop(String topicid){
		topDAO.deleteTop(topicid);
	}
	
	//添加题目信息
	public void addTop(Topicinfo topicinfo){
		topDAO.addTop(topicinfo);
	}
	
	//查询题目信息
	public List querytop(String info){
		return topDAO.querytop(info);
	}
	
    //get、set方法
	public ITopDAO getTopDAO() {
		return topDAO;
	}

	public void setTopDAO(ITopDAO topDAO) {
		this.topDAO = topDAO;
	}
		
}
