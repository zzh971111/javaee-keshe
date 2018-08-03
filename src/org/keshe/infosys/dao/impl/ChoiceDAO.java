package org.keshe.infosys.dao.impl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.keshe.infosys.dao.*;
import org.keshe.infosys.vo.Stuinfo;



public class ChoiceDAO extends BaseDAO implements IChoiceDAO {
	public List getAllChoice(){
		  Session   session = getSession();
	         Query query = session.createQuery( "from Topicinfo t,Stuinfo s where t.topicname=s.topicname");
	         List choice = query.list();
	         System. out.println(query.list().size());
	         session.close();
	         return choice;
	}
	public List getChoicePaging(int currentPage,int pageSize){
		Session session=getSession();
		Query query=session.createQuery("from Topicinfo t,Stuinfo s where t.topicname=s.topicname");
		int startRow=(currentPage-1)*pageSize;
		query.setFirstResult(startRow);
		query.setMaxResults(pageSize);
		List choice=query.list();
		
		session.close();
		return choice;
		
	}
	public int getTotalbyChoice(){
		Session session=getSession();
		Query query=session.createQuery("from Topicinfo t,Stuinfo s where t.topicname=s.topicname");
		List choice=query.list();
		int totalSize=choice.size();
		session.close();
		return totalSize;
	}
	public List getChoice(){
		Session session=getSession();
		Query query=session.createQuery("from Topicinfo t,Stuinfo s where t.topicname=s.topicname ");
		List choice=query.list();
		session.close();
		return choice;
	}
	
	public void selectTop(String stuid, String topicname){
		Session session=getSession();
		Transaction tx=session.beginTransaction();
        Stuinfo s=(Stuinfo)session.get(Stuinfo.class, stuid);
		s.setTopicname(topicname);
		s.setTopstate("1");
		session.save(s);
		tx.commit();
		session.close();
	}
	
	public List getAllStuinfo1(){
		Session session=getSession();
		Query query=session.createQuery("from Stuinfo s where topstate ='0' ");
		List stuinfo=query.list();
		session.close();
		return stuinfo;
	}

}
