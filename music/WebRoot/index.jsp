<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>音乐的力量</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="index_css/index.css">
  </head>
  
  <body>
    <div class="top" id="top">
	 <div class="logo"><img src="index_img/logo.png"></div>
	 <div>发现音乐</div>
	 <div>我的音乐</div>
	 <div>朋友</div>
	 <div>商城</div>
	 <div>音乐人</div>
	 <div>客户端</div>
	 <div>我的收藏</div>
	 <div>登录</div>
	 <div id="hidebg"></div>
	 <input type="text"  placeholder="音乐/视频/电台/用户" class="topInput" >
  </div>
  </body>
</html>
