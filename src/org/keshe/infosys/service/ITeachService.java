package org.keshe.infosys.service;

import java.util.List;

public interface ITeachService {
	public List getTeach(String teachid);//得一个老师的信息
	public void updateTeach(String teachid, String teachname, String teachpwd);//修改老师信息
}
