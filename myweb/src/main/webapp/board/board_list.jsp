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
				<tr>
					<td>10</td>
					<td>testuser</td>
					<td>title10</td>
					<td>2024.04.15</td>
					<td>1</td>
				</tr>
				<tr>
					<td>9</td>
					<td>testuser</td>
					<td>title9</td>
					<td>2024.04.15</td>
					<td>1</td>
				</tr>
				<tr>
					<td>8</td>
					<td>testuser</td>
					<td>title8</td>
					<td>2024.04.15</td>
					<td>1</td>
				</tr>
				<tr>
					<td>7</td>
					<td>testuser</td>
					<td>title7</td>
					<td>2024.04.15</td>
					<td>1</td>
				</tr>
				<tr>
					<td>6</td>
					<td>testuser</td>
					<td>title6</td>
					<td>2024.04.15</td>
					<td>1</td>
				</tr>
				<tr>
					<td>5</td>
					<td>testuser</td>
					<td>title5</td>
					<td>2024.04.15</td>
					<td>1</td>
				</tr>
				<tr>
					<td>4</td>
					<td>testuser</td>
					<td>title4</td>
					<td>2024.04.15</td>
					<td>1</td>
				</tr>
				<tr>
					<td>3</td>
					<td>testuser</td>
					<td>title3</td>
					<td>2024.04.15</td>
					<td>1</td>
				</tr>
				<tr>
					<td>2</td>
					<td>testuser</td>
					<td>title2</td>
					<td>2024.04.15</td>
					<td>1</td>
				</tr>
				<tr>
					<td>1</td>
					<td>testuser</td>
					<td>title1</td>
					<td>2024.04.15</td>
					<td>1</td>
				</tr>
			</tbody>
		</table>
		
		<div align="center">
			<ul class="pagination pagination-sm">
				<li><a href="">이전</a></li>
				<li><a href="">1</a></li>
				<li><a href="">다음</a></li>
			</ul>
		</div>
	</div>
	
    
    <%@include file="../include/footer.jsp" %>
	
</body>
</html>
