package org.keshe.infosys.action;


import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 文件下载
 * 1.显示所有要下载文件的列表
 * 2.文件下载
 */
public class DownAction extends ActionSupport{

    /**
     * 1.显示所有要下载文件的列表
     */
    public String list() throws Exception{
    	System.out.println("运行到list");
        //得到upload目录路径
        String path = ServletActionContext.getServletContext().getRealPath("/uploadFile");
        System.out.println("path="+path.length());
        //目录对象
        File file = new File(path);
        //得到所有要下载的文件的文件名
        String[] fileNames = file.list();
        System.out.println("fileNames.length"+fileNames.length);
      System.out.println("fileNames="+fileNames[1]);
        //保存
        ActionContext ac = ActionContext.getContext();
        //得到代表request的map
        //这种形式也是Ok的ac.getContextMap();
        Map<String,Object> request = (Map<String, Object>) ac.get("request");
        request.put("fileNames", fileNames);

        return "list";
    }

    /**
     * 2.文件下载
     */
    //2.1.获取要下载的文件的文件名
    private String fileName;
    public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
        //鼠标移至下载处，显示的文件名使用的是get方式提交，所以要解决中文乱码问题
        try {
            fileName = new String(fileName.getBytes("ISO8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        //处理好的文件名，赋值
        this.fileName = fileName;
        System.out.println("fileName1="+fileName);
    }
    //2.2.下载提交的业务方法（在struts.xml中配置返回stream）
    public String down() throws Exception{
    	System.out.println("运行到2.2Action");
        return "download";
    }
    //2.3.返回文件流的方法
    //getAttrInputStream显而易见是getter方法，所以attrInputStream是一个属性
    public InputStream getAttrInputStream(){
        return ServletActionContext.getServletContext().getResourceAsStream("/uploadFile/"+fileName);
    }
    //2.4.下载显示的文件名（浏览器显示的文件名）
    public String getDownFileName(){
    	System.out.println("已运行getDownFileName");
        //需要进行中文编码
        try {
            fileName = URLEncoder.encode(fileName,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("fileName1="+fileName);
        return fileName;
    }
}