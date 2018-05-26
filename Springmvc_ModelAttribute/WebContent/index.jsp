<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>浅然的专栏——修改用户名和邮箱</title>
</head>
<body>
	<h1>修改用户名和邮箱<h1>
	<form action="springmvc/testmodelattribute">
		<input type="text" name="username" value="浅然"><br><br>
		<input type="text" name="email" value="xulinjie0105@gmail.com"><br><br>
		<input type="submit" value="submit"> 
	</form>
	
	<a href="springmvc/testmodelattribute2W">测试@ModelAttribute在请求处理方法参数中</a>
</body>
</html>