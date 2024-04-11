<%@page import="com.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>bean_use_java.jsp</title>
	</head>
	<body>
		<%
			User user = (User)request.getAttribute("user");
		%>
		<%=user.getId() %>
		<%=user.getName() %>
	</body>
</html>