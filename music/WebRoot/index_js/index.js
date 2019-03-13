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
	
	$("#top>div").mouseenter(function() {
		$(this).css("background-color", "red");
	});
	$("#top>div").mouseleave(function() {
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
//	验证码
	$("#button").click(function(){
		var text = $("#data_code").text();
		var code = $("#code").val();
		if (text != code) {
			$("#login>font").text("*验证码错误*");
			return false;
		}
	});
	
	$("#button").
});