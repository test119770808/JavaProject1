<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String test = "test";
%>    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jstl_etc.jsp</title>
	</head>
	<body>
		<h2>remove 테스트</h2>
		<c:set var="test1" value="<%=test %>"></c:set>
		<c:set var="test2" value="test2"></c:set>
		<c:remove var="test2" scope="page"/>
		${pageScope.test1 }<br>
		${test2 }<br>
		
		<h2>c:forTokens 테스트</h2>
		<!-- 자바의 StringTokenizer를 JSTL를 사용하여 구현하려 할때 쓸 수 있음.
		    문자열을 구분자로 나눌려고 할 때 사용함.  -->
		<c:set var="tokens" value="안녕/하세요/조금있으면/점심/입니다." />
		<c:forTokens var="abc" items="${tokens }" delims="/">
			${abc }<br>
		</c:forTokens>
		
		
	</body>
</html>




