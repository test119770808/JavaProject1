<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jstl_choose2.jsp</title>
	</head>
	<body>
		<c:choose>
			<c:when test="${param.point >= 90 }" >
				A 입니다.
			</c:when>
			<c:when test="${param.point >= 80 }" >
				B 입니다.
			</c:when>
			<c:when test="${param.point >= 70 }" >
				C 입니다.
			</c:when>
			<c:when test="${param.point >= 60 }" >
				D 입니다.
			</c:when>
			<c:otherwise>
				F 입니다.
			</c:otherwise>
		</c:choose>
	</body>
</html>