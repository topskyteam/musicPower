<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<<<<<<< HEAD
	<script type="text/javascript" src="index_js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="index_js/index.js"></script>
	<link rel="stylesheet" type="text/css" href="index_css/index.css">
	
	<% User user = (User)session.getAttribute("user");%>
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
	 	<% if(session.getAttribute("user") == null) { %>
	 	<div id="loginUser">登录</div>
	 	<% } else { %>
	 	<div id="personalInformation">
	 	欢迎您,<%=user.getNickname() %>
	 	</div>
		<%} %>
  	</div>
  	<div class="muenBar">
  		<iframe src="discoverMusic.jsp"></iframe>
  	</div>
  	<div class="body">
  		<iframe name="body" src="recommend.jsp"></iframe>
  	</div>
  	<div id="loginBackground"></div>
  	<div id="login">
  		<div id="loginTop">
  			<font>登录</font>
  		</div>
  		<div id="close">×</div>
  		<input type="text" name="username" placeholder="输入用户名" />
  		<input type="password" name="password" placeholder="输入密码" />
  		<div id="check-code" style="overflow: hidden;">
  			<font>点击更换验证码</font>
			<div class="code" id="data_code"></div>
			<script type="text/javascript" src="index_js/verificationCode.js"></script>
		</div>
  		<input type="text" id="code" placeholder="输入验证码"/>
  		<button id="button">登录</button>
  		<font></font>
  		<a href="">注册</a>
  		<a href="">忘记密码？</a>
  	</div>
	<div id="information">
		<div id="to" style="height: 0px;width: 0px;background: rgba(0,0,0,0);margin: 0 auto;"></div>
		<div>我的主页</div>
		<div>我的消息</div>
		<div>VIP会员</div>
		<% if(session.getAttribute("user") != null) { %>
		<div id="personal" myvalue="<%=user.getTUserId() %>">个人设置</div>
	 	<% }%>
		<div>实名认证</div>
		<div id="quit">退出</div>
	</div>
	<% session.invalidate();  %>
=======
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
>>>>>>> 8d64becdacb2a411b30b9080aa6d8ae30857b64d
  </body>
</html>
