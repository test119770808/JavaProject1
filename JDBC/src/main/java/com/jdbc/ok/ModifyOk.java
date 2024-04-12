package com.jdbc.ok;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jdbc.domain.UserDAO;
import com.jdbc.domain.UserVO;


@WebServlet("/modify_ok")
public class ModifyOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
      public ModifyOk() {}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//정보 수정 페이지로 이동하기 위해서 DB에서 정보를 가져오는 작업
		// id는 세션을 통해서 얻어옴.
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("user_id");
		
		UserDAO dao = UserDAO.getInstance();
		
		UserVO vo = dao.getInfo(id);
		
		//VO를 request에 통째로 강제 저장하고, 포워드 처리
		request.setAttribute("vo", vo);
		request.getRequestDispatcher("update.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
