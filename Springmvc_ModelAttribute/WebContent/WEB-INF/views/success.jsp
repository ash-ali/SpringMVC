<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>浅然的专栏——修改成功</title>
</head>
<body>
	<h1>修改完成后的个人信息情况</h1>
	userID:${requestScope.id }<br><br>
	userName:${requestScope.username }<br><br>
	userPassword:${requestScope.password }<br><br>
	userEmail:${requestScope.email }<br><br>
</body>
</html>