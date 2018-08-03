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
     <%@ taglib prefix="s" uri="/struts-tags" %>
</head>
<body class="layui-layout-body">
<s:set name="teachinfo" value="#session['teachinfo']"></s:set>
 <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
      <li class="layui-nav-item"><a href="teacherframe/content.jsp" target="iframeContent">首页</a></li>
      <li class="layui-nav-item"><a href="teacherframe/getTeach.jsp" target="iframeContent">个人信息</a></li>
        <li class="layui-nav-item layui-nav-itemed">
          <a class="" href="javascript:;">学生信息管理</a>
          <dl class="layui-nav-child">
          
            
            <dd><a href="teacherframe/qureystu.jsp" target="iframeContent">查询学生信息</a></dd>
            <dd><a href="teacherframe/stuinfo.jsp" target="iframeContent">学生信息管理</a></dd>
            
          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;">学生成绩管理</a>
          <dl class="layui-nav-child">
            <dd><a href="teacherframe/qureyscore.jsp" target="iframeContent">查询学生成绩</a></dd>
            <dd><a href="teacherframe/addScore.jsp" target="iframeContent">添加学生成绩</a></dd>
            <dd><a href="teacherframe/score.jsp" target="iframeContent">学生成绩管理</a></dd>
            
            
          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;">题目信息管理</a>
          <dl class="layui-nav-child">
            
            <dd><a href="teacherframe/topicinfo.jsp" target="iframeContent">题目信息管理</a></dd>
            <dd><a href="teacherframe/qureytop.jsp" target="iframeContent">题目信息查询</a></dd>
             <dd><a href="teacherframe/addTop.jsp" target="iframeContent">添加课设题目</a></dd>
            <dd><a href="choice.jsp" target="iframeContent">选题情况一览表</a></dd>
            
          </dl>
          <li class="layui-nav-item">
          <a href="javascript:;">课程设计文档管理</a>
          <dl class="layui-nav-child">
            <dd><a href="downlist" target="iframeContent">课程设计文档一览表</a></dd>
            <dd><a href="up_down/upload.jsp" target="iframeContent">课程设计文档上传</a></dd>
           </dl>   
        </li>
       
        <li class="layui-nav-item"><a href="notice.jsp"  target="iframeContent">系统通知/公告</a></li>
      </ul>
    </div>
  </div>


<script src="layui.js"></script>
<script>
//JavaScript代码区域
layui.use('element', function(){
  var element = layui.element;
  
});
</script>
</body>
</html>