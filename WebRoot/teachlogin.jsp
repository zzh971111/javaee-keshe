<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
	<title>教师登录</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">
	<link rel="stylesheet" href="css/layui.css" media="all" />
	<link rel="stylesheet" href="css/login.css" media="all" />

  </head>
  
  <body>
   <div class="video_mask"></div>
	<div class="login">
	    <h1>软件工程课程设计信息管理系统</h1>
	    <form method="post" action="teachlogin" class="layui-form">
	    	<div class="layui-form-item">
				<input class="layui-input" name="teachinfo.teachid" placeholder="ID" lay-verify="required" type="text" autocomplete="off">
		    </div>
		    <div class="layui-form-item">
				<input class="layui-input" name="teachinfo.teachpwd" placeholder="PASSWORD" lay-verify="required" type="password" autocomplete="off">
		    </div>
		    <div class="layui-form-item form_code">
				
			<div class="code"></div>
		    </div>
			<button class="layui-btn login_btn" lay-submit="" lay-filter="login">教师登录</button>
						
		</form>
	</div>
	<script type="text/javascript" src="layui.js"></script>
	<script type="text/javascript" src="login.js"></script>
  </body>
</html>
