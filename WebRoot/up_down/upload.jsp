<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>软件工程课程设计信息管理系统</title>
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
  <legend>上传课程设计文档</legend>
  <div class="layui-field-box">
  
   <form action="upload" method="post" enctype="multipart/form-data">  
        <input type="file" name="file" >  
        <input type="submit" name="btnUpload" value="上传" >  
    </form> 
    <script type="text/javascript" src="layui.js"></script>
	<script type="text/javascript" src="login.js"></script>
	</div>
 </fieldset> 
 </div>
 </div>
 
  </body>
</html>
