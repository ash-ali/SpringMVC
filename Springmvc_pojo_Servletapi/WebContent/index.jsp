<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>浅然</title>
</head>
<body>
	<form action="springmvc/test">
		age:<input type="text" name="age"><br>
		name:<input type="text" name="name"><br>
		<!-- 级联属性：Student的属性teacher,teacher的属性tname和course -->
		teachername:<input type="text" name="teacher.tname"><br>
		course:<input type="text" name="teacher.course"><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>