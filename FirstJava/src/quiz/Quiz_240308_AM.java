package quiz;

import java.util.Scanner;

public class Quiz_240308_AM {

	public static void main(String[] args) {
		// quiz-1 
		// 1 ~ 101미만의 임의의 정수를 생성하고, 그 숫자가 짝수인지 홀수인지 출력하세요.(3항 연산식을 사용)
		int num = (int)(Math.random()*100) + 1; 
		System.out.println("랜덤 수는 : "+num);
		System.out.println("3항 연산의 결과 : "+(num%2 == 0? "짝수" : "홀수" ));
		// quiz-2
		// -5 ~ 5 사이의 임의의 정수를 생성하고, 삼항연산식을 사용하여 절대값을 출력하세요
		// 0 <= x <=10, y가 -5 <= y <= 5의 식을 구하세요... => 5-x = y
		int num2 = 5 - (int)(Math.random()*11);
		System.out.println("랜덤 수는 : "+num2);
		int abs = (num2 >=0 ? num2 : -num2); // -num2 => num2 * -1
		System.out.println(num2+"의 절대값은 : "+abs);
		// quiz-3
		// 정수를 입력받아 그 수가 짝수 인지 홀수인지 출력하는 프로그램을 작성하세요.(3항 연산식을 사용하세요)
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num3 = scan.nextInt();
		String result = num3%2 == 0 ? "짝수" : "홀수";
		System.out.println("입력받은 "+num3+"는 : "+result);
		
		// quiz-4
		// 키와 나이를 입력받아서 놀이기구에 탑승 여부를 결정하는 프로그램을 작성하세요.
		// (조건 : 키 - 140 이상, 나이는 8살 이상)
		System.out.println("키와 나이를 입력하세요");
		System.out.print("키 : ");
		double height = scan.nextDouble();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		System.out.println("======================");
		if(height >= 140) {
			if(age >= 8 ) {
				System.out.println("놀이기구 탑승이 가능합니다.");
			}else {
				System.out.println("놀이기구 탑승 불가입니다.");
			}
		}else {
			System.out.println("놀이기구 탑승 불가입니다.");
		}
		
		// quiz-5
		//	정수 두개를 입력받아서 큰수를 출력. 같은 경우에는 같다고 출력하는 프로그램을 작성하세요.
		System.out.println("정수 두개를 입력하세요");
		System.out.print("> ");
		int num51 = scan.nextInt();
		System.out.print("> ");
		int num52 = scan.nextInt();
		
		if (num51 == num52) {
			System.out.println("같은 수 입니다.");
		}else if(num51 > num52) {
			System.out.println(num51 + "이 큰 수 입니다.");
		}else {
			System.out.println(num52 + "이 큰 수 입니다.");
		}
		
		
		// quiz-6
		//  정수를 입력받아서 양의 정수인 경우에는 짝수, 홀수를 구분하고, 0이면 0입니다를 출력, 
		// 음수인 경우에는 음의 정수입니다를 출력하는 프로그램을 작성하세요.
		System.out.println("정수를 입력하세요");
		System.out.print("> ");
		int num6 = scan.nextInt();
		if(num6 > 0) {  // 양의 정수
			if (num6%2 == 0) System.out.println(num6 + "은(는) 짝수입니다.");
			else System.out.println(num6 + "은(는) 홀수입니다.");
		}else if(num6 == 0){  // 0인 경우
			System.out.println("입력한 정수는 0입니다.");
		}else {	//음의 정수
			System.out.println(num6 + "은(는) 음의 정수입니다.");
		}
		
		// quiz-7
		//  Scanner를 사용하여 메뉴를 입력받고, 메뉴의 가격을 출력하는 프로그램을 작성하세요.
		//  (switch를 사용) 수박, 사과, 멜론, 포도, 귤을 구매시 가격을 출력하는 프로그램. 
		System.out.println("구매한 메뉴는? ");
		System.out.println("[수박, 사과, 멜론, 포도, 귤]");
		System.out.print(">> ");
		String fruit = scan.next();
		
		switch(fruit) {
		case "수박":
			System.out.println(fruit + "의 가격은 2만원입니다.");
			break;
		case "사과":
			System.out.println(fruit + "의 가격은 3만원입니다.");
			break;
		case "멜론":
			System.out.println(fruit + "의 가격은 4만원입니다.");
			break;
		case "포도":
			System.out.println(fruit + "의 가격은 5만원입니다.");
			break;
		case "귤":
			System.out.println(fruit + "의 가격은 6만원입니다.");
			break;
		default:
			System.out.println(fruit + "은 메뉴에 없습니다.");
			System.out.println("다시 입력해주세요.");
			break;
		}

		scan.close();
	}

}
