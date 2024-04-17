<%@page import="com.myweb.board.model.BoardVO"%>
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
			<form>
			
				<table border="1" style="width:500px">
					<tr>
						<td style="width:20%">글번호</td>
						<td style="width:30%">${vo.num }</td>
						<td style="width:20%">조회수</td>
						<td style="width:30%">${vo.hit }</td>
					</tr>
					<tr>
						<td>작성일</td>
						<td>${vo.regdate }</td>
						<td>작성자</td>
						<td>${vo.writer }</td>
					</tr>
					<tr>
						<td>제목</td>
						<td colspan="3">${vo.title }</td>
					</tr>
					<tr>
						<td>내용</td>
						<td colspan="3">${vo.content }</td>
					</tr>
					<tr>
						<td colspan="4" align="center">
							<input type="button" value="목록" onclick="location.href='list.board?pageNum=${param.pageNum }'">
							<input type="button" value="수정" onclick="location.href='modify.board?num=${vo.num}&pageNum=${param.pageNum }'">
						</td>
					</tr>
				</table>
			</form>
		</div>
	</section>
    
    <%@include file="../include/footer.jsp" %>
    
	
</body>
</html>
