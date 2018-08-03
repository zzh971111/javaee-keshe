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
  <style>  
        #iframeTop{  
            width: 100%;  
            height:55px;  
        }  
        #iframeLeft{  
            width: 11%;  
            height:900px;  
            float: left;  
        }  
        #iframeContent{  
            width: 84%;  
            height:900px;  
        }  
    </style>  
  <link rel="stylesheet" href="css/layui.css">
  
</head>
<body >
<div>

    <iframe id="iframeTop" name="iframeTop" frameborder="0" src="teacherframe/top.jsp"></iframe>  
    <iframe id="iframeLeft" name="iframeLeft" frameborder="0" style="margin-top: -0.1cm;" src="teacherframe/left.jsp"></iframe>  
    <iframe id="iframeContent" name="iframeContent" frameborder="0" style="margin-top: -0.1cm;" src="teacherframe/content.jsp"></iframe>  
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
  
  </body>
</html>
