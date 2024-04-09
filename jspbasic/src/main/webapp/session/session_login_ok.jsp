<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/*
	1. 아이디, 비밀번호, 닉네임을 받기
	2. 조건 : 아이디와 비밀번호가 서로 동일하면, user_id 이름으로 id세션에 저장
		user_name 이름으로 nick세션에 저장
		session_welcome페이지를 작성. 이동한 후에 "id님(name) 님 환영합니다."
		
		아이디와 비밀번호가 일치하지 않은 경우 다시 로그인 페이지로 리다이렉트
	*/
	
	request.setCharacterEncoding("utf-8"); //한글처리
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String nick = request.getParameter("nick");
	
	if (id.equals(pw)) {
		session.setAttribute("user_id", id);
		session.setAttribute("user_name", nick);
		response.sendRedirect("session_welcome.jsp");
	}else {
		// response.sendRedirect("session_login.jsp");
		
		// 자바스크립트의 변수 선언
		%>
		<script>
			/*
			자바스크립트 변수 선언
			*/
			//var a = 1;
			//var b = "1";
			
			//let c = 1;  //ES6 방식
			//const d = "1"
			
			/*자바스크립 함수 */
			//function 함수이름 (매개변수) {
			//	함수 실행문들... 
			//}
			
			//이름 = () => { }  //es6방식
			
			//제어 : for, if, switch, while, try... 
			
			//자바 스크립트에서 자주 사용되는 내장 객체 
			//alert(); 경고창
			//confirm(); 확인창
			//history.go(-1); 뒤로 가기
			//location.href = "경로";  리다이렉트
			check();    // 함수의 호출, 선언되면 앞뒤 어디서든 사용이 가능
			
			function check() {
				alert("로그인 실패했습니다."); //경고창
				history.go(-1); //뒤로가기
			}
		</script>
	<%	
	}

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>session_login_ok.jsp</title>
	</head>
	<body>
			
	</body>
</html>