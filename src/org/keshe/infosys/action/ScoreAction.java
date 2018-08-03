package org.keshe.infosys.action;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.keshe.infosys.service.IScoreService;
import org.keshe.infosys.util.Pager;
import org.keshe.infosys.vo.Score;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ScoreAction extends ActionSupport{
	protected IScoreService scoreService;
	private Integer currentPage=1;
	private String stuid;
	private Score sco;
	private String info;
	
	
	//分页显示所有成绩信息
	public String browseScorePaging() throws Exception{
		int totalSize=scoreService.getTotalbyScore();
		Pager pager=new Pager(currentPage,totalSize);
		List score=scoreService.getScorePaging(currentPage, pager.getPageSize());
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("score", score);
		request.put("pager",pager);
		return SUCCESS;
	}
	
	public String updateScore() throws Exception{
		scoreService.updateScore(stuid, sco.getStuname(),sco.getTopicname(), sco.getScore(), sco.getTeachname());
		return SUCCESS;
	}
	
	public String getscore() throws UnsupportedEncodingException{
		stuid=new String(stuid.getBytes("ISO-8859-1"),"UTF-8");
		List score=scoreService.getScore(stuid);
		Score s=(Score)score.get(0);
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("s", s);
		return SUCCESS;
	}
	
	public String deleteScore() throws UnsupportedEncodingException{
		stuid=new String(stuid.getBytes("ISO-8859-1"),"UTF-8");
		scoreService.deleteScore(stuid);
		return SUCCESS;
	}
	
	public String addScore(){
		System.out.println("添加运行到Action");
		scoreService.addScore(sco);	
		System.out.println("添加Action运行结束");
		return SUCCESS;
	}
	
	//查询成绩信息
	public String qureyscore(){
		System.out.println("运行到查询Action");
		List s=scoreService.queryScore(info);
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("s", s);
		System.out.println("查询Action运行结束");
		return SUCCESS;
	}

	
	//get、set方法
	public IScoreService getScoreService() {
		return scoreService;
	}

	public void setScoreService(IScoreService scoreService) {
		this.scoreService = scoreService;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Score getSco() {
		return sco;
	}

	public void setSco(Score sco) {
		this.sco = sco;
	}

	public String getStuid() {
		return stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	
}
