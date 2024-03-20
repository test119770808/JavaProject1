package b;
import java.util.Scanner;

public class B04_forInfinity {

	public static void main(String[] args) {
		// for문의 무한 루프
//		for (int i=0;true;i++) {  //condition 부분이 항상 참이되는 경우... 
//			System.out.println(i);
//		}
		
//		for (;;) {
//			System.out.println('a');
//		}
		// 이런 무한 루프문은 항상 빠져나올 코드를 만들어 놓아야 합니다. 
		
		// break문
		// 반복문에서 사용할 수 있어요!!
		// 반복문에서 break를 만나면 반복문을 종료- 탈출
		// 다중 반복문 내부에 속해 있더라도 break를 만나면 해당 break가 속한 반복문 하나는 탈출
//		for(int i = 0; true; i++) {
//			System.out.println(i);
//			for (int j = 0; true ; j++) {
//				System.out.println("j반복");
//				if(j == 58) {
//					break;
//				}
//			}
//		}

		// 무한 반복 활용 예
		String answer = "자동차";
		Scanner scan = new Scanner(System.in);
		
//		for(;;) {
//			System.out.print("> ");
//			String attempt = scan.nextLine();
//			if(answer.equals(attempt)) {   // 문자열 비교는 "=="를 사용X, equals() 메서드 사용!!!
//				System.out.println("정답!!!");
//				break;
//			}
//		}
		
		String attempt = "";
		for (;!attempt.contentEquals(answer);) {
			System.out.print("> ");
			attempt = scan.nextLine();
		}
		System.out.println("정답!!!");
		
		scan.close();
		
	}

}
