<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>req_quiz02.jsp</title>
	</head>
	<body>
		<p>다음을 구현하고 a태그 클릭시 req_quiz02_ok 에 학생번호를 출력하세요.</p>
		<%
		for (int i=1;i <= 30;i++) {
			%>
			<a href="req_quiz02_ok.jsp?num=<%=i %>">
			<%=i %>번 학생
			</a><br>
			<%
			//if((i % 10) == 0)
			//		out.println("<br>");
		}
		%>
	</body>
</html>