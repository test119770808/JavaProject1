<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jstl_choose.jsp</title>
	</head>
	<body>
		<!-- choose는 자식으로 c:when, c:otherwise 를 가질 수 있음. -->
		<c:choose>
			<c:when test="${param.name eq '홍길동'}">
				이름이 홍길동 입니다.
			</c:when>
			<c:when test="${param.name == '이순신' }">
				이름이 이순신 입니다.
			</c:when>
			<c:when test="${param.age >= 20 }">
				성인 입니다.
			</c:when>
			<c:otherwise>
				홍길동도, 이순신도 아니고, 성인도 아닙니다.
			</c:otherwise>
		</c:choose>
	</body>
</html>