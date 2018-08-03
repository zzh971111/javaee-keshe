package org.keshe.infosys.service.impl;

import java.util.List;

import org.keshe.infosys.dao.ITeachDAO;
import org.keshe.infosys.service.ITeachService;

public class TeachService implements ITeachService{
	private ITeachDAO teachDAO;
	
	//得一个老师的信息
	public List getTeach(String teachid){
		return teachDAO.getTeach(teachid);
	}
    //get、set方法
	public ITeachDAO getTeachDAO() {
		return teachDAO;
	}

	public void setTeachDAO(ITeachDAO teachDAO) {
		this.teachDAO = teachDAO;
	}
	
	//修改老师信息
	public void updateTeach(String teachid, String teachname, String teachpwd){
		teachDAO.updateTeach(teachid, teachname, teachpwd);
	}

}
