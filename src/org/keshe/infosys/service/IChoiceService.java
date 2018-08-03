package org.keshe.infosys.service;

import java.util.List;

public interface IChoiceService {
	public List getAllChoice();//得到所有选题信息
	public List getChoicePaging(int currentPage,int pageSize);//分页得到所有的选题信息
	public int getTotalbyChoice();//得到学生信息记录的总数目
	public List getChoice();//得到个人选题信息
	public void selectTop(String stuid, String topicname);//选题
	public List getAllStuinfo1();//得到未选题的学生信息

}
