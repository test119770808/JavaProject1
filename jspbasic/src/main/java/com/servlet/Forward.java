package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Forward")
public class Forward extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Forward() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		System.out.println(id);
		
		//한글을 사용할 경우에는 request.setCharaterEncoding("utf-8");
		// request에 1회성으로 사용하기 위해서 값을 강제로 저장
		// setAttribute("변수명", 값)
		request.setAttribute("name", "홍길동");
//		response.sendRedirect("actionTag/forward_ex04.jsp");
		RequestDispatcher dp = request.getRequestDispatcher("actionTag/forward_ex04.jsp");
		dp.forward(request, response);  //자바에서의 forward 방식... 
		
		
		
	}

}
