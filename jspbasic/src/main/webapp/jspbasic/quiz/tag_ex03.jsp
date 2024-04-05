<%@page import="java.util.Collections"%>
<%@page import="java.util.Random"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	ArrayList<Integer> list = new ArrayList<>();
	Random ran = new Random();
	while (list.size() < 6) {
		int num = ran.nextInt(45)+1;
		
		if(!list.contains(num)) {
			list.add(num);
		}
	}
	Collections.sort(list); //Collection의 정렬기능을 활용.

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>tag_ex03</title>
	</head>
	<body>
		출력 결과 <br>
		이번주 로또번호 <%=list %> 
		<!-- 
		ArrayList를 사용하여 1 ~ 45까지 랜덤한 번호를 발생히키고 리스트에 담으세요. 
	
		body태그에서
		이번주 로또번호 [1,2,3,4,5,6] 형식으로 출력
		
		단, list.contains(값) => 중복을 피하면 됩니다. 
		Collections.sort(리스트) => 오름 차순 정렬 
		-->
	</body>
</html>