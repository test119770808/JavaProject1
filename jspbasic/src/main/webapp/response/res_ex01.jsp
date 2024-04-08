<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>res_ex01</title>
	</head>
	<body>
		<!-- 나이를 입력받아 res_ex01_result.jsp로 값을 전달하고, 
		그 입력 나이에 따라서 20살 이상이면 "성년입니다."를 출력하는 페이지(res_ex01_ok.jsp)로
		이동. 20살 미만이면 "미성년입니다."를 출력하는 페이지(res_ex01_no.jsp)로 이동
		-->
		<h2>res_ex01</h2>
		<form action="res_ex01_result.jsp">
			<input type="text" name="age">
			<input type="submit">
		</form>	
	</body>
</html>