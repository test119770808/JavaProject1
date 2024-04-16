package com.myweb.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.board.service.ContentServiceImpl;
import com.myweb.board.service.DeleteServiceImpl;
import com.myweb.board.service.GetListServiceImpl;
import com.myweb.board.service.IBoardService;
import com.myweb.board.service.RegisterServiceImp;
import com.myweb.board.service.UpdateServiceImpl;


@WebServlet("*.board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardController() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	// .board로 끝나는 요청은 이 컨트롤로 들어오게 처리... 
	// 1. get, post 요청을 하나의 메서드로 연결 (doAction)
	// 2. 컨텍스트 패스를 제거 /board/list.board 요청으로 들어오면 board_list.jsp화면으로 이동
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI();
		String path = request.getContextPath();
		String command = uri.substring(path.length());
		
		System.out.println(command);
		
		IBoardService service = null;
		
		if(command.equals("/board/list.board")) { //글목록
			// 게시글 목록을 가지고 화면으로 이동... 
			service = new GetListServiceImpl();
			service.execute(request, response);
			
			// 전달해야 할 값은 service영역에서 전달할 내용을 강제저장
			RequestDispatcher dp = request.getRequestDispatcher("board_list.jsp");
			dp.forward(request, response);	
		}else if(command.equals("/board/write.board")) {  // 글작성
			response.sendRedirect("board_write.jsp");
		}else if(command.equals("/board/register.board")) {
			// 서비스 객체 생성
			service = new RegisterServiceImp();
			service.execute(request, response);
			
			response.sendRedirect("list.board");
		}else if(command.equals("/board/content.board")) {
			service = new ContentServiceImpl();
			service.execute(request, response);
			
			RequestDispatcher dp = request.getRequestDispatcher("board_content.jsp");
			dp.forward(request, response);
		}else if(command.equals("/board/modify.board")) {
			service = new ContentServiceImpl();
			service.execute(request, response);
			
			RequestDispatcher dp = request.getRequestDispatcher("board_modify.jsp");
			dp.forward(request, response);
		}else if(command.equals("/board/update.board")) {

			/*
			 * 1. UpdateServiceImpl을 생성
			 * 2. 서비스 영역에서 num, title, content을 받아서 update() 메서드를 실행
			 * 3. DAO의 update() 에서는 update구문으로 데이/터를 수정
			 * 4. 페이지 이름을 상세보기화면으로 연결(단, 필요한 값을 전달해야 함)
			 * 
			 * sql = "update board set title =?, content=? where num=?"
			 * 
			 */
			service = new UpdateServiceImpl();
			service.execute(request, response);
			
			String num = request.getParameter("num");
			response.sendRedirect("content.board?num="+num);
		}else if(command.equals("/board/delete.board")) {
			/*
			 * 1. DeleteServiceImpl을 생성한다.
			 * 2. 서비스 영역에서는 num을 받아서  delete()메서드를 실행
			 * 3. DAO의 delete()에서는 delete구문으로 삭제
			 * 4. 페이지 이동을 목록으로 
			 * 
			 * sql = "delete from board where num = ?";
			 */
			
			service = new DeleteServiceImpl();
			service.execute(request, response);
			
			response.sendRedirect("list.board");
		}
		
		
		
		
		
		
	}
}
