package org.keshe.infosys.service.impl;


import java.util.List;

import org.keshe.infosys.dao.IScoreDAO;
import org.keshe.infosys.service.IScoreService;
import org.keshe.infosys.vo.Score;

public class ScoreService implements IScoreService{
	private IScoreDAO scoreDAO; //属性SoreDAO
	//分页得所有的成绩信息
	public List getScorePaging(int currentPage,int pageSize){
		return scoreDAO.getScorePaging(currentPage, pageSize);
		
	}
	//得到成绩信息记录的总数目
	public int getTotalbyScore(){
		return scoreDAO.getTotalbyScore();
	}
	//修改学生成绩信息
	public void updateScore(  String stuid, String stuname,String topicname, Integer score, String teachname){
		scoreDAO.updateScore( stuid, stuname, topicname, score, teachname);
	}
	
	//得一个学生的成绩信息
	public List getScore(String stuid){
		return scoreDAO.getScore(stuid);
	}
	
	//删除学生成绩信息
	public void deleteScore(String stuid){
		scoreDAO.deleteScore(stuid);
	}
	
	//添加学生成绩信息
	public void addScore(Score score){
		scoreDAO.addScore(score);
		
	}
	
	//查询学生成绩信息信息
	public List queryScore(String info){
		return scoreDAO.queryScore(info);
	}
	
	
	//get、set方法
	public IScoreDAO getScoreDAO() {
		return scoreDAO;
	}
	public void setScoreDAO(IScoreDAO scoreDAO) {
		this.scoreDAO = scoreDAO;
	}
	
	
}
