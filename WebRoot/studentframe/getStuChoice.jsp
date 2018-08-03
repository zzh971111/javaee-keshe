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
  <%@ taglib prefix="s" uri="/struts-tags" %>
<s:set id="stuinfo" value="#request.stuinfo"></s:set>
<s:set id="topicinfo" value="#request.topicinfo"></s:set>



  <div class="layui-layout layui-layout-admin">
   <div class="layui-body">
    <fieldset class="layui-elem-field">
  <legend>个人选题信息</legend>
  <div class="layui-field-box">
 <div class="layui-form-item">
    <label class="layui-form-label">学号:</label>
    <div class="layui-input-block">
      <s:property value="#stuinfo.stuid"/>
    </div>
  </div>
 
      <div class="layui-form-item">
    <label class="layui-form-label">姓名:</label>
    <div class="layui-input-inline">
      <s:property value="#stuinfo.stuname"/>
      </div>
      </div>
      
      <div class="layui-form-item">
    <label class="layui-form-label">班级:</label>
    <div class="layui-input-inline">
       <s:property value="#stuinfo.class_"/>
      </div>
      </div>
      
      <s:if test="#stuinfo.topstate==0">
      <div class="layui-form-item">
    <label class="layui-form-label">未选取课设。</label>
  </div>
      </s:if>
      <s:else>
      <div class="layui-form-item">
    <label class="layui-form-label">课设编号:</label>
    <div class="layui-input-block">
      <s:property value="#topicinfo.topicid"/>
    </div>
  </div>
 
      <div class="layui-form-item">
    <label class="layui-form-label">课设题目:</label>
    <div class="layui-input-inline">
      <s:property value="#topicinfo.topicname"/>
      </div>
      </div>
      
   
       <div class="layui-form-item layui-form-text">
    <label class="layui-form-label">课设内容:</label>
    <div class="layui-input-block">
      <s:property value="#topicinfo.detail"/>
    </div>
  </div>
  </s:else>
      </div>
</fieldset>
  </div>
  </div>
   
    </div>
    </div>
  </body>
</html>
