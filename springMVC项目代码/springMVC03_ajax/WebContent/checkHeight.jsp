<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="js/jquery-1.11.1.js"></script>

<script type="text/javascript">
	function f1(){

		var $height=$("#selectHeight").val();
		console.log("选择的身高:" +$height);
		
		$.ajax({
			url:"heightResult.do",	
			type: "post",
			data:{"height":$height},
			dataType: "JSON",
			success: function(data){
					

					$("#result").text(data.handleResult);
					
				},

			error:function(){
					alert("服务器异常");
				}
			});

		}
	

	
</script>
</head>
<body>
	
	<form action="" method="post">
			<select name="height" id="selectHeight">
					<option>160cm</option>
					<option>170cm</option>
					<option>180cm</option>
			</select>
			<input type="button" value="提交" onclick="f1()"/>
		<br/>
		判断结果：<span  id="result"></span>	
	</form>
</body>
</html>