<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	/*
	1. 아이디, 비밀번호를 받고
	2. id = abc 이고, pw = 1234 이면 로그인 성공으로 간주
	  (user_id, id)값을 갖는 쿠키를 생성
	3. 쿠키 문법을 사용 쿠키를 전송. 
	4. 아이디, 비밀번호가 틀렸다면, cookie_login.jsp로 이동.
	5. 아이디와 비밀번호가 맞으면 welcome 페이지에서 쿠키를 사용하여 "id님 환영합니다"를 출력
	*/

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String idCheck = request.getParameter("idCheck");

	if(id.equals("abc") && pw.equals("1234")) {
		// 로그인 성공... 
		Cookie userId = new Cookie("user_id",id);
		userId.setMaxAge(30); //30s
		response.addCookie(userId);
		
		if (idCheck != null) {  // idCheck의 체크박스가 선택되어 있다면, 
			Cookie check = new Cookie("idCheck", id);
			check.setMaxAge(1800);
			response.addCookie(check);
		}
		
		response.sendRedirect("cookie_welcome.jsp");
	}else {
		// 로그인 실패... 
		response.sendRedirect("cookie_login.jsp");
	}
	
	
	
	
%>
