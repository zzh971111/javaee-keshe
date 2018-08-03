package org.keshe.infosys.service.impl;

import org.keshe.infosys.dao.IteachloginDAO;
import org.keshe.infosys.service.ITeachLoginService;
import org.keshe.infosys.vo.Teachinfo;

public class TeachloginService implements ITeachLoginService {
	IteachloginDAO teachloginDAO;
	
	public Teachinfo login(String teachid,String teachpwd){
		Teachinfo teachinfo=new Teachinfo();
		teachinfo=teachloginDAO.validateTeachinfo(teachid, teachpwd);
		return teachinfo;
		
	}
	
	

	public IteachloginDAO getTeachloginDAO() {
		return teachloginDAO;
	}

	public void setTeachloginDAO(IteachloginDAO teachloginDAO) {
		this.teachloginDAO = teachloginDAO;
	}
	
	

}
