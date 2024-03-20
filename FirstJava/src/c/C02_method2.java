package c;
import java.util.Scanner;

public class C02_method2 {

	public static void main(String[] args) {
		// 메서드.. 정리
		
		// 메서드의 반환 설저은 키워드 'return'을 사용합니다. 
		// return은 메서드 실행을 끝내고, 결과 값을 호출될 부분에 반환하는 키워드
		// 사용법은 return '반환값' 으로 사용하고, 반환 값이 없이 사용되는 return은 함수의 종료만을
		// 의미하게 되어 호출된 위치로 이동하게 됨. 
		// 만약 return에 연산식을 사용하여 처리하는 그 결과 값과 제어(호출위치로 이동)가 함께 동작합니다.
		
		/*
		 *  메서드 형식(선언 방법)
		 *  <반환 유형> <메서드 식별자-이름>(매개변수) {
		 *  	기능 상세부분... 
		 *   } 
		 * 
		 *  매서드 구분, 매개변수와 반환값으로 구분... 
		 *  - 유형1 : 매개변수가 있고, 반환값이 있는 경우! 전달 인자(o), 반환값(o)
		 *  - 유형2 : 매개변수가 있고, 반환값이 없는 경우! 전달 인자(o), 반환값(x)
		 *  - 유형3 : 매개변수가 없고, 반환값이 있는 경우! 전달 인자(x), 반환값(o)
		 *  - 유형4 : 매개변수가 없고, 반환값이 없는 경우! 전달 인자(x), 반환값(x)
		 * 
		 *  ** 매개변수(parameter)
		 *  - 매개변수는 메서드가 실행될 때에 필요한 데이터를 외부로부터 받기 위해서 사용함.
		 *  - 매개변수도 변수의 일종으로 데이터 타입과 함께 선언해서 사용해야 합니다. 단, 초기화는 하지 않음
		 *  - 매개변수를 여러개 선언할 수 있고, 메서드가 외부로부터 받을 데이터가 없다면 선언하지 않아도 됨.
		 *    그리고, 매개 변수가 없다면 반환 유형 처림 void는 사용하지 않고, 소괄호로 안을 비워 둡니다. 
		 *    
		 *  ** 반환 유형(return type)
		 *  - 반환 유형은 메서드가 실행한 후에 메서드를 호출한 곳에서 반환하는 값을 전달하는 데이터... 
		 *  - 메서드는 반환값이 있을 수 있고, 없을 수도 있는데 없는 경우에는 반환 유형에 "void"를 사용합니다.
		 *  - 반환값이 있는 메서드를 호출할 때는 해당 반환 유형에 맞는 변수에 반환값을 저장해야 합니다. 
		 *  - 메서드 실행에 결과값을 반환할 때는 return 키워드를 사용합니다.
		 */
		
		print();
		int num1 = input();
		int num2 = input();
		
		int result = add(num1, num2);
		showResult(result);

	}
	
	// 유형1
	static int add (int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	// 유형2
	static void showResult(int result) {
		System.out.println("덧셈 결과 : "+result);
	}
	
	// 유형3
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 >>");
		int num = scan.nextInt();
		return num;
	}
	
	// 유형4
	static void print() {
		System.out.println("정수 두개 입력하세요.!!");
	}
	

}
