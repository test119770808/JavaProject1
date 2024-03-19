//package obj.exception;
//
//import java.io.IOException;
//import java.sql.SQLException;
//
//public class Child extends Parent {
//	
//	@Override
//	public void doIt() throws SQLException {   
//		//부모가 throws하지 않은 Exception은 throws할 수 없다... 
//		System.out.println("Child.doIt");
//		try {
//			super.doIt();
//		} catch (IOException e) {
//			throw new SQLException(e.getMessage());
//		}
//	}
//
//}
