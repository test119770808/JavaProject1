package com.myweb.board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.myweb.util.JdbcUtil;

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
	
	// 게시글 등록 메서드
	public void regist(String writer, String title, String content) {
		String sql = "insert into board(writer, title, content) values(?,?,?)";
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		
		
		
	}
	
	
	
	
	

}
