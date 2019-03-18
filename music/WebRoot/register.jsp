<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" media="screen" href="css/css.css" />
	<script type="text/javascript" src="register_js/jquery-3.3.1.min.js"></script>
	<style type="text/css">
		#nb{
			cursor: pointer;

		}
	</style>
  </head>
  
  <body>    	

    <div style="display:none"><p></p> <p></p> <p></p> <p></p></div> <form id="msform">

	<ul id="progressbar">
		<li class="active">电话号码注册</li>
		<li>设置密码</li>
		<li>注册协议</li>
	</ul>
	
	<fieldset>
		<h2 class="fs-title">电话号码验证</h2>
		<h3 class="fs-subtitle">第一步</h3>
		<input type="text" name="phonenumber" id="phone" placeholder="输入手机号码" />
		
		<!-- <font id="nb">获取验证码</font> -->
		<input type="button" id="nb" value="获取验证码"/>
		<input type="text" name="yzm" id="yzm" placeholder="输入验证码" />
		<input type="button" name="next" id="nextone" class="next action-button" value="下一步" />
	</fieldset>
	<fieldset>
		<h2 class="fs-title">设置密码</h2>
		<h3 class="fs-subtitle">第二步</h3>
		<input type="text" name="username" id="username" placeholder="输入用户名" /><b id="tips" style="font-size:15px;"></b>
		<input type="password" name="password" id="password" placeholder="输入密码" />
		<b id="rs"></b>
		<input type="password" name="password" id="repassword" placeholder="确认密码" />
		
		<input type="button" name="next"  id="nexttwo"  class="next action-button" value="下一步" />
	</fieldset>
	<fieldset>
		<h2 class="fs-title">注册协议</h2>
		<h3 class="fs-subtitle">第三步</h3>
		<textarea name="address" placeholder="Address" style="width:350px;height:225px;resize: none;font-size: 13px;" readonly="readonly">
该音乐播放器，作用除了听歌、搜歌、收藏歌曲外，还可以注册账号，在此基础上，你还可以充值会员，这样你就可以听任意歌曲；本项目的首页还增加了歌手推荐、歌曲推荐和音乐排行榜；对于你特别喜欢的或者曲风一样的一些歌曲，你还可以把他们单独放在一个歌单里面，这样就可以在想听哪种类型的歌曲就听哪一种；当然，必不可少的管理员肯定是有的，他的作用是在发现用户存在一些不当行为时，适时的制止；并且管理员需要随时更新本项目的首页的一些推荐。
		</textarea>
		<input type="checkbox" id="check"/>确定阅读并同意该协议！<br/>
		<input type="submit" name="submit" class="submit action-button" id="zc" value="注册" />
	</fieldset>
</form>   
	  <b id="pd"></b>	
	<script type="text/javascript" src="register_js/register.js"></script>
	<script src="register_js/jquery.easing.min.js" type="text/javascript"></script>
	<script src="register_js/jQuery.time.js" type="text/javascript"></script>
  </body>
</html>
