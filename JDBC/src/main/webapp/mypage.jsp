<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// 세션을 이용해서 인증되지 않은 사람들을 login페이지로 리다이렉트
	if(session.getAttribute("user_id") == null) {
		response.sendRedirect("login.jsp");
	}
	String id = (String)session.getAttribute("user_id");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>MyPage</title>
	</head>
	<body>
		<h2><%=id  %>님 환영합니다.</h2>
	</body>
</html>