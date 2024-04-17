<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jstl_if.jsp</title>
	</head>
	<body>
		<c:if test="true">
			무조건 실행되는 문장
		</c:if>
		<hr>
		
		<c:if test="${param.name eq '홍길동' }">
			홍길동 입니다.
		</c:if>
		<c:if test="${param.name == '이순신' }">
			이순신 입니다.
		</c:if>
		
		<%--
		age값이 20이상 이면 성인입니다.
		20미만이면 미성년입니다. 출력
		 --%>
		<c:if test="${param.age >= 20 }">
			성인입니다.
		</c:if>
		<c:if test="${param.age < 20 }">
			미성년입니다.
		</c:if>
		
		
	</body>
</html>