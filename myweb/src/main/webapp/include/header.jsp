<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<!-- header -->
	<div class="brand">My Web</div>        
    <div class="address-bar">Welcome to MyWorld</div>
		
    
    <nav class="navbar navbar-default" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                
                <a class="navbar-brand" href="/hong">My First Web</a>
            </div>
           
           
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                	
                    <li>
                        <a href="/myweb/">HOME</a>
                    </li>
                    <li>
                        <a href="/myweb/member/member.jsp">Member</a>
                    </li>
                    <li>
                        <a href="/myweb/board/list.board">BOARD</a>
                    </li>
                    <%if (session.getAttribute("user_id")== null) {%>
                    <li>
                        <a href="/myweb/user/user_login.jsp">LOGIN</a>
                    </li>
                    <li>
                        <a href="/myweb/user/user_join.jsp" style="color:red">JOIN</a>
                    </li>
                    <%}else{ %>
                    <li>
                        <a href="/myweb/user/user_logout.jsp">LOGOUT</a>
                    </li>
                    <li>
                        <a href="/myweb/user/user_mypage.jsp" style="color:red">MyPage</a>
                    </li>
                    <%} %>
                </ul>
            </div>
            
            
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
 	<!-- end header -->