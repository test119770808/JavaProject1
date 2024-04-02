package mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonsDAO {
	
	String url = "jdbc:mariadb://localhost:13306/testdb";
	String user = "root";
	String password = "root1234";
	
	// DB 연동을 위한 객체 선언
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public PersonsDAO() {
		try {
			// 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("DB연동 실패");
			System.out.println(sqle.getMessage());
		}
	}
	
	public PersonsDAO(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
		
		try {
			// 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("DB연동 실패");
			System.out.println(sqle.getMessage());
		}
	}
	
	// insert
	public int insertPersons(PersonsVO vo) {
		int result = 0;
		
		String sql = "insert into Persons (lastName, firstName, age, City) "
				+ "values('"+vo.getLastName()+"','"+vo.getFirstName()+"',"
				+vo.getAge()+" ,'"+vo.getCity()+"')";
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("SQL 연동 실패");
			System.out.println(e.getMessage());
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch (Exception e2) {}
		}
		
		return result;
	}
	
	// selectAll
	public List<PersonsVO> selectAll() {
		List<PersonsVO> list = new ArrayList<>();
		
		String sql = "select * from Persons Order by id desc";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String lastName = rs.getString("lastName");
				String firstName = rs.getString("firstName");
				int age = rs.getInt("age");
				String city = rs.getString("city");
				PersonsVO vo = new PersonsVO(id, lastName, firstName, age, city);
				list.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("SQL 연동 실패");
			System.out.println(e.getMessage());
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {}
		}
		return list;
	}
	// selectOne
	public PersonsVO selectOne(int id) {
		PersonsVO vo = null;
		
		String sql = "select * from Persons where id = '"+id+"'";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				vo = new PersonsVO(rs.getInt("id"),
						rs.getString("lastName"),
						rs.getString("firstName"), 
						rs.getInt("age"), 
						rs.getString("city"));
			}
		} catch (SQLException e) {
			System.out.println("SQL 연동 실패");
			System.out.println(e.getMessage());
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return vo;
	}
	// update
	public int updatePersons(PersonsVO vo) {
		int result = 0;
		
		String sql = "update Persons set lastName='"+vo.getLastName()+
				"', firstName='"+vo.getFirstName()+"', age="+vo.getAge()+
				" , city='"+vo.getCity()+"' where id='"+vo.getId()+"'";
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("SQL연동 실패");
			System.out.println(e.getMessage());
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch (Exception e2) {}
		}
		
		return result;
	}
	// delete
	public int deletePersons(int id) {
		int result = 0;
		
		String sql = "delete from Persons where id = '"+id+"'";
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("SQL연동 실패");
			System.out.println(e.getMessage());
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch (Exception e2) {}
		}
		
		return result;
	}

}
