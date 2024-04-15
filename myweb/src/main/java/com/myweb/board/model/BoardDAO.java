package com.myweb.board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	
	private static BoardDAO instance = new BoardDAO();
	
	private BoardDAO() {
		try {
			InitialContext ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mysql2");
		} catch (Exception e) {
			System.out.println("커넥션 풀링 에러 발생");
		}
	}

	public static BoardDAO getInstance() {
		return instance;
	}
	
	private DataSource ds;
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	//---------------- 메서드들 -------------------------
	
	
	
	
	
	

}
