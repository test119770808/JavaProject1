<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//쿠키 사용하기
	// 쿠기는 요청시 자동으로 전송되고, request에 자동으로 저장됩니다. 
	Cookie[] arr = request.getCookies();

	if(arr!= null) {  // 쿠키가 null이 아닌 경우 실행(즉, 쿠키가 존재할 때)
		for(int i = 0; i < arr.length; i++) {
			out.println(arr[i].getName()+"<br>"); //쿠키 이름 얻기
			out.println(arr[i].getValue()+"<br>"); //쿠키 값 얻기
		}
	}

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>cookie_get.jsp</title>
	</head>
	<body>
	
	</body>
</html>