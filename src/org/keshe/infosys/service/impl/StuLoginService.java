package org.keshe.infosys.service.impl;

import org.keshe.infosys.dao.IstuloginDAO;
import org.keshe.infosys.service.IStuLoginService;
import org.keshe.infosys.vo.Stuinfo;

public class StuLoginService implements IStuLoginService {
	private IstuloginDAO stuloginDAO;
	
	public Stuinfo login(String stuid,String studpwd){
		Stuinfo stuinfo=new Stuinfo();
		stuinfo=stuloginDAO.validateStuinfo(stuid, studpwd);
		return stuinfo;
	}

	public IstuloginDAO getStuloginDAO() {
		return stuloginDAO;
	}

	public void setStuloginDAO(IstuloginDAO stuloginDAO) {
		this.stuloginDAO = stuloginDAO;
	}
	
	

}
