$(function(){
	$("#nextone").attr("disabled",true);
	$("#nexttwo").attr("disabled",true);
	$("#phone").blur().css("border","1px solid red");

	

	$('#phone').focus(function(){
		$(this).css("border","1px solid #ccc");
	});
	
	$('#phone').keyup(function(){
		$("#nextone").css("pointer-events","none");
		var phone=$(this).val();
		var param={
				val_phone:phone	
		};
		$.ajax({
			url:"user_veriphone?phone="+phone,
			type:"post",
			data:param,
			dataType:"json",
			success:function(data,textStatus){
				if(data.result=="Y"){

					$('#nb').val("该手机号已被注册").css("pointer-events","none");
					$('#yzm').attr("disabled",true);
					$('#nextone').attr("disabled",true);
				}
				if(data.result=="N"){

					$('#nb').val("获取验证码").css("pointer-events","auto");
					$('#yzm').attr("disabled",false);
					$('#nextone').attr("disabled",false);
				}

			},
			error:function(data,textSStatus){
				alert('失败');
				return false;
			}
		});
	});
	
	
	$("#nb").click(function(){
		
		var dh=$("#phone").val();
		s=/^[0-9]+$/;
		p=/[a-zA-Z]+/;	     
		if(p.test(dh)==true){
			alert("请输入正确的电话号码");
			return false;
		}
		if(dh==""){
			alert("请输入电话号码");
			return false;		
		}

		if(dh.length!=11||!s.test(dh)){
			alert("请输入正确的电话号码");
			return false;
		}

		function jump(count) {
			window.setTimeout(function(){
				count--;
				if(count > 0) {
					$('#nb').val(count).attr("disabled",true).css("color","red");
					$("#phone").attr("disabled",true);
					jump(count);
				} else {
					$('#nb').val("获取验证码").attr("disabled",false).css("color","black");
					$("#phone").attr("disabled",false);
				}
			}, 1000);
		}
		jump(60);
		
		var ii=dh;   	   	
		var pse={
				pop:ii
		};

		$.ajax({
			url:"user_sms?huo="+ii,
			type:"post",
			dataType:"json",
			success:function(data,textStatus){
				//alert("成功");												
			},
			error:function(data,textStatus){
				alert("失败");
				return false;
			}
		});
	});

			

	$('#username').keyup(function(){
		var name=$(this).val();

		p=/^[0-9a-zA-Z]+$/;		
		if(p.test(name)==false){
			$('#tips').text("请输入字母或数字").css("color","red").fadeIn(3000);
			$('#password').attr("disabled",true);
			$('#repassword').attr("disabled",true);
			return false;
		}else{
			$('#password').attr("disabled",false);
			$('#repassword').attr("disabled",false);
		}
		

//		alert(name);
		var param={
				val_name:name	
		};
		$.ajax({
			url:"user_verify?name="+name,
			type:"post",
			data:param,
			dataType:"json",
			success:function(data,textStatus){
				if(data.result=="Y"){
					$('#tips').text("该用户名已存在").css("color","red").fadeIn();
					$('#password').attr("disabled",true);
					$('#repassword').attr("disabled",true);
				}
				if(data.result=="N"){
					$('#tips').text("可注册").css("color","green").fadeOut();
					$('#password').attr("disabled",false);
					$('#repassword').attr("disabled",false);

				}
				return false;
			},
			error:function(data,textSStatus){
				alert('失败');
				return false;
			}
		});
	});



	$("#repassword").keyup(function(){
		if($(this).val()!=$("#password").val()){
			$("#pd").html("×").css("color","red").fadeIn();
			$('#zc').attr('disabled',true);
			$('#nexttwo').attr('disabled',true);
			return false;
		}

		if($(this).val()==$("#password").val()){
			$("#pd").html("√").css("color","green").fadeOut(3000);
			$('#zc').attr('disabled',false);
			$('#nexttwo').attr('disabled',false);
			return false;
		}
	});

	if($("#repassword").val()==""){
		$('#zc').attr('disabled',true);
	}

	$('#zc').click(function(){
		var na=$('#username').val();
		var ps=$('#password').val();
		var ph=$('#phone').val();;
		alert(na+ps+ph);
		var params ={
				username:na,
				password:ps,
				phonenumber:ph
		};

		$.ajax({
			url:"user_register",
			type:"post",
			data:params,
			dataType:"json",
			success:function(data,textStatus){
				window.location.href="index.jsp";				
			},error:function(data,textStatus){
				alert("失败");
				return false;
			}
		});
	});
	
	$("#yzm").keyup(function(){		
		var s=$("#yzm").val();
		var ha=s;   	   	
		var pse={
				pop:ha
		};
		$.ajax({			
			url:"user_veryzm?rc="+ha,
			type:"post",
			data:pse,
			dataType:"json",
			
			success:function(data,textStatus){
				if(data.result=="cuo"){											
					$("#nextone").attr('disabled',true);
					$("#pd").text("×").css("color","red").fadeIn(3000);
					return false;
					}
					if(data.result=="dui"){
						$("#pd").text("√").css("color","green").fadeOut(3000);
						$("#nextone").attr('disabled',false);	
						$("#nextone").css("pointer-events","auto");
					}											
			},
			error:function(data,textStatus){
				alert("失败");
				return false;
			}
		});

	});
	

	
	$("#username").change(function(){
		if($(this).val().length>6){
//			$(this).css("border","1px solid red");
			$("#password").click(function(){
				$("#username").focus();
			});
			$("#repassword").click(function(){
				$("#username").focus();			
			});		
			alert('不能超过6个字符');			
		}else{
			$("#password").click(function(){
				$(this).focus();
			});
			$("#repassword").click(function(){
				$(this).focus();			
			});
		}
	});
	
	$('#check').change(function(){
		var check=$(this).is(":checked");
		if(check==true){
			$('#zc').css("pointer-events","auto");
		}else{
			$('#zc').css("pointer-events","none");
		}
	});
	
});
