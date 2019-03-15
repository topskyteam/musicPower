<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'recommend.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="index_css/recommend.css">
<script type="text/javascript" src="index_js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="index_js/easySlider1.7.js"></script>
<script type="text/javascript" src="index_js/recommend.js"></script>
</head>

<body>
	<div class="top">
		<div id="slider">
			<ul class="slides">
				<li><a href=""><img class="responsive" src="index_img/12.jpg"></a>
				</li>
				<li><a href=""><img class="responsive" src="index_img/13.png"></a>
				</li>
				<li><a href=""><img class="responsive" src="index_img/9.jpg"></a>
				</li>
				<li><a href=""><img class="responsive" src="index_img/12.jpg"></a>
				</li>
			</ul>
		</div>
	</div>
</body>
</html>
