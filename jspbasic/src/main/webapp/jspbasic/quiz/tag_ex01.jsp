<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!
	//선언자와 스크립트릿 차이 => 멤버변수는 전역변수의 성질을 가지면서 전체 어플에 영향을 준다.)
	int total = 0;
	
	public int randomNum() {
		Random ran = new Random();
		int num = ran.nextInt(10);
		
		return num;
	}
%>
<%
	//페이지가 실행될 때 마다 발생하는 코드를 작성
	int each = 0;
	
	total ++;
	each++;
	
	int rn = randomNum();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>tag_ex01</title>
	</head>
	<body>
	
		<p>
			페이지 누적요청 : <%= total %><br>
			페이지 개별요청 : <%= each %><br>
			오늘의 숫자 : <%= rn %><br>
		</p>
	
	</body>
</html>