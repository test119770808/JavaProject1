<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	if(session.getAttribute("user_id") == null) {
		response.sendRedirect("session_login.jsp");
	}else{
		// 인증처리하는 세션을 삭제.
		session.removeAttribute("user_id");

		// 세션 그 자체를 삭제.
		session.invalidate();
		
		response.sendRedirect("session_login.jsp");
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session_logout.jsp</title>
</head>
<body>

</body>
</html>