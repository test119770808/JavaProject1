import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class I09_sqliteDB {

	public static void main(String[] args) {
		// SQLite DB연결하기
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName("org.sqlite.JDBC");
			
			// 2. Connection 객체 생성
			String dbfile = "SQLiteDB.db";  // 실제 DB이 있는 경로... 
			String url = "jdbc:sqlite:"+dbfile;
			// url -> jdbc:sqlite:SQLiteDB.db
			
			conn = DriverManager.getConnection(url);
			System.out.println("DB 동작에 문제가 없어요!");
			
			// 3. stmt 객체 생성
			stmt = conn.createStatement();
			String sql = "create table if not exists test_table("
											+ "id integer primary key,"
											+ "lastName text(20) not null,"
											+ "firstName text(20),"
											+ "age numeric,"
											+ "city text(20) default 'Seoul')";
			int result = stmt.executeUpdate(sql);
			System.out.println("sql 처리 결과 : "+result);
			stmt.close();
			
			// CRUD 테스트 하세요~~~~
			String insertSql = "insert into test_table(id,lastname,firstname,age,city)values"
					+ "(1,'test1','test1',11,'Daegu')";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(insertSql);
			System.out.println("sql 처리 결과 : "+result);
			stmt.close();
			
			String selectSql = "select * from test_table";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(selectSql);
			while(rs.next()) {
				System.out.println("id: "+rs.getInt("id")+", lastname: "+
			rs.getString("lastname")+", firstname: "+rs.getString("firstname")
			+", age: "+rs.getInt("age")+", city:"+rs.getString("city"));
			}
			stmt.close();
			rs.close();
		
			// CRUD 테스트 하세요~~~~
			String updateSql = "update test_table set city = 'Seoul' where id = 1";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(updateSql);
			System.out.println("sql 처리 결과 : "+result);
			stmt.close();
			
			System.out.println("수정 결과 확인 ");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(selectSql);
			while(rs.next()) {
				System.out.println("id: "+rs.getInt("id")+", lastname: "+
			rs.getString("lastname")+", firstname: "+rs.getString("firstname")
			+", age: "+rs.getInt("age")+", city:"+rs.getString("city"));
			}
			stmt.close();
			rs.close();
			
			String deleteSql = "delete from test_table where id = 1";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(deleteSql);
			System.out.println("삭제 처리결과 : "+result);
			stmt.close();
			
			
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("SQL연동 실패");
			System.out.println(sqle.getMessage());
		} finally {
			try {
				if (conn != null) conn.close();
				if (stmt != null) stmt.close();
				if (rs != null) rs.close();
			} catch (Exception e2) {}
		}

	}

}
