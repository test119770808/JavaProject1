<%@page import="com.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>bean_make_java.jsp</title>
	</head>
	<body>
		<h2>자바코드를 이용해서 bean을 사용하기</h2>
		<%
		User user = new User();
		user.setId("kkk123");
		user.setName("홍길동");
		
		//자바코드로 다음 페이지에 넘겨주려고하면 request 강제 저장
		request.setAttribute("user", user); //user 객체 전달
		
		RequestDispatcher dp = request.getRequestDispatcher("bean_use_java.jsp");
		dp.forward(request, response);
		
		%>
	
	</body>
</html>