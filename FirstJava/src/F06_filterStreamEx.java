import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class F06_filterStreamEx {

	public static void main(String[] args) {
		// filterStream
		
		// 선언
		FileReader input = null;
		FileWriter output = null;
		BufferedReader bufInput = null;
		BufferedWriter bufOutput = null;
		
		try {
			File inFile = new File("D:/FileTest/testFile/test.txt");
			File outFile = new File("D:/FileTest/testFile/test_out.txt");
			
			// 필터 스트림은 대상이 노드 스트림을 대상... 
			// 노드 스트림
			input = new FileReader(inFile);
			output = new FileWriter(outFile);
			
			// 필터 스트림
			bufInput = new BufferedReader(input);
			bufOutput = new BufferedWriter(output);
			
			String line;
			line = bufInput.readLine();  // 문자열에 "\n"을 만날때까지 입력. 없으면 null 반환
			System.out.println(line);
			while(line != null) {
				bufOutput.write(line, 0, line.length());
				bufOutput.newLine(); // 줄바꿈 + "\n"을 입력한 것과 같다... 
				line = bufInput.readLine();
			}
			System.out.println(inFile + " >> "+outFile);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bufInput != null) bufInput.close();
				if(bufOutput != null) bufOutput.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
