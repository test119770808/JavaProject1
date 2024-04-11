<%@page import="com.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>quiz03.jsp</title>
	</head>
	<body>
		<%
			User user = (User)request.getAttribute("user");
		%>
		<%=user.getId() %>님 회원가입을 축하합니다.<br>
		비밀번호는 <%=user.getPw() %>입니다.
	</body>
</html>