package org.keshe.infosys.service;

import org.keshe.infosys.vo.Stuinfo;

public interface IStuLoginService {
	public Stuinfo login(String stuid,String studpwd);

}
