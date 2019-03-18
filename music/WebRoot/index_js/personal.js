$(function() {
	$("#date").selectDate();

	$("#days").focusout(function() {
		var year = $("#year option:selected").html();
		var month = $("#month option:selected").html();
		var day = $("#days option:selected").html();
		console.log(year + month + day);
	});
	
	var sex = '&lt;%=user.getSex()%&gt;';
	var objSex = $("input[name='sex']"); 
	for (var i=0; i < objSex.length; i++) {
		if (objSex[i].value == sex) {
			objSex[i].checked = true;
		}
	}
	
});