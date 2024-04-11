package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCSelect {

	public static void main(String[] args) {
		// DB 접속을 위한 변수 선언 url, id, pw, Connection, PreparedStatement, ResultSet
		String url = "jdbc:mysql://localhost:3306/jdbctest?serverTimezone=Asia/Seoul";
		String id = "jdbc";
		String pw = "jdbc";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from members";
		// DB연결 및 연동 작업 try ~ catch
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pw);
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String id1 = rs.getString("id");
				String pw1 = rs.getString("pw");
				String name = rs.getString("name");
				String email = rs.getString("email");
				System.out.printf("id : %s\npw : %s\nname : %s\nemail : %s\n",
						id1,pw1,name,email);
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
	

	}

}
