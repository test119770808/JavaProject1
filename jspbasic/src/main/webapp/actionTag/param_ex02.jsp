<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:forward page="param_ex03.jsp">
	<jsp:param value="똘똘이" name="nick"/>
</jsp:forward>
<%-- forward 시에 파라미터 값을 추가해서 넘기고자 할 경우 --%>
