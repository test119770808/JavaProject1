<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	Integer num = Integer.parseInt(request.getParameter("num"));
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>req_quiz02_ok.jsp</title>
</head>
<body>
	<%=num %>번 학생 번호 출력
 
</body>
</html>