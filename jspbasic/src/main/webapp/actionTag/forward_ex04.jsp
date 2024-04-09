<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");

	String name = (String)request.getAttribute("name");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		forward로 전달받은 id : <%=id %><br>
		forward시에 강제 저장한 name : <%=name %><br>
	</body>
</html>