<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jstl_form.jsp</title>
	</head>
	<body>
		<h2>if절 확인</h2>
		<form action="jstl_if.jsp">
			이름 : <input type="text" name="name"><br> 
			나이 : <input type="text" name="age"><br>
			<input type="submit" value="확인">
		</form>	
		<hr>
		<h2>choose절 확인</h2>
		<form action="jstl_choose.jsp">
			이름 : <input type="text" name="name"><br> 
			나이 : <input type="text" name="age"><br>
			<input type="submit" value="확인">
		</form>	
		<h2>else if(choose)절 확인2</h2>
		<!-- 점수를 입력 받아서 90점이상이면 A, 80점 이상이면 B, 70점이상이면 C
		  60점 이상이면 D, 60점 미만이면 F가 출력되게 해주세요. -->
		<form action="jstl_choose2.jsp">
			점수 : <input type="text" name="point"><br> 
			<input type="submit" value="확인">
		</form>	
	</body>
</html>