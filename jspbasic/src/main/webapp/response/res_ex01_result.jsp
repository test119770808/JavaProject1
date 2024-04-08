<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String age = request.getParameter("age");
	int result = Integer.parseInt(age);
	
	if (result >=20) {
		response.sendRedirect("res_ex01_ok.jsp");
	}else {
		response.sendRedirect("res_ex01_no.jsp");
	}

%>
