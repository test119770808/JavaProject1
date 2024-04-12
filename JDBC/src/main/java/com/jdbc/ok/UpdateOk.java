package com.jdbc.ok;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.domain.UserDAO;
import com.jdbc.domain.UserVO;


@WebServlet("/update_ok")
public class UpdateOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UpdateOk() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// form에서 들어오는 값 처리... 
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String gender = request.getParameter("gender");
		
		/*
		 * 1. 폼데이터 값을  VO에 저장
		 * 2. DAO객체를 생성하고 update메서드로 vo객체 전달
		 * 3. update메서드 안에서는 executeUpdate() 메서드로 실행
		 *    1을 반환 하면 update_success.jsp로 이동
		 *    0을 반환하면 mypage.jsp로 이동
		 * 
		 *  sql = "update user set name = ?, phone1=?, phone2=?, 
		 *         gender=? where id=?"
		 * 
		 */
		
		UserDAO dao = UserDAO.getInstance();
		
		UserVO vo = new UserVO(id, null, name, phone1, phone2, gender);
		
		int result = dao.update(vo);
		
		if (result == 1) {
			response.sendRedirect("update_success.jsp");
		}else {
			response.sendRedirect("mypage.jsp");
		}
		
		
		
		
		
		
	}

}
