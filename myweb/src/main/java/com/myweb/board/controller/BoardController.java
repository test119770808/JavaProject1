package com.myweb.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.board.service.GetListServiceImpl;
import com.myweb.board.service.IBoardService;


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
		}
		
		
		
		
		
		
	}
}
