<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// 1. 리스트 2개를 생성(예약 좌석을 저장한 리스트, 사본을 저장할 리스트)
	List<String> list = new ArrayList<>();
	List<String> temp = new ArrayList<>();
	
	// 2. application 객체에 예약 현황이 있는 경우 원본 리스틀 저장
	if (application.getAttribute("seats") != null) {
		list = (List<String>)application.getAttribute("seats");
	}


%>
    
    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>reserve_ok.jsp</title>
	</head>
	<body>
		<div align="center">
			<h2>예약 신청 결과</h2>
			<p>
				<b>선택한 좌석</b>
				
				<b>예약 신청 결과</b>
				
				<br>
			</p>
			
			<a href="reserve.jsp">다시 예약하기</a>
		</div>	
	</body>
</html>