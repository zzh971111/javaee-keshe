package org.keshe.infosys.service.impl;

import org.keshe.infosys.dao.IregisterDAO;
import org.keshe.infosys.service.IRegisterService;
import org.keshe.infosys.vo.Stuinfo;

public class RegisterService implements IRegisterService {
	IregisterDAO registerDAO;
	
	public void save(Stuinfo stuinfo){
		registerDAO.save(stuinfo);
		
	}
	
	public IregisterDAO getRegisterDAO() {
		return registerDAO;
	}

	public void setRegisterDAO(IregisterDAO registerDAO) {
		this.registerDAO = registerDAO;
	}
	
	

}
