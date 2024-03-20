package b;
import java.util.Scanner;

public class B06_whileExample {

	public static void main(String[] args) {
		//while문.. 
		// for문 보다 좀더 자유도가 높은 반복문
		// 왜? for문(for(초기값;조건;증감값))과 달리 while은 조건이 참인지 여부만 확인!!
		
		/*
		 *   (형식)
		 *   while (condition) {
		 *   	조건이 참일 때에 실행할 명령문들... 
		 *   }
		 * 
		 */
		
		// 증가값의 위치에 따라서 결과에 차이가 존재할 수 있음...
//		int i = 0;  //시작값
//		 
//		while (i < 10) {  // 조건
////			i ++;  //증가값  
//			System.out.println(i);
//			i ++;
//		}
//		
//		// while의 무한 루프
//		while (true) {
//			System.out.println(i += 10000);
//			if(i % 20000 == 0)
//				continue;
//			if (i < 0)     // 반복 종료 시점... 
//				break;     
//		}
//		
		// do - while 구문 : 거의 안씀... 
		// 반복할 때에 무조건 한번 이상 실행해야 하는 경우... 
		int i = 0;
		
		Scanner scan = new Scanner(System.in);
		
//		while((i = scan.nextInt()) != 0) {
//			System.out.println("i가 0이 아닙니다.");
//		}
//		
		do {
			System.out.print("> ");
			i = scan.nextInt();
			System.out.println("i가 0이어도 일단 한번은 실행해요... ");
		}while(i != 0);
		
		scan.close();
		
	}
}
