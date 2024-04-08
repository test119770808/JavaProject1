<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	/*
	login.jsp 페이지로부터 넘어온 id, pw를 받아 처리.
	id가 abc1234 이고, 비밀번호 asd123 이라면, 로그인 성공이라 간주
	login_welcome 페이지로 리다이렉트
	
	id가 틀린 경우 login_id_fail.jsp페이지로 리다이렉트
	pw가 틀린 경우 login_pw_fail.jsp페이지로 리다이렉트 
	*/
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	if (id.equals("abc1234")) {
		if (pw.equals("asd123")) {
			//로그인 성공
			response.sendRedirect("login_welcome.jsp");
		}else {
			// 비밀번호 오류
			response.sendRedirect("login_pw_fail.jsp");
		}
	}else {
		// 아이디 오류
		response.sendRedirect("login_id_fail.jsp");
	}
%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>res_login_ok.jsp</title>
	</head>
	<body>
		
	</body>
</html>