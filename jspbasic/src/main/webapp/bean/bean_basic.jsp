<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>bean_basic.jsp</title>
	</head>
	<body>
		<form action="bean_basic_ok.jsp" method="post">
			아이디 : <input type="text" name="id" size="20"><br>
			비밀번호 :  <input type="password" name="pw" size="20"><br>
			이름 : <input type="text" name="name" size="20"><br>
			이메일 : <input type="email" name="email" size="20"><br>
			<input type="submit" value="확인">
			<!-- 
				이런 여려개의 파라미터 값을 개별적으로 전달할 수 있지만.... 
				클래스 객체를 생성해서 전달한다면? 보다 쉽게 처리가 가능함.	
			 -->
		</form>
	</body>
</html>