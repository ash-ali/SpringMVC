<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- test5 -->
	<a href="springmvc/test5/1">test5----PathVariable</a>
	<br>

	<a href="springmvc/test4">test4----RequestParam</a>
	<br>
	
	<a href="springmvc/testparams?user=linjie">testparams----params</a>
	<br>

	<a href="springmvc/pppaaaoooqqq/test3">RequestMappingTest  hhhhh</a>
	<br> 

	<!-- test2 -->
	 <form action="springmvc/test2" method="GET">
		<input type="text" name="test">
		<input type="submit" value="submit">
	</form>
	<br> 
	
	<!-- test -->
	<!-- 因为RequestMapping同时修饰类,所有请求的路径需要加上修饰类的路径 -->
	 <a href="springmvc/test">RequestMappingTest  GOGOGO</a> 
</body>
</html>