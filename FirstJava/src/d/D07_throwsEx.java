package d;

public class D07_throwsEx {
	
	private static String[] greetings = {"안녕하세요.","반갑습니다.","또 오세요"};
	
	public static void doIt(int index) throws ArrayIndexOutOfBoundsException {
		System.out.println(greetings[index]);
	}
	
	public static void doIt2(int index) {
		try {
			System.out.println(greetings[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 인덱스입니다.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		int i = (int)(Math.random()*4);
		try {
			doIt(i);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("main에서 i가 잘못 선택되었습니다. 다음 명령문으로 넘어갑니다.");
		}
		doIt2(i);
		System.out.println("다음 명령문이 실행되었습니다.");

	}

}
