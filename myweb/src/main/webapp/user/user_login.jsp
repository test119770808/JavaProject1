<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<h2>로그인 페이지</h2>
			<hr>
			<form action="user_login_ok.jsp" method="post">
				<input type="text" name="id" placeholder="아이디"><br>
				<input type="password" name="pw" placeholder="비밀번호"><br>
				<br>
				<input type="submit" value="로그인" class="btn btn-default">
				<input type="button" value="회원가입" class="btn btn-primary" 
					onclick="location.href='user_join.jsp'">
			</form>
		</div>
	</section>
    
    <%@include file="../include/footer.jsp" %>
	
</body>
</html>