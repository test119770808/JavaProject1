
// 들여쓰기 규칙

public class A02_Escape {

	public static void main(String[] args) {
		// Escape Sequence : 특수한 기능을 가진 문자
		// 앞에 \(역슬래쉬)가 붙어 있는 문자는 이스케이프 문자로 인식됨.
		// ex) \n(줄바꿈), \t(탭), \\(\문자), \"(문자 "), \'(문자 ') 등등... 
		
		System.out.println("안녕하세요. 반\n갑습니다.");
		System.out.println("안녕하세요. 반\t갑습니다.");
		System.out.println("안녕하세요. 반\\갑습니다.");
		System.out.println("C:\\User\\Test\\Desktop");
		System.out.println("나는 \"철수\"랑 게임을 했다.");
		System.out.println("나는 \'철수\'랑 게임을 했다.");
		System.out.println('\'');
	
	}

}
