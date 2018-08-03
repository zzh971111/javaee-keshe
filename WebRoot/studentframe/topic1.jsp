<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>软件工程课程设计信息管理系统</title>
  <link rel="stylesheet" href="css/layui.css">
	

  </head>
  
   <body>
   <div class="layui-layout layui-layout-admin">
 <div class="layui-body">
  <table class="layui-table" border="1" cellpadding="20" text-align="center" > 
  <thead>
    <tr >
      <td width="80" align="center" ><strong>课程设计题目编号</strong></td>
      <td width="120" align="center" ><strong>课程设计题目</strong></td>
      <td width="150" align="center"><strong>课程设计题目信息</strong></td>
    </tr> 
  </thead>
  <tbody>
   <%@ taglib prefix="s" uri="/struts-tags" %>
    <s:action name="browseTopPaging1" ></s:action>
    <s:set name="topstate" value="#request.topstate"></s:set>
    <s:iterator value="#request['top']" id="top">
			<tr>
				    <td align="center"><s:property value="#top.topicid"/></td>
					<td align="center"><s:property value="#top.topicname"/></td>
					<td><s:property value="#top.detail"/></td>
					
					<s:if test="#topstate==0">
					<td><a href="selectTop?stuinfo.topicname=<s:property value="#top.topicname"/>" target="iframeContent" class="layui-btn">选题</a></td>
					</s:if>
				</tr>	
					
		</s:iterator>
			</tbody>
  </table>
    <div style="text-align:center">
    <table class="layui-table" lay-even="" lay-skin="nob">
    <tbody>
		
				<s:set name="pager" value="#request.pager"/>
				<s:if test="#pager.hasFirst">
					 
				</s:if>
				<s:if test="#pager.hasPrevious">
					<td align="center"><a href="browseTopPaging1?currentPage=1">首页</a>
					<a href="browseTopPaging1?currentPage=<s:property value="#pager.currentPage-1"/>">
						&nbsp;&nbsp;&nbsp;上一页
					</a></td>
				</s:if>
				<s:if test="#pager.hasNext">
					<br>
				
				<td align="center"  ><a href="browseTopPaging1?currentPage=<s:property value="#pager.currentPage+1"/>">
						下一页&nbsp;&nbsp;&nbsp;
					</a>当前第<s:property value="#pager.currentPage"/>页，总共<s:property value="#pager.totalPage"/>页
				<a href="browseTopPaging1?currentPage=<s:property value="#pager.totalPage"/>">
						&nbsp;&nbsp;&nbsp;尾页
					</a></td>
				</s:if>
				<s:if test="#pager.hasLast">
				</s:if>
				
			</tbody>
				
</table>
</div>
</div>
</div>
  </body>

</html>
