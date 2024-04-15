<%@page import="com.myweb.user.model.UserVO"%>
<%@page import="com.myweb.user.model.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(session.getAttribute("user_id")==null) {
		response.sendRedirect("user_login.jsp");
	}

	String id = (String)session.getAttribute("user_id");

	UserDAO dao = UserDAO.getInstance();
	UserVO vo = dao.getUserInfo(id);

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
				<form name="regform" action="user_change_pw_ok.jsp" method="post">
					<h3>비밀번호 변경 페이지</h3>
					
					현재 비밀번호 : <input type="password" name="old_pw"><br>
					변경 비밀번호 : <input type="password" name="new_pw"><br>
					<input type="submit" value="확인">
					<input type="button" value="취소" onclick="history.go(-1)">
				</form>
			</div>
		</section>
	    
	    <%@include file="../include/footer.jsp" %>
		
	</body>
</html>