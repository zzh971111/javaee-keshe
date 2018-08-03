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
	
  </head>
 
  <body>
  <table class="layui-table">
  
  <thead>
    <tr>
      <th>学号</th>
      <th>密码</th>
      <th>姓名</th>
      <th>班级</th>
      <th>课程设计题目</th>
      <th>成绩</th>
      <th></th>
    </tr> 
  </thead>
  <tbody>
   <%@ taglib prefix="s" uri="/struts-tags" %>
    <s:iterator value="#request['stuinfo']" id="stuinfo">
			
				    <tr>
				    <td><s:property value="#stuinfo.stuid"/></td>
				    <td><s:property value="#stuinfo.studpwd"/></td>
				    <td><s:property value="#stuinfo.stuname"/></td>
					<td><s:property value="#stuinfo.class_"/></td>
					<td><s:property value="#stuinfo.topicname"/></td>
					<td><s:property value="#stuinfo.score"/></td>
					
					
					<td><a href="getstuinfo?stuid=<s:property value="#stuinfo.stuid"/>" target="iframeContent" class="layui-btn">编辑</a>
					
					<a href="deleteStuinfo?stuid=<s:property value="#stuinfo.stuid"/>" target="iframeContent" class="layui-btn layui-btn-danger">删除</a></td>
					</tr>
					
		</s:iterator>
		
  	</tbody>
  </table>
  </body>

</html>

