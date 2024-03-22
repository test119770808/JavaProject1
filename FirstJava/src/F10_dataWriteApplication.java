import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class F10_dataWriteApplication {

	public static void main(String[] args) {
		// 단순 텍스트 방식과 달리 필드 구분자 레코드 구분가 추가되지 않아도 됩니다.
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("customer.data");
			dos = new DataOutputStream(fos);
			dos.writeUTF("홍길동"); dos.writeChar('M');
			dos.writeUTF("hong@naver.com"); dos.writeInt(1589);
			dos.writeUTF("유관순"); dos.writeChar('F');
			dos.writeUTF("you@naver.com"); dos.writeInt(1890);
			System.out.println("File saved");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (dos != null) dos.close();
			} catch (Exception e2) {}
		}

	}

}
