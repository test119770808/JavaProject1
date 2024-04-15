<%@page import="com.myweb.user.model.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 폼 값 처리
	request.setCharacterEncoding("utf-8");

	if (session.getAttribute("user_id") == null) {
		response.sendRedirect("user_login.jsp");
	}
	
	String id = (String)session.getAttribute("user_id");
	String oldPw = request.getParameter("old_pw");
	String newPw = request.getParameter("new_pw");
	
	UserDAO dao = UserDAO.getInstance();
	int result = dao.login(id, oldPw);
	if (result == 0) { //예전 비밀번호 틀린 경우 %>
		<script>
			location.href='user_mypage.jsp';
		</script>
	<%}else{ // 비밀번호가 맞는 경우
		int result2 = dao.changePassword(id, newPw);
		if (result2 == 1) {  //비밀번호 변경 성공
	%>
			<script>
				alert("비밀번호 변경처리 되었습니다.")
				location.href='user_mypage.jsp';
			</script>
		<%}else { // 비밀번호 변경 실패%>
			<script>
				alert("비밀번호 변경에 실패했습니다.")
				location.href='user_mypage.jsp';
			</script>
		<%} %>
	<%} %>
%>
