<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
   <title>软件工程课程设计信息管理系统</title>
    <result-type name="stream" class="org.apache.struts2.dispatcher.StreamResult"/>
	
  <meta charset="utf-8">
  <meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">
	<link rel="stylesheet" href="css/layui.css" media="all" />
	<link rel="stylesheet" href="css/register.css" media="all" />

  </head>
  
  <body>
  <div class="layui-layout layui-layout-admin">
 <div class="layui-body">
   <fieldset class="layui-elem-field">
  <legend>课程设计文档一览表</legend>
  <div class="layui-field-box">
    <table class="layui-table" align="center">
    <thead>
      <tr>
           <td>文件名</td>
            <td>操作</td>
      </tr>
      </thead>
       <%@ taglib prefix="s" uri="/struts-tags" %>
    <s:iterator value="#request['fileNames']" id="fileNames">
      <tr>

      	<td><s:property value="#fileNames"/></td>
      	<td>
      			
      			<a href="down_down?fileName=<s:property value="#fileNames"/>" class="layui-btn">下载</a>
      	</td>
      </tr>
    </s:iterator>
      </table>
      </div>
      
      
      
      </fieldset>
      </div>
      </div>
      
  </body>
</html>
