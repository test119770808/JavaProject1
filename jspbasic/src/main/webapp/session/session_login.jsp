<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	if(session.getAttribute("user_id") != null) {
		response.sendRedirect("session_welcome.jsp");
	}

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>session_login.jsp</title>
	</head>
	<body>
		<h2>세션 로그인</h2>
		<form action="session_login_ok.jsp" method="post">
			ID : <input type="text" name="id"><br> 
			PW : <input type="password" name="pw"><br>
			NICK :  <input type="text" name="nick"><br>
			<input type="submit" value="로그인"><br>
		</form>
	</body>
</html>