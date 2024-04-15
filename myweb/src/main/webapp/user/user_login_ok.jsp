<%@page import="com.myweb.user.model.UserVO"%>
<%@page import="com.myweb.user.model.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/*  
	1. 로그인 처리과정을 작성하세요. 
	2. dao에 executeQuery 메서드로 결과값이 존재하면 1, 없으면 0을 반환하는 메서드 구현
	3. 실패인 경우 경고창을 출력 후 뒤로가기, 성공인 경우에는 user_mypage.jsp로 이동
	*/
	
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	//DAO 객체 생성
	UserDAO dao = UserDAO.getInstance();
	int result = dao.login(id, pw);
	
	if (result == 1) {  //로그인 성공
		// 로그인 성공시 회원정보를 얻어오는 작업
		UserVO vo = dao.getUserInfo(id);
		String name = vo.getName();
		
		// 아이디와 이름을 세션에 저장
		session.setAttribute("user_id", id);
		session.setAttribute("user_name", name);
		
		
		// user_mypage.jsp로 이동
		response.sendRedirect("user_mypage.jsp");
    }else {   // 로그인 실패%>
		<script>
			alert("아이디 혹은 비밀번호를 확인하세요.");
			history.go(-1);
		</script>
<%  } %>


