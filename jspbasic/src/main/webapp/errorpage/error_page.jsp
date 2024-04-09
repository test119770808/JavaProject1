<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error_view.jsp" %> <%-- 에러 발생시 보여질 페이지를 지정 --%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>error_page.jsp</title>
	</head>
	<body>
		<%
			request.getParameter("num").charAt(0);
		%>
	</body>
</html>