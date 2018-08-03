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
  <s:set name="teachinfo" value="#request.teachinfo"></s:set>
	<div class="layui-layout layui-layout-admin">
   <div class="layui-body">
    <fieldset class="layui-elem-field">
  <legend>个人信息</legend>
  <div class="layui-field-box">
	<form method="post" action="updateTeach" class="layui-form">
	 <div class="layui-form-item">
    <label class="layui-form-label">教师编号:</label>
    <div class="layui-input-block">
      <s:property value="#t.teachid"/>
    </div>
  </div>
 
      <div class="layui-form-item">
    <label class="layui-form-label">教师姓名:</label>
    <div class="layui-input-inline">
      <input type="text" name="teachinfo.teachname" required lay-verify="required" value="<s:property value="#t.teachname"/>" autocomplete="off" class="layui-input">
      </div>
      </div>
      
       <div class="layui-form-item">
    <label class="layui-form-label">密码:</label>
    <div class="layui-input-inline">
      <input type="text" name="teachinfo.teachpwd" required lay-verify="required" value="<s:property value="#t.teachpwd"/>" autocomplete="off" class="layui-input">
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
