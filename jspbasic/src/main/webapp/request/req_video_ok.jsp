<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String num = request.getParameter("num");
	Integer sel = Integer.parseInt(num);
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>req_video_ok.jsp</title>
	</head>
	<body>
		<%
		if (num == null) {%>
		잘못된 접근입니다.
		<%}else if(sel == 1) { %>
		<div align="center">
			<h2>파이썬 수업</h2>
			<p>파이썬 수업 중에 하나... </p>
			<hr>
			<iframe width="640" height="480" src="https://www.youtube.com/embed/UMfCZMuZoRk?list=PLz2iXe7EqJOOTNTK27a4-WsgZU5NVfguh" title="파이썬 기초 강의 [1강.파이썬 시작하기] (SONOL)" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
		</div>
		<%}else if(sel == 2) { %>
		<div align="center">
			<h2>자바 수업을 리뉴얼했습니다.</h2>
			<p> 생활코딩 자바 수업...  </p>
			<hr>
			<iframe width="640" height="480" src="https://www.youtube.com/embed/jdTsJzXmgU0?list=PLuHgQVnccGMCeAy-2-llhw3nWoQKUvQck" title="자바 수업을 리뉴얼 했습니다" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
		</div>
		<%} %>
	</body>
</html>




