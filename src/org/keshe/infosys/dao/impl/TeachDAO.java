package org.keshe.infosys.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.keshe.infosys.dao.BaseDAO;
import org.keshe.infosys.dao.ITeachDAO;
import org.keshe.infosys.vo.Teachinfo;

public class TeachDAO extends BaseDAO implements ITeachDAO{
	
	public List getTeach(String teachid){
		Session session=getSession();
		Query query=session.createQuery("from Teachinfo t where teachid like ?");
		query.setString(0, teachid);
		List teachinfo=query.list();
		session.close();
		return teachinfo;
	}
	
	public void updateTeach(String teachid, String teachname, String teachpwd){
		Session session=getSession();
		Transaction tx=session.beginTransaction();
        Teachinfo t=(Teachinfo)session.get(Teachinfo.class, teachid);
		t.setTeachname(teachname);
		t.setTeachpwd(teachpwd);
		session.save(t);
		tx.commit();
		session.close();
	}
}
