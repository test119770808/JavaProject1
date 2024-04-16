package com.myweb.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.board.model.BoardDAO;
import com.myweb.board.model.BoardVO;

public class ContentServiceImpl implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		/*
		 * 1. dao에 getContent(num) 메서드를 생성하고, 호출
		 * 2. getContent()메서드에서는 num을 가지고, 게시글에 대한 정보를 조회해서 
		 *    vo에 담는 코드를 작성
		 * 3. 메서드 리턴타입 BoardVO
		 * 4. 화면전송을 위한 리턴값을 vo라는 이름으로 강제 저장
		 */
		
		String num = request.getParameter("num");
		
		BoardDAO dao = BoardDAO.getInstance();
		BoardVO vo = dao.getContent(num);
		
		request.setAttribute("vo", vo);

	}

}
