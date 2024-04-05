<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! 
	int total = 0;

	public int randomNum() {
		Random ran = new Random();
		int num = ran.nextInt(8)+2;
		return num;
	}

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>tag_ex2</title>
	</head>
	<body>
		<%
			total++;
			int ran = randomNum();
		%>
		<p>
		페이지 누적 요청 : <%=total %><br>
		매 10번째 방문자에게 기프티콘을 드립니다.<br>
		<!-- 10번째 방문자가 접속시 "당첨되셨습니다" 를 출력 -->
		<%
			if(total % 10 == 0){
			%>	
				<strong>당첨되었습니다!!</strong>
			<%
			}
		
		%>
		</p>
		<hr>
		<!-- 2 ~ 9까지 사이의 임의의 구구단을 출력하는 코드를 작성하세요 -->
		<h2>램덤 구구단 <%=ran %></h2>
		이번에 출력할 구구단 <%=ran %>단입니다.<br>
		<%
			for(int i=1;i<=9;i++){
				int re = ran*i;	
		%>
				<%=ran %> x <%=i %> = <%=re %><br>
		<%
			}
		%>
			
	</body>
</html>