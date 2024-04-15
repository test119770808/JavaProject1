package com.myweb.user.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.myweb.util.JdbcUtil;

public class UserDAO {
	
	/*
	 *  DAO는 싱글톤 디자인 패턴으로 작성
	 */
	// 1. 스스로 객체를 참조하는 멤버변수를 선언하고, 1개로 제한
	private static UserDAO instance = new UserDAO();
	
	// 2. 외부에서 객체를 생성할 수 없게 생성자를 private로 설정
	private UserDAO() {
		try {
			InitialContext ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mysql2");
		} catch (NamingException e) {
			System.out.println("커넥션 풀링 에러 발생");
		}
		
	}

	// 3. 외부에서 객체를 요구할 때 전달할 수 있게 getter설정
	public static UserDAO getInstance() {
		return instance;
	}
	
	// DB연결을 위한 객체 선언.... 
	private DataSource ds;
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// 메서드들..... 
	// 중복확인 메서드
	public int IdConfirm(String id) {
		int result = 0;
	
		String sql = "select * from users where id = ?";
		
		try {
			// Connection Pool
			conn = ds.getConnection();
			
			// PreparedStatement 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			// SQL 실행
			rs = pstmt.executeQuery();
			if (rs.next()) result = 1;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		
		return result;
	}
	
	// 회원 가입 메서드
	public int join(UserVO vo) {
		int result = 0;
		
		String sql = "insert into users(id, pw, name, email, address) "
				+ "values(?,?,?,?,?)";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getEmail());
			pstmt.setString(5, vo.getAddress());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		
		return result;
	}
	
	// 로그인 메서드
	public int login(String id, String pw) {
		int result = 0;
		
		String sql = "select * from users where id = ? and pw = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			if (rs.next()) result = 1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		
		return result;
	}
	
	// 회원정보를 얻어오는 메서드
	public UserVO getUserInfo(String id1) {
		UserVO vo = null;
		
		String sql = "select * from users where id = ?";
		
		try {
			// Connection Pool
			conn = ds.getConnection();
			
			// PreparedStatement 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id1);
			// SQL 실행
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				Timestamp regdate = rs.getTimestamp("regdate");
				
				vo = new UserVO(id, null, name, email, address, regdate);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		
		
		return vo;
	}
	
	// 회원 정보 수정
	public int update(UserVO vo) {
		int result = 0;
		
		String sql = "update users set name = ?, email = ?, address = ? "
				+ "where id = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getEmail());
			pstmt.setString(3, vo.getAddress());
			pstmt.setString(4, vo.getId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		
		return result;
	}
	
	// 패스워드 변경 메서드 
	public int changePassword(String id, String newPw) {
		int result = 0;
		
		String sql = "update users set pw = ? where id = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newPw);
			pstmt.setString(2, id);
	
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		
		return result;
	}
	
	
}
