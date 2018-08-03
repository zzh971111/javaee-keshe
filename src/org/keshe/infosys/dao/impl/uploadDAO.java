package org.keshe.infosys.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.keshe.infosys.dao.BaseDAO;
import org.keshe.infosys.dao.IuploadDAO;
import org.keshe.infosys.vo.Upload;

public class uploadDAO extends BaseDAO implements IuploadDAO {
	
	
	public void saveUpload(Upload upload){
		System.out.println("运行到上传Dao");
		System.out.println("upload.getName()="+upload.getName());
		System.out.println("upload.getUrl()="+upload.getUrl());
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		session.save(upload);
		System.out.println("Dao运行结束");
		tx.commit();
		session.close();
	}

}
