package f;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class F07_bufferdReadWriteEx {

	public static void main(String[] args) {
		
		String htmlCode = "<html><head><style>\n";
		htmlCode += "div { \n"
				+"		width: 100px; \n"
				+"		height: 100px; \n"
				+"		color: white; \n"
				+"		background: red; \n"
				+"		padding: 50px; \n"
				+"		font-size: 30px; \n"
				+"}\n";
		htmlCode += "</style></head><body>";
		htmlCode += "<div>Hello HTML!</div>";
		htmlCode += "</body></html>";
		
		String path = "D:/FileTest/index.html";
		write(path, htmlCode);
		
		System.out.println(read(path));
				

	}
	
	public static String read(String path) {
		// String read(path)
		File f = new File(path);
		
		// 입력 객체 선언
		FileReader fr = null;
		BufferedReader br = null;
		
		String code = null;
		
		// 작업
		try {
			code = new String();
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				code += line;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br!=null) br.close();
				if (fr!=null) fr.close();
			} catch (Exception e2) {}
		}
		
		return code;
	}
	
	public static void write(String path, String code) {
		// write(path, htmlCode)
		File f = new File(path);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		// bufferedWriter가 flush를 호출하는 경우!
		// 1. 설정한 버퍼가 가득 찼을 경우
		// 2. flush()를 호출했을 때
		// 3. close()를 할 때
		
		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			
			bw.write(code);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
				if(fw != null) fw.close();
			} catch (Exception e2) {}
		}
		
	}

}
