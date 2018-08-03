package org.keshe.infosys.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.keshe.infosys.dao.BaseDAO;
import org.keshe.infosys.dao.IStuinfoDAO;
import org.keshe.infosys.vo.Stuinfo;

public class StuinfoDAO extends BaseDAO implements IStuinfoDAO{
	public List getAllStuinfo(){
		Session session=getSession();
		Query query=session.createQuery("from Stuinfo s");
		List stuinfo=query.list();
		session.close();
		return stuinfo;
	}
	
	public List getStuinfoPaging(int currentPage,int pageSize){
		Session session=getSession();
		Query query=session.createQuery("from Stuinfo s");
		int startRow=(currentPage-1)*pageSize;
		query.setFirstResult(startRow);
		query.setMaxResults(pageSize);
		List stuinfo=query.list();
		session.close();
		return stuinfo;
	}
	
	public int getTotalbyStuinfo(){
		Session session=getSession();
		Query query=session.createQuery("from Stuinfo s");
		List stuinfo=query.list();
		int totalSize=stuinfo.size();
		session.close();
		return totalSize;
	}
	
	public List getStuinfo(String stuid){
		Session session=getSession();
		Query query=session.createQuery("from Stuinfo s where stuid like ?");
		query.setString(0, stuid);
		List stuinfo=query.list();
		session.close();
		return stuinfo;
	}
	
	public void updateStuinfo(String stuid, String stuname, String studpwd, String class_){
		Session session=getSession();
		Transaction tx=session.beginTransaction();
        Stuinfo s=(Stuinfo)session.get(Stuinfo.class, stuid);
		s.setStuname(stuname);
		s.setStudpwd(studpwd);
		s.setClass_(class_);
		session.save(s);
		tx.commit();
		session.close();
	}
	
	public void deleteStuinfo(String stuid){
		Session session=getSession();
		Transaction tx=session.beginTransaction();
        Stuinfo s=(Stuinfo)session.get(Stuinfo.class, stuid);
        session.delete(s);
        tx.commit();
		session.close();
	}
	
	public List queryStuinfo(String info){
		Session session=getSession();
		Query query = session.createQuery("from Stuinfo s where stuid like :name1 or stuname like :name2 or " +
				                           "class_  like :name3 or topicname like:name4 or score like:name5");
		query.setString("name1", "%"+info+"%");
		query.setString("name2", "%"+info+"%");
		query.setString("name3", "%"+info+"%");
		query.setString("name4", "%"+info+"%");
		query.setString("name5", "%"+info+"%");
		List stuinfo=query.list();
		session.close();
		return stuinfo;
	}

	
	
}
