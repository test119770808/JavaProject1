import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class F02_fileINputStreamEx1 {

	public static void main(String[] args) {
		
		InputStream fis = null;
		
		try {
			//FileInputStream(읽을 파일 경로) 객체 생성
			File file = new File("D:/FileTest/test.txt");
			fis = new FileInputStream(file);
			
			//버퍼 공간 
			byte[] buffer = new byte[1000];
			String content = "";
			// 데이터 읽기
			while(true) {
				int data = fis.read(buffer);  // 주어진 버퍼에 데이터를 담아서 처리 반환값 데이터 길이
//				int data = fis.read();        // read() 반환값이 저장된 값을 반환 
//				System.out.print((char)data);  // read() 1바이트 단위로 읽고 있음.. char 2바이트  
				System.out.println(data);
				// 데이터 읽기가 끝날 때...  -1인 경우
				if (data != -1) content = new String(buffer, 0, data); //진행
				else break; //끝
				System.out.println(content);
//				if (data == -1) break;
			}
			
			// 다른 방식으로 읽기
			int readCount = fis.read(buffer);  //처음 블럭 읽기
			while (readCount != -1) {
				String data = new String(buffer, 0, readCount);  // 데이터 처리..
				System.out.println(data);
				readCount = fis.read(buffer);  //다음 블럭 읽기
			}
			
		} catch (FileNotFoundException fe) {
			System.out.println("해당 경로의 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			// 객체 정리... 
			try {fis.close();} catch (Exception e2) {e2.printStackTrace();}
		}
		
		
		
		

	}

}
