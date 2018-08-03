package org.keshe.infosys.dao;

import java.util.List;

public interface ITeachDAO {
	public List getTeach(String teachid);//得一个老师的信息
	public void updateTeach(String teachid, String teachname, String teachpwd);//修改老师信息

}
