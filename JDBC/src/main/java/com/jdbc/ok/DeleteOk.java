package com.jdbc.ok;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jdbc.domain.UserDAO;


@WebServlet("/delete_ok")
public class DeleteOk extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteOk() {}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * delete from 테이블명 where id = ?
		 * 
		 * 1. 아이디는 세션에서 얻는다
		 * 2. pstmt를 이용하여 삭제 진행
		 * 3. executeUpdate() 메서드를 통해서  sql문을 실행하고
		 *  1을 반환하면 세션 전부다 삭제후 login.jsp로 이동
		 *  0을 반환하하면 mypage.jsp로 이동
		 * 
		 */
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("user_id");
		
		UserDAO dao = UserDAO.getInstance();
		
		int result = dao.delete(id);
		
		if (result == 1) {
			session.invalidate();
			response.sendRedirect("login.jsp");
		}else {
			response.sendRedirect("mypage.jsp");
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
