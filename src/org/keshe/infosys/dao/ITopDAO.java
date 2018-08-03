package org.keshe.infosys.dao;

import java.util.List;

import org.keshe.infosys.vo.Topicinfo;

public interface ITopDAO {
	public List getTopPaging(int currentPage,int pageSize);//分页得所有的题目信息
	public int getTotalbyTop();//得到题目信息记录的总数目
	public List getTop(String topicid);//得到某个题目信息
	public void updateTop( String topicid, String topicname, String detail);//修改题目信息
	public void deleteTop(String topicid);//删除题目信息
	public void addTop(Topicinfo topicinfo);//增加题目信息
	public List querytop(String info);//查询题目信息
}
