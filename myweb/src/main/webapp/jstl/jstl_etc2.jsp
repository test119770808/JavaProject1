<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jstl_etc2.jsp</title>
	</head>
	<body>
		<c:import url="jstl_etc.jsp"></c:import>
		
		<%--
		// c:catch
		try{
			검증할 내용
		}catch(Exception e){
			에러 발생시 내용
		}
		 --%>
		<c:catch var="abc">
			검증할 내용
			${100/0 }<br>
		</c:catch>
		에러는 ${abc }로 출력
		
		<h2> c:catch 사용</h2>
		<c:catch var="test">
			<%
			String s = null;
			Integer.parseInt(s); 
			%>
		</c:catch>
			${test }<br>
		
		<h2>c:redirect 결과 확인</h2>
		${param.abc }<br>
		
		<%--c:url은 c:set과 비슷함.. 단, get방식으로 값을 전달받는다 --%>
		<c:url var="abc2" value="${param.abc2 }" scope="request" />
		${abc2 }<br>
		
	</body>
</html>