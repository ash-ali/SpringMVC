<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Book Form</title>
</head>
<body>
	<div>
		<form:form commandName="book" action="/Springmvc_Demo/book_save" method="post">
			<fieldset>
				<legend>Add a book</legend>
				<p>
					<label for="category">Category:</label>
					<!-- 绑定的items数据可以是数组、集合、或Map会根据items的内容生成select里面的option选项
					，当path的值和items中的某条数据值相同的时候，对应的option为选定状态，反之为不选定状态 -->
					<form:select path="category.id" id="category"
					 	items="${categories}" itemLabel="name" itemValue="id">
					</form:select>
				</p>
				<p>
					<label for="title">Title:</label>
					<form:input path="title" id="title"/>
				</p>
				<p>
					<label for="author">Author:</label>
					<form:input path="author" id="author"/>
				</p>
				<p>
					<label for="isbn">ISBN:</label>
					<form:input path="isbn" id="isbn"/>
				</p>
				<p>
					<input id="reset" type="reset" tabindex="4">
					<input id="submit" type="submit" tabindex="5" value="Add Book">
				</p>
			</fieldset>
		</form:form>
	</div>
</body>
</html>