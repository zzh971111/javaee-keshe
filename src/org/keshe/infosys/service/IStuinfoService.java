package org.keshe.infosys.service;

import java.util.List;

public interface IStuinfoService {
	public List getAllStuinfo();//得到所有的学生信息
	public List getStuinfoPaging(int currentPage,int pageSize);//分页得所有的学生信息
	public int getTotalbyStuinfo();//得到学生信息记录的总数目
	public void updateStuinfo(String stuid, String stuname, String studpwd, String class_);//修改学生信息
	public List getStuinfo(String stuid);//得到某个学生的信息
	public void deleteStuinfo(String stuid);//删除学生信息
	public List queryStuinfo(String info);//查询学生信息
	
}
