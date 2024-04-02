import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class I10_mariadb {

	public static void main(String[] args) {
		// Mariadb 연결
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost:13306/testdb", 
					"root", 
					"root1234");
			System.out.println(conn);
			System.out.println("데이터베이스 접속 성공!!!");
			
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("SQL연동 실패");
			System.out.println(sqle.getMessage());
		}
		
		

	}

}
