<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jstl_form.jsp</title>
	</head>
	<body>
		<h2>if절 확인</h2>
		<form action="jstl_if.jsp">
			이름 : <input type="text" name="name"><br> 
			나이 : <input type="text" name="age"><br>
			<input type="submit" value="확인">
		</form>	
		<hr>
		<h2>choose절 확인</h2>
		<form action="jstl_choose.jsp">
			이름 : <input type="text" name="name"><br> 
			나이 : <input type="text" name="age"><br>
			<input type="submit" value="확인">
		</form>	
	</body>
</html>