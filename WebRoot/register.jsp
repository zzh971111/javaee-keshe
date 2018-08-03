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
    <div class="video_mask"></div>
	<div class="login">
	<h1>软件工程课程设计信息管理系统</h1>
	<form method="post" action="register" class="layui-form">
	 <div class="layui-form-item">
    <label class="layui-form-label">学号</label>
    <div class="layui-input-block">
      <input type="text" name="stuinfo.stuid" required  lay-verify="required" placeholder="请输入学号" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">密码</label>
    <div class="layui-input-inline">
      <input type="password" name="stuinfo.studpwd" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
      	</div>
      	</div>
      <div class="layui-form-item">
    <label class="layui-form-label">姓名</label>
    <div class="layui-input-inline">
      <input type="text" name="stuinfo.stuname" required lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input">
      </div>
      </div>
      <div class="layui-form-item">
    <label class="layui-form-label">班级</label>
    <div class="layui-input-inline">
      <input type="text" name="stuinfo.class_" required lay-verify="required" placeholder="请输入班级" autocomplete="off" class="layui-input">
      </div>
      </div>
      <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
		</form>
	
	</div>
	<script type="text/javascript" src="layui.js"></script>
	<script type="text/javascript" src="login.js"></script>
    
  </body>
</html>
