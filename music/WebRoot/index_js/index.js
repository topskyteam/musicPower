$(function() {
//	登录框样式
	$("#login input").focus(function() {
		$(this).css("border", "1px solid #ccc");
	});
	$("#login input").blur(function() {
		$(this).css({
			"border": "0",
			"border-bottom": "1px solid #ccc"
			});
	});
//	用户反馈样式
	$("#top>div,#close").css({
		"cursor" : "pointer",
	});
	$("#information>div").mouseenter(function() {
		$(this).css("color", "red");
	});
	$("#information>div").mouseleave(function() {
		$(this).css("color", "white");
	});
	
	$("#top>div").mouseenter(function() {
		$(this).css("background-color", "red");
	});
	$("#top>div").mouseleave(function() {
		$(this).css("background-color", "#101010");
	});
	
	$("#personalInformation").mouseenter(function() {
		$(this).css("background-color", "#101010");
	});
	$("#personalInformation").mouseleave(function() {
		$(this).css("background-color", "#101010");
	});
//	登录弹框
	$("#loginUser").click(function() {
		$("#login,#loginBackground").show();
		$("body").css({
			"pointer-events" : "none",
			"overflow-x" : "hidden",
			"overflow-y" : "hidden",
			"background" : "#ccc"
		});
		$("#login").css("pointer-events", "auto");
	});
	$("#close").click(function() {
		$("#login,#loginBackground").hide();
		$("body").css({
			"pointer-events" : "auto",
			"overflow-x" : "auto",
			"overflow-y" : "auto"
		});
	});
	
//	登录验证
	$("#button").click(function(){
		var text = $("#data_code").text();
		var code = $("#code").val();
		
		if (text != code) {
			$("#login>font").text("*验证码错误*");
			return false;
		}
		
		var u_v = $("input[name='username']").val();
		var p_v = $(":password").val();
		
		var params = {
				username : u_v,
				password : p_v
		};
		
		$.ajax({
			url: "login_getUsernameAndPassword",
			type: "post",
			data: params,
			dataType: "json",
			success:function(data, textStatus) {
				if (data.result == false) {
					$("#login>font").text("*账号或者密码错误*");
				} else if (data.result == true) {
					
					window.location.href="user/login_get";
				}
			},
			error:function(data, textStatus) {
				alert(textStatus);
				return false;
			}
		});
	});
	
	$("#quit").click(function() {
		window.location.href="";
	});
//	用户登录后功能
	$("#personalInformation,#information").mouseenter(function() {
		$("#information").show();
	});
	$("#personalInformation,#information").mouseleave(function() {
		$("#information").hide();
	});

	$("#personal").click(function() {
		var id = $(this).attr("myvalue");
		$(".muenBar").hide();
		$(".body").css("top","55px");
		$("body").css({
			"overflow-x" : "hidden",
			"overflow-y" : "hidden",
		});
		window.open("user/login_getUserById?user.getTUserId="+id,"body");
	});
	
});