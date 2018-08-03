package org.keshe.infosys.action;

	  
	import java.io.File;  
	import java.io.FileInputStream;  
	import java.io.FileOutputStream;  
import org.apache.struts2.ServletActionContext;  
import org.keshe.infosys.service.IUploadService;
import org.keshe.infosys.vo.Upload;
	  
import com.opensymphony.xwork2.ActionSupport;  
	  
	public class uploadAction extends ActionSupport {  
	      
	    private File file;  
	    //文件名称  
	    private String fileFileName;  
	      
	    //文件类型  
	    private String fileContentType;  
	    //注意：文件名称和文件类型的名称前缀必须相同，  
	    
	    private IUploadService uploadService;
	      
	    @Override  
	    public String execute() throws Exception{     
	          System.out.println("运行到上传Action");
	        //获取需要上传文件的文件路径  
	        File uploadFile=new File(ServletActionContext.getServletContext().getRealPath("uploadFile"));
	        System.out.println("获得上传路径");
	        System.out.println("上传路径="+uploadFile);
	        //判断文件是否上传，如果上传的话将会创建该目录  
	        if(!uploadFile.exists()){  
	            uploadFile.mkdir(); //创建该目录 
	            System.out.println("目录创建成功");
	        }  
	        
	      
	        System.out.println("开始读入文件");
	         System.out.println("file.length()="+file.length());
	         System.out.println("file.getName()="+file.getName());
	        //第一种文件上传的方法  
	        //声明文件输入流，为输入流指定文件路径  
	        FileInputStream input=new FileInputStream(file);
	        System.out.println("文件读入成功");
	      
	        //获取输出流，获取文件的文件地址及名称  
	        FileOutputStream out=new FileOutputStream(uploadFile + "\\" +fileFileName);
	        System.out.println("fileFileName="+fileFileName);
	        
	        
	        //将文件名称与数据存入数据库
	        Upload upload=new Upload();
	        upload.setName(fileFileName);
	        upload.setUrl(uploadFile.getCanonicalPath());
	        uploadService.saveUpload(upload);
	        
	        
	        try{  
	            byte[] b=new byte[1024];//每次写入的大小  
	            int i=0;  
	            while((i=input.read(b))>0){  
	                out.write(b,0,i);  
	            }  
	        }catch(Exception e){  
	            e.printStackTrace();  
	        }finally{  
	            input.close();  
	            out.close();  
	        }  
	        return "success";  
	    }  
	 
	    
	   
	    
	    
	    //get、set方法
	    public File getFile() {  
	        return file;  
	    }  
	  
	    public void setFile(File file) {  
	        this.file = file;  
	    }  
	  
	    public String getFileFileName() {  
	        return fileFileName;  
	    }  
	    
	  
	    public void setFileFileName(String fileFileName) {  
	        this.fileFileName = fileFileName;  
	    }  
	  
	    public String getFileContentType() {  
	        return fileContentType;  
	    }  
	  
	    public void setFileContentType(String fileContentType) {  
	        this.fileContentType = fileContentType;  
	    }



		public IUploadService getUploadService() {
			return uploadService;
		}

		public void setUploadService(IUploadService uploadService) {
			this.uploadService = uploadService;
		}  
	  
	}  
