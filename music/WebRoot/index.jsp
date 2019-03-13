<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="musicpower.entity.*" %>
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
	<script type="text/javascript" src="index_js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="index_js/index.js"></script>
	<link rel="stylesheet" type="text/css" href="index_css/index.css">
  </head>
  
  <body>
    <div class="top" id="top">
		<img src="index_img/logo.png">
		<div>发现音乐</div>
		<div>我的音乐</div>
		<div>朋友</div>
		<div>商城</div>
		<div>朋友圈</div>
	 	<div>会员充值</div>
	 	<div>我的收藏</div>
	 	<input type="text"  placeholder="音乐/视频/电台/用户" class="topInput" >
	 	<% if(request.getParameter("username") != null) { %>
	 		<%User user = (User)session.getAttribute("user");%>
	 	<div id="personalInformation">欢迎您,<%=user.getNickname() %></div>
	 	<% } else { %>
	 	<div id="loginUser">登录</div>
	 	<% } %>
  	</div>
  	<div class="muenBar">
  		<iframe src="discoverMusic.jsp"></iframe>
  	</div>
  	<div class="body">
  		<iframe src="recommend.jsp"></iframe>
  	</div>
  	<div id="loginBackground"></div>
  	<div id="login">
  		<div id="loginTop">
  			<font>登录</font>
  		</div>
  		<div id="close">×</div>
  		<form action="user/login_get" method="post">
  		<input type="text" name="username" placeholder="输入用户名" />
  		<input type="password" name="password" placeholder="输入密码" />
  		<div id="check-code" style="overflow: hidden;">
  			<font>点击更换验证码</font>
			<div class="code" id="data_code"></div>
			<script type="text/javascript" src="index_js/verificationCode.js"></script>
		</div>
  		<input type="text" id="code" placeholder="输入验证码"/>
  		<button id="button">登录</button>
  		</form>
  		<font></font>
  		<a href="">注册</a>
  		<a href="">忘记密码？</a>
  	</div>
  </body>
</html>
