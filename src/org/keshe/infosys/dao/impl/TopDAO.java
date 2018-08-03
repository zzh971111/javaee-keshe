package org.keshe.infosys.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.keshe.infosys.dao.BaseDAO;
import org.keshe.infosys.dao.ITopDAO;
import org.keshe.infosys.vo.Topicinfo;

public class TopDAO extends BaseDAO implements ITopDAO{
	
	//分页得所有的题目信息
	public List getTopPaging(int currentPage,int pageSize){
		Session session=getSession();
		Query query=session.createQuery("from Topicinfo t");
		int startRow=(currentPage-1)*pageSize;
		query.setFirstResult(startRow);
		query.setMaxResults(pageSize);
		List tops=query.list();
		session.close();
		return tops;
	}
	
	//得到题目信息记录的总数目
	public int getTotalbyTop(){
		Session session=getSession();
		Query query=session.createQuery("from Topicinfo t");
		List top=query.list();
		int totalSize=top.size();
		session.close();
		return totalSize;
	}
	
	public List getTop(String topicid){
		Session session=getSession();
		Query query=session.createQuery("from Topicinfo t where topicid like ?");
		query.setString(0, topicid);
		List top=query.list();
		session.close();
		return top;
	}
	
	public void updateTop( String topicid, String topicname, String detail){
		System.out.println("运行到DAO");
		Session session=getSession();
		Transaction tx=session.beginTransaction();
        Topicinfo t=(Topicinfo)session.get(Topicinfo.class, topicid);
		t.setTopicname(topicname);
		t.setDetail(detail);
		session.save(t);
		tx.commit();
		session.close();
	}
	
	public void deleteTop(String topicid){
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		Topicinfo t=(Topicinfo)session.get(Topicinfo.class, topicid);
        session.delete(t);
        tx.commit();
		session.close();
	}
	public void addTop(Topicinfo topicinfo){
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		session.save(topicinfo);
		tx.commit();
		session.close();
	}
	
	public List querytop(String info){
		Session session=getSession();
		Query query = session.createQuery("from Topicinfo t where topicid like :name");
		query.setString("name", "%"+info+"%");
		List topic=query.list();
		if(topic.size()==0){
			query = session.createQuery("from Topicinfo t where topicname like :name");
			query.setString("name", "%"+info+"%");
			 topic=query.list();
			 if(topic.size()==0){
				 query = session.createQuery("from Topicinfo t where detail like :name");
					query.setString("name", "%"+info+"%");
					 topic=query.list();
			 }
		}
		
		session.close();
		return topic;
	}
	
}
