import java.io.DataInputStream;
import java.io.FileInputStream;

public class F11_dataReadApplication {

	public static void main(String[] args) {
		// DataRead
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("customer.data");
			dis = new DataInputStream(fis);
			String name = null;
			while((name = dis.readUTF()) != null) {
				System.out.println(name);
				System.out.println(dis.readChar());
				System.out.println(dis.readUTF());
				System.out.println(dis.readInt());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {if(dis!=null) dis.close();} catch (Exception e2) {}
		}

	}

}
