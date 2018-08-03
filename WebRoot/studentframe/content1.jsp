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
<body >
<div class="layui-layout layui-layout-admin">
 <div class="layui-body">
    <fieldset class="layui-elem-field">
  <legend>快速使用手册</legend>
  <div class="layui-field-box">
  <font face="宋体" size="4">
    1.在首页我们为用户提供了本系统不同功能的使用帮助。
    <br/>
    <br>2.个人信息：可查看修改用户本人的基本信息。
    <br/>
    <br>3.课程设计信息：①课设题目一览表：查看所有的课程设计题目
    <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;②个人选题基本信息：可查看学生本组课程设计基本信息
    <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;③选题情况一览表：可查看所有学生课程设计的选题情况
    <br/>
    <br>4.课程设计文档上传：上传学生本组的课程设计文档
    <br/>
    <br>5.课程设计作品上传：上传学生本组的课程设计作品
    <br/>
    <br>6.查询课设成绩：可查看个人的课程设计成绩
    <br/>
    <br>7.系统操作日志：用户操作记录
    <br/>
    <br>8.系统通知/公告：发布课程设计及系统更新相关信息
    </font> 
  </div>
</fieldset>
  </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
                          软件工程课程设计信息管理系统-潘恒师、韦雪雪、张芝慧
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