package f;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import obj.Customer;

public class F13_readCustomerEx {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("customer.ser");
			ois = new ObjectInputStream(fis);
			
			Customer cus1 = (Customer)ois.readObject();
			Customer cus2 = (Customer)ois.readObject();
			System.out.println(cus1.toString());
			System.out.println(cus2);
			System.out.println(cus1.isJoin());
			System.out.println(cus2.isJoin());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(ois != null) ois.close();
			} catch (Exception e2) {}
		}

	}

}
