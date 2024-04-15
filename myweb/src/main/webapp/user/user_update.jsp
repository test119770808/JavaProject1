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
				<form name="regform" action="user_update_ok.jsp" method="post">
					<h2>회원정보 수정 페이지</h2>
					<table>
						<tr>
							<td>아이디</td>
							<td><input type="text" name="id" value="<%=id %>" readonly></td>
						</tr>
						<tr>
							<td>이름</td>
							<td><input type="text" name="name" value="<%=vo.getName() %>"></td>
						</tr>
						<tr>
							<td>이메일</td>
							<td><input type="email" name="email" value="<%=vo.getEmail() %>"></td>
						</tr>
						<tr>
							<td>주소</td>
							<td><input type="text" name="address" value="<%=vo.getAddress() %>"></td>
						</tr>
					</table>
					<br><br>
					<input type="button" value="정보수정" class="btn btn-primary" onclick="check()">
					<input type="button" value="마이페이지" class="btn btn-info" onclick="location.href='user_mypage.jsp'">
				</form>
			</div>
		</section>
	    
	    <%@include file="../include/footer.jsp" %>
		<script type="text/javascript">
			function check() {
				//form은 유일하게 document.태그이름으로 접근 가능... 
				if( document.regform.name.value == '') {
					alert("이름은 필수 사항입니다.")
					return;
				}else if( confirm("회원 정보을 수정하시겠습니까?")) {
					// confirm() 확인창을 띄워서 확인(true)/취소(false) 중 선택하는 메서드
					document.regform.submit();  //자바스크립트의 submit 기능
				}
			}
		</script>
	</body>
</html>