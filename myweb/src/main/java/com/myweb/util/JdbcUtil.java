package com.myweb.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcUtil {
	
	// connection, preparestatement, resultset 닫는 메서드
	public static void close(
			Connection conn, 
			PreparedStatement pstmt, 
			ResultSet rs) {
		try {
			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
