package org.keshe.infosys.service.impl;

import java.util.List;
import org.keshe.infosys.dao.IStuinfoDAO;
import org.keshe.infosys.service.IStuinfoService;

public class StuinfoService implements IStuinfoService{
      private IStuinfoDAO stuinfoDAO; //属性StuinfoDAO
      public List getAllStuinfo() {
    	  return stuinfoDAO.getAllStuinfo();
      }
      
      	public List getStuinfoPaging(int currentPage,int pageSize){
      		return stuinfoDAO.getStuinfoPaging(currentPage, pageSize);
      	}
      	
       public void updateStuinfo(String stuid, String stuname, String studpwd, String class_){
      		 stuinfoDAO.updateStuinfo(stuid, stuname, studpwd, class_);
      	}
      
       public void deleteStuinfo(String stuid){
    	   stuinfoDAO.deleteStuinfo(stuid);
       }
       
       public List getStuinfo(String stuid){
    	   return stuinfoDAO.getStuinfo(stuid);
       }
       
       public List queryStuinfo(String info){
    	   return stuinfoDAO.queryStuinfo(info);
       }
       
     
       
       //get、set方法
	public IStuinfoDAO getStuinfoDAO() {
		return stuinfoDAO;
	}
	public void setStuinfoDAO(IStuinfoDAO stuinfoDAO) {
		this.stuinfoDAO = stuinfoDAO;
	}
      
	public int getTotalbyStuinfo(){
		return stuinfoDAO.getTotalbyStuinfo();
	}
      
}
