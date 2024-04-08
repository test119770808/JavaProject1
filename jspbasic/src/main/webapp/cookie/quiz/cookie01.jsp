<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/*
		1.Date 클래스를 이용하여 이 페이지에 접근한 시간을 xxxx년 xx월 xx일 형태로
		생성. 
		날짜형식을 문자열 형태로 show라는 이름의 쿠키로 생성
	*/

	Date now = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	Cookie show = new Cookie("show",sdf.format(now));
	show.setMaxAge(30); // 30s
	response.addCookie(show);	

%>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>cookie01.jsp</title>
	</head>
	<body>
		<a href="cookie02.jsp">쿠키에 저장된 값 확인해보기</a>
	</body>
</html>