<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>include_ex01.jsp</title>
	</head>
	<body>
		<h2> 여기는 1번 페이지 입니다.</h2>
		<hr>
		<%@ include file="include_ex02.jsp" %>
		<hr>
		<jsp:include page="include_ex02.jsp" />
	</body>
</html>