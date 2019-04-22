<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>login</title>
</head>
<body>
<!-- 
	当前路径：  http://localhost:8080/springMVC02/login1.jsp
	目标路径：http://localhost:8080/springMVC02/login1.do
 -->
	<form action="study/login2.do" method="post">
		username: <input type="text" name="username"/>
        <br/>
        password: <input type="password" name="pwd"/>
        <br/>
        <input type="submit" value="login"/>
	</form>
</body>
</html>