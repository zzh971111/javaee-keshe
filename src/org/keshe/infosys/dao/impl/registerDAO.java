package org.keshe.infosys.dao.impl;
import org.keshe.infosys.dao.IregisterDAO;
import org.keshe.infosys.dao.BaseDAO;
import org.keshe.infosys.vo.Stuinfo;
import org.hibernate.*;



public class registerDAO extends BaseDAO implements IregisterDAO{
	private IregisterDAO registerDAO;

	public IregisterDAO getRegisterDAO() {
		return registerDAO;
	}

	public void setRegisterDAO(IregisterDAO registerDAO) {
		this.registerDAO = registerDAO;
	}

	public void save(Stuinfo stuinfo){
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		session.save(stuinfo);
		tx.commit();
		session.close();
		
	}

}
