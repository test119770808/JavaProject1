import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class F09_textReadApplication {

	public static void main(String[] args) {
		// 저장되어 있는 customer.txt 를 불러와 처리하기
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("customer.txt");
			br = new BufferedReader(fr);
			String data = null;
			while((data = br.readLine()) != null) {
				String[] member = data.split(",");
				System.out.println(Arrays.toString(member));
				int birthYear = Integer.parseInt(member[3]);
				if(birthYear >= 1000) {
					System.out.println(data);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(br!=null) try {br.close();} catch (Exception e2) {}
		}

	}

}
