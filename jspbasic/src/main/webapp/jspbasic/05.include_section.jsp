<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>05.include</title>
</head>
<body>	
	<%--<h1>헤더 영역</h1>  --%>
	<%@include file="05.include_header.jsp" %>
	<hr>
	<section>
		실제 내용들이 출력될 본문 영역.....<br>
		<br>
		<br>
	</section>

	<hr>
	<%@include file="05.include_footer.jsp" %>
	<%-- <h2>풋터 영역</h2> --%>
</body>
</html>