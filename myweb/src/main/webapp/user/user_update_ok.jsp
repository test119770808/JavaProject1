<%@page import="com.myweb.user.model.UserVO"%>
<%@page import="com.myweb.user.model.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/*
	1. 폼 값을 받습니다. 
	2. DAO연동을 통해서 update메서드를 호출해서 회원정보를 수정
	3. 매개값을 VO로 전달
	4. 수정 성공시 "회원정보가 수정되었습니다." 출력후 마이페이지로 이동(단, name세션을 변경)
	   수정실패시 "회원정보 수정에 실패했습니다." 출력후 마이페이지로 이동
	  
	   sql = "update users set name = ? , email = ? , address = ? where id = ?";
	
	*/
	if(session.getAttribute("user_id") == null) {
		response.sendRedirect("user_login.jsp");
	}
	
	String id = (String)session.getAttribute("user_id");
	
	request.setCharacterEncoding("utf-8");

	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String address = request.getParameter("address");
	
	UserDAO dao = UserDAO.getInstance();
	UserVO vo = new UserVO(id, null, name, email, address, null);
	
	int result = dao.update(vo);
	
	if (result == 1) { // 성공시 
		session.setAttribute("user_name", name);  // 이름을 변경한 경우.. 세션에 저장	
	%>
	<script>
		alert("회원정보 수정에 성공했습니다.");
		location.href="user_mypage.jsp";
	</script>
		
<%	}else {  //실패시  %>
	<script>
		alert("회원정보 수정에 실패했습니다.");
		location.href="user_mypage.jsp";
	</script>	
<%	} %>
	





