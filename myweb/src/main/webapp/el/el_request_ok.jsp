<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>el_request_ok.jsp</title>
	</head>
	<body>
	아이디 : ${requestScope.vo.id }<br> 
	이름 : ${requestScope.vo.name }<br>
	주소 : ${requestScope.vo.address }<br>
	${vo.id } ${vo.name } ${vo.address }
	</body>
</html>