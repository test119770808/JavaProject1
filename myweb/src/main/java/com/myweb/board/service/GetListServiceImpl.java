package com.myweb.board.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.board.model.BoardDAO;
import com.myweb.board.model.BoardVO;

public class GetListServiceImpl implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// DAO객체 생성
		BoardDAO dao = BoardDAO.getInstance();
		ArrayList<BoardVO> list = dao.getList(); // 목록조회 결과 전달하는 메서드... 반환값 list형태로 처리
		
		request.setAttribute("list", list);
	}

}
