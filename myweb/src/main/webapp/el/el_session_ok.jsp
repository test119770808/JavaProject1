<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>el_session_ok.jsp</title>
	</head>
	<body>
		<%--
		세션 또는 어플리케이션에 있는 값을 얻을 때는 sessionScope, applicationScope를
		사용하여 접근... 
		sessionScope.이름.이름(application.이름.이름)
		
		 --%>
		${sessionScope.id }<br>
		${sessionScope.vo.email }<br>
		${applicationScope.admin }<br>
		<%-- ${vo.email }<br> --%>
	</body>
</html>