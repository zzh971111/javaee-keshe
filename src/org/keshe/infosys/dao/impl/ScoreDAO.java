package org.keshe.infosys.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.keshe.infosys.dao.BaseDAO;
import org.keshe.infosys.dao.IScoreDAO;
import org.keshe.infosys.vo.Score;


public class ScoreDAO extends BaseDAO implements IScoreDAO{
	
	public List getScorePaging(int currentPage,int pageSize){
		Session session=getSession();
		Query query=session.createQuery("from Score s");
		int startRow=(currentPage-1)*pageSize;
		query.setFirstResult(startRow);
		query.setMaxResults(pageSize);
		List Score=query.list();
		session.close();
		return Score;
	}
	
	public int getTotalbyScore(){
		Session session=getSession();
		Query query=session.createQuery("from Score s");
		List Score=query.list();
		int totalSize=Score.size();
		session.close();
		return totalSize;
	}
	
	public void updateScore(  String stuid,String stuname, String topicname, Integer score, String teachname){
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		
      Query query=session.createQuery("update Score s set stuname=? where stuid like ?");
      query.setString(0, stuname);
      query.setString(1, stuid);
      query.executeUpdate();
      
      query=session.createQuery("update Score s set topicname=? where stuid like ?");
      query.setString(0, topicname);
      query.setString(1, stuid);
      query.executeUpdate();
      
      query=session.createQuery("update Score s set score=? where stuid like ?");
      query.setInteger(0, score);
      query.setString(1, stuid);
      query.executeUpdate();
      
      query=session.createQuery("update Score s set topicname=? where stuid like ?");
      query.setString(0, teachname);
      query.setString(1, stuid);
      query.executeUpdate();
      
		tx.commit();
		session.close();
	}
	
	public void deleteScore(String stuid){
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		Query query = session.createQuery("delete Score s where stuid like ?");
		 query.setString(0, stuid);
		 query.executeUpdate();
        tx.commit();
		session.close();
	}
	
	public List getScore(String stuid){
		Session session=getSession();
		Query query=session.createQuery("from Score s where stuid like ?");
		query.setString(0,stuid);
		List score=query.list();
		session.close();
		return score;
	}
	
	public void addScore(Score score){
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		session.save(score);
		tx.commit();
		session.close();
	}
	
	public List queryScore(String info){
		Session session=getSession();
		Query query = session.createQuery("from Score s where stuid like :name1 or stuname like :name2 or " +
				                           "topicname like :name3 or score like :name4 or teachname like :name5");
		query.setString("name1", "%"+info+"%");
		query.setString("name2", "%"+info+"%");
		query.setString("name3", "%"+info+"%");
		query.setString("name4", "%"+info+"%");
		query.setString("name5", "%"+info+"%");
		List score=query.list();
		session.close();
		return score;
	}
}
