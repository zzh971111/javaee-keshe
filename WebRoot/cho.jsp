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
  <div class="layui-layout layui-layout-admin">
 <div class="layui-body">
  <!-- 大表格 -->
  <table>
  <tr>
 
  <!-- 表格1 -->
  <td>
  <table class="layui-table">
  <thead>
    <tr>
      <th>学号</th>
      <th>姓名</th>
      <th>班级</th>
      <th>成绩</th>
    </tr> 
  </thead>
  <tbody>
   <%@ taglib prefix="s" uri="/struts-tags" %>
  
    <s:iterator value="#request['stuinfo']" id="stuinfo">
     <tr>
		            <td><s:property value="#stuinfo.stuid"/></td>
				    <td><s:property value="#stuinfo.stuname"/></td>
					<td><s:property value="#stuinfo.class_"/></td>
					<td><s:property value="#stuinfo.score"/></td>
	</tr>
		</s:iterator>
  	</tbody>
  </table>
  </td>
  
  <!-- 表格2 -->
  <td>
   <table class="layui-table">
  <thead>
    <tr>
      <th>课程设计编号</th>
      <th>课程设计题目</th>
      <th>课程设计题目信息</th>
    </tr> 
  </thead>
  <tbody>
   <%@ taglib prefix="s" uri="/struts-tags" %>
  	 <s:iterator value="#request['topicinfo']" id="topicinfo">
  	 <tr>
				    <td><s:property value="#topicinfo.topicid"/></td>
					<td><s:property value="#topicinfo.topicname"/></td>
					<td><s:property value="#topicinfo.detail"/></td>
	</tr>	
		</s:iterator>
  	</tbody>
  </table>
  </td>
  </tr>
</table>
   
   
    <table class="layui-table" lay-even="" lay-skin="nob" >
    <tbody>
				<s:set name="pager" value="#request.pager"/>
				

				<s:if test="#pager.hasFirst">
					<td width="30"><a href="browseChoicePaging?currentPage=1">首页</a></td>
				</s:if>
				<s:if test="#pager.hasPrevious">
					<td width="45" align="left"><a href="browseChoicePaging?currentPage=<s:property value="#pager.currentPage-1"/>" >
						上一页
					</a></td>
				</s:if>
				<s:if test="#pager.hasNext">
					<td width="45" ><a href="browseChoicePaging?currentPage=<s:property value="#pager.currentPage+1"/>" >
						下一页
					</a></td>
			
				<td width="130">当前第<s:property value="#pager.currentPage"/>页，总共<s:property value="#pager.totalPage"/>页</td>
				
					</s:if>
				
				<s:if test="#pager.hasLast">
					<td  ><a href="browseChoicePaging?currentPage=<s:property value="#pager.totalPage"/>">
						尾页
					</a></td>
				</s:if>
			</tbody>
				
</table>
</div>
</div>
  </body>

</html>

