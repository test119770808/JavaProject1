<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>bean_make_tag.jsp</title>
	</head>
	<body>
		<h2>액션태그로 자바Bean 사용</h2>
		
		<jsp:useBean id="user" class="com.bean.User" scope="request" />
		<jsp:setProperty property="id" name="user" value="kkk123"/>
		<jsp:setProperty property="name" name="user" value="홍길동"/>
		<jsp:forward page="bean_use_tag.jsp" />
		
	</body>
</html>