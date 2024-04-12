package com.jdbc.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class UserDAO {
	
	// 싱글톤 패턴은 하나의 객체만 생성하여 사용하도록 만드는 패턴 - 객체를 1개로 제한.
	// 여러개의 객체가 생성되게하면 메모리 과부하가 올 수 있는 경우에 사용. 
	// DAO객체는 DB연동을 담당하는 클래스로 싱글톤 방식으로 생성... 
	private DataSource ds;
	
	// 1. 스스로의 객체를 멤버변수로 선언하고 1개로 제한. 
	private static UserDAO instance = new UserDAO();
	
	// 2. 외부에서 객체를 생성할 수 없게 생성자에 private 설정
	private UserDAO() {
		// 생성자가 한번 동작할 때 다음과 같은 동작 처리... 드라이버와 연결... 
		try {
			// 커넥션 풀을 꺼내는 작업
			InitialContext ctx = new InitialContext(); //초기 설정파일 저장되는 객체
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mysql");
		} catch (NamingException e) {
			System.out.println("커넥션 풀링 에러 발생");
		}
	}
	
	// 3. 외부에서 객체를 요구할 때 getter를 써서 반환
	public static UserDAO getInstance() {
		return instance;
	}
	
	
	//------------- 중복되는 코드를 멤버변수로 선언----------
//	private String url = "jdbc:mysql://localhost:3306/jdbctest?serverTimezone=Asia/Seoul";
//	private String user = "jdbc";
//	private String password = "jdbc";
	
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	//--------------기능을 메서드로 선언 ------------------
	//회원가입
	public int join(UserVO vo) {
		int result = 0;
		
		String sql = "insert into user values(?,?,?,?,?,?)";
		
		try {
			// Connection 객체 생성
//			conn = DriverManager.getConnection(url, user, password);
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getPhone1());
			pstmt.setString(5, vo.getPhone2());
			pstmt.setString(6, vo.getGender());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {}
		}
		
		return result;
	}
	
	// 로그인 메서드
	public int login(String id, String pw) {
		int result = 0;
		
		String sql = "select * from user where id = ? and pw = ?";
		
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
			try {
				if(conn !=null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return result;
	}

	// 회원 정보 조회
	public UserVO getInfo(String id) {
		UserVO vo = null;
		
		String sql = "select * from user where id = ?";
		
		try {
			// conn객체 생성
			conn = ds.getConnection();
			// pstmt 객체 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			// sql 실행
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String name = rs.getString("name");
				String phone1 = rs.getString("phone1");
				String phone2 = rs.getString("phone2");
				String gender = rs.getString("gender");
				
				vo = new UserVO(id, null, name, phone1, phone2, gender);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {}
		}
		
		return vo;
	}
	
	// update 메서드
	public int update(UserVO vo) {
		int result = 0;
		
		String sql = "update user set name=?, phone1=?, phone2=?, gender=? "
				+ "where id=?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPhone1());
			pstmt.setString(3, vo.getPhone2());
			pstmt.setString(4, vo.getGender());
			pstmt.setString(5, vo.getId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e) {}
		}
		
		return result;
	}
	
	// 회원 정보 삭제
	public int delete(String id) {
		int result = 0;
		
		String sql = "delete from user where id = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e) {}
		}
		
		return result;
	}
	
	
}
