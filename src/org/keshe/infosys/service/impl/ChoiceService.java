package org.keshe.infosys.service.impl;

import java.util.List;
import org.keshe.infosys.dao.IChoiceDAO;
import org.keshe.infosys.service.IChoiceService;

public class ChoiceService implements IChoiceService{
	private IChoiceDAO choiceDAO;
	public List getAllChoice(){
		return choiceDAO.getAllChoice();
		
	}
	public List getChoicePaging(int currentPage,int pageSize){
		return choiceDAO.getChoicePaging(currentPage, pageSize);
	}
	public int getTotalbyChoice(){
		return choiceDAO.getTotalbyChoice();
		
	}
	public List getChoice(){
		return choiceDAO.getChoice();
	}
	
	public void selectTop(String stuid, String topicname){
		choiceDAO.selectTop(stuid, topicname);
	}
	
	 public List getAllStuinfo1(){
   	   return choiceDAO.getAllStuinfo1();
      }
	//get、set方法
	public IChoiceDAO getChoiceDAO() {
		return choiceDAO;
	}
	public void setChoiceDAO(IChoiceDAO choiceDAO) {
		this.choiceDAO = choiceDAO;
	}
 

}
