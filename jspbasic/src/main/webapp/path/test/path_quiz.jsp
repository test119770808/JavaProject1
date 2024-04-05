<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>path_quiz</title>
	</head>
	<body>
		<!-- a 태그를 이용하여 경로 이동 -->
		<!-- /jspbasic/path/test/path_quiz.jsp -->
		
		<!-- 1. jspbasic폴더에 03.express.jsp 파일로 접근  상대/절대 경로로 접근-->
		<!-- /jspbasic/jspbasic/03.expression.jsp -->
		<a href="../../jspbasic/03.expression.jsp">03.express.jsp 파일로 상대 경로</a><br>
		<a href="/jspbasic/jspbasic/03.expression.jsp">03.express.jsp 파일로 절대 경로</a><br>
		<br>
		<!-- 2. TestServlet 서블릿 페이지로 상대/절대 경로로 접근 -->
		<!-- /jspbasic/TestServlet -->
		<a href="../../TestServlet">서블릿으로 상대 경로 접근</a><br>
		<a href="/jspbasic/TestServlet">서블릿으로 절대 경로 접근</a><br>
		<br>
		<!-- 3. images 폴더에 있는 이미지 파일에 상대 경로로 접근  -->
		<!-- /HTML/images/ -->
		<img src="../../../HTML/images/second_movie.png" width="100"><br>
		
		
	</body>
</html>