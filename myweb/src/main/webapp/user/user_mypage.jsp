<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(session.getAttribute("user_id") == null) {
		response.sendRedirect("user_login.jsp");
	}

	String id = (String)session.getAttribute("user_id");
	String name = (String)session.getAttribute("user_name");

%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-idth, initial-scale=1">
   

    <title>Welcome to MyWorld</title>

    <!-- Bootstrap Core CSS -->
    <link href="../css/bootstrap.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../css/business-casual.css" rel="stylesheet">

    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">
	
	 <!-- jQuery -->
    <script src="../js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../js/bootstrap.min.js"></script>

</head>
<body>

	<%@ include file="../include/header.jsp" %>

	<section>
		<div align="center">
			<h2>MyPage</h2>
			<hr>
			
			<%=id %>(<%=name %>)님의 회원정보를 관리합니다.
			
			<hr>
			
			<input type="button" value="비밀번호 변경" class="btn btn-default"
				onclick="location.href='user_change_pw.jsp'">
			<input type="button" value="회원정보 수정" class="btn btn-primary" 
				onclick="location.href='user_update.jsp'">
			<input type="button" value="회원탈퇴" class="btn btn-info"
				onclick="location.href='user_delete_check.jsp'">
			
		</div>
	</section>
	<br>
    
    <%@include file="../include/footer.jsp" %>
	
</body>
</html>