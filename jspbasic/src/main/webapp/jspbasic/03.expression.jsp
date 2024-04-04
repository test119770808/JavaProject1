<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String name = "홍길동";
	int age = 20;
%>

<%
	String email = "hong@naver.com";
	String address = "서울시 마포구";
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>03.expression</title>
	</head>
	<body>
		<%
			out.println("이름:<strong>"+name+"</strong><br>");
			out.println("나이:"+age+"<br>");
			out.println("이메일:"+email+"<br>");
		%>
		
		<hr>
		
		이름:<strong><%=name %></strong><br>
		나이:<%=age %><br>
		이메일:<%=email %><br>
		주소:<%=address %><br>
		
	</body>
</html>