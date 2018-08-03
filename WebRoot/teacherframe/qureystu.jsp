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
    <%@ taglib prefix="s" uri="/struts-tags" %>
  <body>
  <s:set name="t" value="#request.t"></s:set>
  <s:set name="topic" value="#request.topic"></s:set>
	<div class="layui-layout layui-layout-admin">
   <div class="layui-body">
    <fieldset class="layui-elem-field">
  <legend>查询学生个人信息</legend>
  <div class="layui-field-box">
	<form method="post" action="queryStuinfo" class="layui-form">
 
      <div class="layui-form-item">
    <div class="layui-input-inline">
      <input type="text" name="info" required lay-verify="required" placeholder="请输入搜素信息" autocomplete="off" class="layui-input">
      </div>
      </div>
      
   
      
      <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="formDemo">搜索</button>
    </div>
  </div>
		</form>
	
	</div>
	<script type="text/javascript" src="layui.js"></script>
	<script type="text/javascript" src="login.js"></script>
 </fieldset>
 </div>
 </div>
    
  </body>
</html>
