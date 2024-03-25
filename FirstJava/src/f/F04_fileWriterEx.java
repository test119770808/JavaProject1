package f;
import java.io.File;
import java.io.FileWriter;

public class F04_fileWriterEx {

	public static void main(String[] args) {
		
		File file = new File("D:/FileTest/wr.txt");
		
		FileWriter out = null;
		
		try {
			// FileWriter 객체 생성
			out = new FileWriter(file, true); //append가 false이면 추가 x, true 추가 O
			// 작업 진행... 
			out.write("테스트를 위한 메시지!!!!\n");
			out.write("테스트를 위한 메시지2....\n");
			out.append("테스트를 위한 메시지3....\n");
			out.append("테스트를 위한 메시지4....\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {out.close();} catch (Exception e2) {}
		}
		

	}

}
