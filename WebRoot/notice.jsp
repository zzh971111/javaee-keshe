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

  </head>
  
  <body>
 
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
  		<legend>系统通知公告</legend>
	</fieldset>
	<ul class="layui-timeline">
 		<li class="layui-timeline-item">
    	<i class="layui-icon layui-timeline-axis"></i>
    	<div class="layui-timeline-content layui-text">
      		<h3 class="layui-timeline-title">12月27日</h3>
      		<ul>
        		<li>请于18周周五（1月5日）前提交课程设计文档。
        		
          		<br>课程设计文档以word文档形式上传。
        		</li>
      		</ul>
    	</div>
  		</li>
  		<li class="layui-timeline-item">
    	<i class="layui-icon layui-timeline-axis"></i>
    	<div class="layui-timeline-content layui-text">
      		<h3 class="layui-timeline-title">11月10日</h3>
      		
      		<ul>
        		<li>11月12日--11月15日开放选题功能，请学生们请按时选题。</li>
        		
      		</ul>
    	</div>
  		</li>
  		
    		<li class="layui-timeline-item">
      		<i class="layui-icon layui-timeline-axis"></i>
      		<div class="layui-timeline-content layui-text">
        		<div class="layui-timeline-title">过去</div>
      		</div>
    		</li>
  		</ul>  
  	
  </body>
</html>
