package com.myweb.board.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.board.model.BoardDAO;
import com.myweb.board.model.BoardVO;
import com.myweb.util.Criteria;
import com.myweb.util.PageVO;

public class GetListServiceImpl implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		/*
		// DAO객체 생성
		BoardDAO dao = BoardDAO.getInstance();
		ArrayList<BoardVO> list = dao.getList(); // 목록조회 결과 전달하는 메서드... 반환값 list형태로 처리
		
		request.setAttribute("list", list);
		*/
		
		// 페이징 처리
		BoardDAO dao = BoardDAO.getInstance();
		
		Criteria cri = new Criteria();
		
		if(request.getParameter("pageNum")!= null) {
			String pageNum = request.getParameter("pageNum");
			cri.setPageNum(Integer.parseInt(pageNum));
		}
		
		ArrayList<BoardVO> list = dao.getList(cri);
		
		request.setAttribute("list", list);
		
		//화면에 보여질 페이지 버튼을 계산 처리... 
		// 1. 총게시물 수
		int total = dao.getTotal();
		
		PageVO vo = new PageVO(total, cri);
		
		request.setAttribute("pageVO", vo);
		
		
		
		
	}

}
