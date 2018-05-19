<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	当前时间：${requestScope.now}<br> 
<%-- 	modelandview::<br>
	当前时间：${requestScope.now}<br> 
	
	model::<br>
	${requestScope.name}<br> 	
	${requestScope.time }<br>
	
	map::<br>
	${requestScope.name}<br>
	
	sessionattributes::<br> --%>
	request name:${requestScope.name }<br>
	session name:${sessionScope.name }<br><br><br>
	
	request nameasasd:${requestScope.nameasasd }<br>
	session nameasasd:${sessionScope.nameasasd }<br><br><br>
	
	request age:${requestScope.age }<br>
	session age:${sessionScope.age }<br><br><br>
	
	request weight:${requestScope.weight }<br>
	session weight:${sessionScope.weight }<br><br><br> 

<%-- 	${requestScope.name}<br> 	
	${requestScope.time }<br>
	${requestScope.age }<br> --%>
	
	${requestScope.name}<br>
</body>
</html>