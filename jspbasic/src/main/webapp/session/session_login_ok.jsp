<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/*
	1. 아이디, 비밀번호, 닉네임을 받기
	2. 조건 : 아이디와 비밀번호가 서로 동일하면, user_id 이름으로 id세션에 저장
		user_name 이름으로 nick세션에 저장
		session_welcome페이지를 작성. 이동한 후에 "id님(name) 님 환영합니다."
		
		아이디와 비밀번호가 일치하지 않은 경우 다시 로그인 페이지로 리다이렉트
	*/
	
	request.setCharacterEncoding("utf-8"); //한글처리
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String nick = request.getParameter("nick");
	
	if (id.equals(pw)) {
		session.setAttribute("user_id", id);
		session.setAttribute("user_name", nick);
		response.sendRedirect("session_welcome.jsp");
	}else {
		response.sendRedirect("session_login.jsp");
	}


%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>session_login_ok.jsp</title>
	</head>
	<body>
			
	</body>
</html>