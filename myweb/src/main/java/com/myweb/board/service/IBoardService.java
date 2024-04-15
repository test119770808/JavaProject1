package com.myweb.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IBoardService {
	
	// service 클래스에서 구현할 메서드를 추상 메서드로 선언 => 어떻게 사용할지 내용을 정의
	// request와 response의 정보를 그대로 전달 받을 수 있게 선언
	public void execute(HttpServletRequest request, HttpServletResponse response);
	

}
