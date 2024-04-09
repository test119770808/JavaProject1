<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    <%-- 에러발생시 보여질 페이지 선언 --%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>error_view.jsp</title>
		<style type="text/css">
			.box {
				height: 1000px;
				text-align: center;
			}
		</style>
	</head>
	<body>
		<div class="box">
			예기치 못한 에러가 발생했습니다.<br>
			<a href="#">홈으로</a>
		</div>
	</body>
</html>