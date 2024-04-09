<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// application 객체는 session과 사용방법이 거의 비슷함. 
	//  서버가 동작할 때 1개의 application 객체가 생성되고, 서버가 꺼질때까지 유지됨.
	int count = 0;
	
	if(application.getAttribute("visit") != null) {
		count = (int)application.getAttribute("visit");
	}
	
	count ++;
	
	application.setAttribute("visit", count);


%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>app_basic.jsp</title>
	</head>
	<body>
		누적값 : <%=count %>
	</body>
</html>