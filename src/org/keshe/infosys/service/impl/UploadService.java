package org.keshe.infosys.service.impl;

import org.keshe.infosys.dao.IuploadDAO;
import org.keshe.infosys.service.IUploadService;
import org.keshe.infosys.vo.Upload;

public class UploadService implements IUploadService{
	IuploadDAO  uploadDAO;

	public void saveUpload(Upload upload){
		uploadDAO.saveUpload(upload);
	}
	
	
	//get、set方法
	public IuploadDAO getUploadDAO() {
		return uploadDAO;
	}

	public void setUploadDAO(IuploadDAO uploadDAO) {
		this.uploadDAO = uploadDAO;
	}
}
