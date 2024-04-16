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
			<form name="regform" action="register.board" method="post">
				<h2>게시판 글작성 페이지</h2>
				<hr>
				<table border="1" style="width:500px">
					<tr>
						<td>작성자</td>
						<td><input type="text" name="writer" size="10"></td>
					</tr>
					<tr>
						<td>글제목</td>
						<td><input type="text" name="title"></td>
					</tr>
					<tr>
						<td>글내용</td>
						<td><textarea name="content" rows="10" style="width:100%"></textarea></td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<input type="button" value="등록" onclick="registCheck()">
							<input type="button" value="목록" onclick="location.href='list.board'">
						</td>
					</tr>
				</table>
			</form>
		</div>
	</section>
    
    <%@include file="../include/footer.jsp" %>
    
    <script type="text/javascript">
    	function registCheck() {
    		//작성자, 글제목에 공백확인, 공백이 아니라면 submit() 처리
    		if (document.regform.writer.value == "") {
    			alert("작성자를 입력하세요");
    			return;
    		}else if(document.regform.title.value == "") {
    			alert("제목을 입력하세요");
    			return;
    		}else if(confirm("게시글을 등록하겠습니까?")) {
    			document.regform.submit();
    		}
    	}
    </script>
	
</body>
</html>
