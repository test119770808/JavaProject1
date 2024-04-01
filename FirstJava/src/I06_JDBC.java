import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class I06_JDBC {
	
	public static void main(String[] args) {
		// JDBC 연동 테스트
		
		// 데이터베이스 연결 객체 (Connection 객체)
		Connection conn = null;
		
		// checkedException : SQLException 
		try {
			// 1. 드라이버 로드
			//  MySQL 사용 드라이버
			// MySQL 6.xx 버전 이전 : com.mysql.jdbc.Driver
			// MySQL 6.xx 버전 이후 : com.mysql.cj.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. Connection 객체 생성 - DriverManger
			// MySQL 6.xx 미만인 경우 : jdbc:mysql://호스트이름:포트번호/DB이름
			// MySQL 6.xx 이후인 경우 : jdbc:mysql://호스트이름:포트번호/DB이름?serverTimezone=UTC
			//  서울 UTC 값 : Asia/Seoul
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb?serverTimezone=Asia/Seoul", 
					"root", 
					"root1234");
			System.out.println(conn);
			System.out.println("데이터베이스 접속 성공!!");
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 오류");
			System.out.println(sqle.getMessage());
		} finally {
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
