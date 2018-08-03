package org.keshe.infosys.service;

import org.keshe.infosys.vo.Teachinfo;

public interface ITeachLoginService {
	
	public Teachinfo login(String teachid,String teachpwd); 

}
