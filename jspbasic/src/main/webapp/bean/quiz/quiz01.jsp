<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>quiz01.jsp</title>
	</head>
	<body>
		<form action="quiz02.jsp" method="post">
			ID : <input type="text" name="id" size="20"><br>
			PW : <input type="password" name="pw" size="20"><br>
			PW 확인 : <input type="password" name="pw_check" size="20"><br>
			<input type="submit" value="확인">		
		</form>
	</body>
</html>