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
  <legend>题目信息</legend>
  <div class="layui-field-box">
	<form method="post" action="updateTop" class="layui-form">
	 <div class="layui-form-item">
    <label class="layui-form-label">课设编号:</label>
    <div class="layui-input-block">
      <s:property value="#t.topicid"/>
    </div>
  </div>
 
      <div class="layui-form-item">
    <label class="layui-form-label">课设题目:</label>
    <div class="layui-input-inline">
      <input type="text" name="topic.topicname" required lay-verify="required" value="<s:property value="#t.topicname"/>" autocomplete="off" class="layui-input">
      </div>
      </div>
      
   
       <div class="layui-form-item layui-form-text">
    <label class="layui-form-label">课设内容:</label>
    <div class="layui-input-block">
      <input type="text" name="topic.detail" required lay-verify="required" value="<s:property value="#t.detail"/>" autocomplete="off" class="layui-textarea">
    </div>
  </div>
 

      
      <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="formDemo">修改</button>
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
