package com.myweb.board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.myweb.util.Criteria;
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
		
		System.out.println("writer : "+writer);
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, writer);
			pstmt.setString(2, title);
			pstmt.setString(3, content);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		
	}
	
//	// 게시글 목록 가져오기
//	public ArrayList<BoardVO> getList() {
//		ArrayList<BoardVO> list = new ArrayList<>();
//		
//		String sql = "select * from board order by num desc";
//		
//		try {
//			conn = ds.getConnection();
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			
//			while(rs.next()) {
//				int num = rs.getInt("num");
//				String writer = rs.getString("writer");
//				String title = rs.getString("title");
//				String content = rs.getString("content");
//				Timestamp regdate = rs.getTimestamp("regdate");
//				int hit = rs.getInt("hit");
//				
//				BoardVO vo = new BoardVO(num, writer, title, content, regdate, hit);
//				
//				//생성된 vo를 리스트에 추가
//				list.add(vo);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			JdbcUtil.close(conn, pstmt, rs);
//		}
//		
//		return list;
//	}
	
	//페이징 처리된 getList(Criteria cri)
	public ArrayList<BoardVO> getList(Criteria cri) {
		ArrayList<BoardVO> list = new ArrayList<>();
		
		String sql = "select * from board order by num desc limit ?,?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, cri.getPageStart());
			pstmt.setInt(2, cri.getCount());
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int num = rs.getInt("num");
				String writer = rs.getString("writer");
				String title = rs.getString("title");
				String content = rs.getString("content");
				Timestamp regdate = rs.getTimestamp("regdate");
				int hit = rs.getInt("hit");
				
				BoardVO vo = new BoardVO(num, writer, title, content, regdate, hit);
				
				//생성된 vo를 리스트에 추가
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		
		return list;
	}
	
	// getTotal() - 총 게시물 수
	public int getTotal() {
		int result = 0;
		String sql = "select count(*) as total from board";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = rs.getInt("total");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
				
		return result;
	}
	
	// Content 메서드 구현
	public BoardVO getContent(String num) {
		BoardVO vo = null;
		
		String sql = "select * from board where num = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(num));
			
			rs = pstmt.executeQuery();
			if (rs.next()) {
				vo = new BoardVO();
				vo.setNum(rs.getInt("num"));vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));vo.setContent(rs.getString("content"));
				vo.setRegdate(rs.getTimestamp("regdate"));vo.setHit(rs.getInt("hit"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		return vo;
	}
	
	//update 메서드
	public void update(String num, String title, String content) {
		
		String sql = "update board set title = ?, content = ? where num = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setInt(3, Integer.parseInt(num));
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
	}
	
	// delete 메서드
	public void delete(String num) {
		String sql = "delete from board where num = ?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
	}
	

}
