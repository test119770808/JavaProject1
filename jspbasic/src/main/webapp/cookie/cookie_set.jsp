<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//쿠키 생성 방법
	//1. 쿠키 객체 생성 - 생성자 매개변수로 (쿠키이름, 쿠키값)
	Cookie idCoo = new Cookie("user_id","kkk123");
	Cookie nameCoo = new Cookie("user_name", "홍길동");
	
	//2. 쿠키 시간 설정
	idCoo.setMaxAge(60*60); //1시간(3600)
	nameCoo.setMaxAge(20);  //20s
	//idCoo.setSecure(true);
	//nameCoo.setSecure(true);
	idCoo.setHttpOnly(true);
	//3. 응답객체에 쿠키 탑재
	response.addCookie(idCoo);
	response.addCookie(nameCoo);

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>cookie_set.jsp</title>
	</head>
	<body>
		<a href="cookie_get.jsp">쿠키 확인하기</a>
	</body>
</html>