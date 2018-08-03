package org.keshe.infosys.dao;

import java.util.List;

import org.keshe.infosys.vo.Score;

public interface IScoreDAO {
	public List getScorePaging(int currentPage,int pageSize);//分页得所有的成绩信息
	public int getTotalbyScore();//得到成绩信息记录的总数目
	public void updateScore( String stuid, String stuname, String topicname, Integer score, String teachname);//修改学生成绩信息
	public List getScore(String stuid);//得一个学生的成绩信息
	public void deleteScore(String stuid);//删除学生成绩信息
	public void addScore(Score score);//添加学生成绩信息
	public List queryScore(String info);//查询学生成绩信息
}
