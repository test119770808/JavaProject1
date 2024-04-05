<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<!-- 
			상대 경로 : 현재 위치(동작하는 파일의 위치)에서 다른 파일의 경로 참조
			절대 경로 : 프로젝트의 전체 경로(port번호 제외한, /컨텍스트패스로 부터의 경로)
		 -->
		<h2>path_ex01</h2>
		<a href="path_ex02.jsp">02 페이지로 이동(상대)</a>
		<a href="/jspbasic/path/path_ex02.jsp">02 페이지로 이동(절대)</a>
	</body>
</html>