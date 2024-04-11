<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//로그아웃 처리 및 세션의 삭제, 리다이렉트
	session.invalidate();
	response.sendRedirect("login.jsp");
%>