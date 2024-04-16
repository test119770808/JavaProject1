<%@page import="com.myweb.util.PageVO"%>
<%@page import="com.myweb.board.model.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	ArrayList<BoardVO> list = (ArrayList<BoardVO>)request.getAttribute("list");
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

	<div class="container">
		<h3>MyWeb 게시판</h3>
		
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>글 번호</th>
					<th>작성자</th>
					<th>제목</th>
					<th>날짜</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
				<%for(BoardVO vo: list) { %>
				<tr>
					<td><%=vo.getNum() %></td>
					<td><%=vo.getWriter() %></td>
					<td>
						<a href="content.board?num=<%=vo.getNum() %>"><%=vo.getTitle() %></a>
					</td>
					<td><%=vo.getRegdate() %></td>
					<td><%=vo.getHit() %></td>
				</tr>
				<%} %>
			</tbody>
		</table>
		<% PageVO pageVO = (PageVO)request.getAttribute("pageVO"); %>
		<div align="center">
			<ul class="pagination pagination-sm">
				<li><a href="">이전</a></li>
				<%for(int i=pageVO.getStartPage(); i <= pageVO.getEndPage(); i++){ %>
				<li><a href="list.board?pageNum=<%=i %>"><%=i %></a></li>
				<%} %>
				<li><a href="">다음</a></li>
			</ul>
		</div>
	</div>
	
    
    <%@include file="../include/footer.jsp" %>
	
</body>
</html>
