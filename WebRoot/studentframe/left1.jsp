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
<body class="layui-layout-body">
 <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
      <li class="layui-nav-item"><a href="studentframe/content1.jsp " target="iframeContent">首页</a></li>
        
         <li class="layui-nav-item"><a href="getStuinfo" target="iframeContent">个人信息</a></li>
        <li class="layui-nav-item">
          <a href="javascript:;" target="iframeContent">课程设计信息</a>
          <dl class="layui-nav-child">
            <dd><a href="studentframe/topic1.jsp" target="iframeContent">课设题目一览表</a></dd>
            
            <dd><a href="studentframe/getstu1.jsp" target="iframeContent">个人选题基本信息</a></dd>
            <dd><a href="choice.jsp" target="iframeContent">选题情况一览表</a></dd>
            
          </dl>
        </li>
        <li class="layui-nav-item"><a href="up_down/upload.jsp" target="iframeContent">课程设计文档上传</a></li>
        
        <li class="layui-nav-item"><a href="studentframe/score1.jsp" target="iframeContent">查询课设成绩</a></li>
        
        <li class="layui-nav-item"><a href="notice.jsp" target="iframeContent">系统通知/公告</a></li>
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