package com.myweb.user.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

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
	

}
