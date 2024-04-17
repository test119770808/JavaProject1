<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
//	String name = request.getParameter("name");
//	String id = request.getParameter("id");
//	String pw = request.getParameter("pw");
%>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>el_param_ok.jsp</title>
	</head>
	<body>
		<%--
			EL의 내장객체
			1. pageScope	: JSP의 page 객체를 참조
			2. requestScope : JSP의 request 객체를 참조
			3. sessionScope	: JSP의 session 객체를 참조
			4. applicationScope : JSP의 application 객체를 참조
			5. param	: 요청 파라미터를 참조하는 객체
			6. paramValues  : 요청 파라미터(배열)를 참조하는 객체
			7. initParam : 서블릿컨텍스트 초기화 파라미터를 참조하는 객체
			8. cookie : 쿠키 객체를 참조하는 객체
		
		    사용 : ${내장객체.name}
		 --%>
		이름 : ${param.name }<br>
		아이디 : ${param.id }<br> 
		비밀번호 : ${param.pw }<br>
		
	</body>
</html>



