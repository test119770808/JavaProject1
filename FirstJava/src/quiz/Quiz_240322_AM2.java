package quiz;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Quiz_240322_AM2 {

	public static void main(String[] args) {
		File file = new File("D:/filetest4/윤동주.txt");
		File dir = new File("D:/FileTest/testFile/temp");
		File dstFile = null;
		
		System.out.println("윤동주.txt는 파일인가요? "+file.isFile());
		System.out.println("dir이 존재하나요? "+dir.exists());
		
		FileReader input = null;
		FileWriter output = null;
		
		if(dir.exists()) {
			dstFile = new File(dir.getPath()+"/"+file.getName());
		}else {
			System.out.println("디렉터리가 존재하지 않습니다.");
			dir.mkdirs();
			System.out.println("디랙터리 생성했습니다.");
			dstFile = new File(dir.getPath()+"/"+file.getName());
		}
		try {
			input = new FileReader(file);
			output = new FileWriter(dstFile);
			
			char[] buffer = new char[512];
			
			int readCount = input.read(buffer);
			while (readCount != -1) {
				System.out.print(new String(buffer, 0, readCount));
				output.write(buffer, 0, readCount);
				readCount = input.read(buffer);
			}
			System.out.println();
			System.out.println("파일 복사되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
				output.close();
			} catch (Exception e2) {}
		}
		
	}

}
