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

<title>My JSP 'personal.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="index_css/personal.css">
<script type="text/javascript" src="index_js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="index_js/distpicker.data.js"></script>
<script type="text/javascript" src="index_js/distpicker.js"></script>
<script type="text/javascript" src="index_js/personal.js"></script>
<script type="text/javascript" src="index_js/select.js"></script>

	<% User user = (User)session.getAttribute("editUser");out.print(user);%>
</head>

<body>
	<div id="all">
		<div id="body">
			<form action="user/login_edit" method="post">
			<font>个人设置</font><br /> 昵称：<input type="text" value="<%=user.getNickname() %>"/><br />
			<br /> <font id="js">介绍：</font>
			<textarea rows="9px" cols="33px" style="margin-left:50px;resize:none;"><% if(user.getIntroduce() == null) { %>什么都没留下<% } else { %><%=user.getIntroduce() %><% } %></textarea>
			<br />
			<br /> 性别：<input type="radio" name="sex" value="男" />男 
			<input type="radio" name="sex" value="女" />女 
			<input type="radio" name="sex" value="保密" checked />保密<br />
			<br /> 生日：
			<select name="year" id="year">
				<option value="">选择年份</option>
			</select>
			<select name="month" id="month">
				<option value="">选择月份</option>
			</select>
			<select id="days" class="day">
				<option value="">选择日期</option>
			</select>
			<br /><br />
			<div data-toggle="distpicker">
				 地区：<select></select> <select></select> <select></select>
			</div>
			</form>
			
			<img src="" />
		</div>
	</div>
</body>
</html>
