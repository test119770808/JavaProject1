package d;

public class D07_tryCatchEx {

	public static void main(String[] args) {
		// try ~ catch ~ finally ~
		int i = 0;
		String[] greetings = {"안녕하세요.","반갑습니다.","또 오세요"};
		while (i < 4) {
			try {
				System.out.println(greetings[i]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("예외가 발생했습니다.");
				System.out.println("예외가 발생한 원인은 "+e.getMessage());
				System.out.println("예외처리 작업 끝입니다.");
			}finally {
				System.out.println("finally는 항상 실행되요... ");
			}
			i++;
		}
		System.out.println("메인의 마지막입니다.");
	}

}
