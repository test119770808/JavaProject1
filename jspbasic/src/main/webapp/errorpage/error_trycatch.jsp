<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>error_trycatch.jsp</title>
	</head>
	<body>
		<%try { %>
		<%
			String num = request.getParameter("num");
			Integer.parseInt(num);
		%>
		<%} catch(Exception e){ %>
			num 값이 없습니다.
		<%} %>	
	</body>
</html>