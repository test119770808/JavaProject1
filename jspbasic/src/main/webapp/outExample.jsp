<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>outExample.jsp</title>
	</head>
	<body>
		<h2>out 객체</h2>
		<p>
		out객체는 jsp에서 html로 보내기 위한 출력 객체를 말함. 
		표현식이 이를 대체하고 있음.
		</p>
		
		<h3>out 객체 사용</h3>
		<%
		for (int i=1; i <= 10; i++) {
			out.println("<input type='checkbox' name='check'>"+i);
		}
		%>
		<br>
		<h3>표현식 사용</h3>
		<%for (int i=1; i <= 10; i++) { %>
			<input type="checkbox" name='check'><%=i %>
		<%} %>	
	</body>
</html>