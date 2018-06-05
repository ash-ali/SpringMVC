<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../resource/css/user.css">
<title>浅然-注册</title>
</head>
<body>
	<img src="../resource/images/qianran.jpg">
	<form:form commandName="user" action="qianran" method="post">
		<fieldset>
		<legend>用户注册</legend>
			用户名*：<form:input path="username"/><span><form:errors path="username" cssClass="error" /></span><br>
			密码*：<form:input path="password"/><span><form:errors path="password" cssClass="error"/></span><br>
			邮箱：<form:input path="email"/><span><form:errors path="email" cssClass="error"/></span><br>
			手机号*：<form:input path="phone"/><span><form:errors path="phone" cssClass="error"/></span><br>
			<input type="submit" value="注册">
		</fieldset>
	</form:form>
</body>
</html>