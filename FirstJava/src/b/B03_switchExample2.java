package b;
import java.util.Scanner;

public class B03_switchExample2 {

	public static void main(String[] args) {
		// switch case문을 사용하여 특정 문자를 입력받는 경우 내용 출력
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
//		System.out.println(str);
//		System.out.println(str.charAt(0));  
		//charAt(int)는 인자 int에 들어가는 문자열 값의 위치에 있는 char를 출력 시작은 0부터... 

		switch(str.charAt(0)) {
		case 'I':
		case 'ㅑ':
		case 'i':
			System.out.println("데이터를 입력합니다.");
			break;
		case 'ㅕ':
		case 'U':
		case 'u':
			System.out.println("데이터를 수정합니다.");
			break;
		default:
			System.out.println("명령어가 올바르지 않습니다.");
			break;
		}
		
	}

}
