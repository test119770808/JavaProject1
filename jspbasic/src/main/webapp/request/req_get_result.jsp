<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String name = request.getParameter("name");
	String number = request.getParameter("number");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>req_get_result.jsp</title>
	</head>
	<body>
		이름 : <%=name %><br>
		숫자 : <%=number %><br>
	</body>
</html>