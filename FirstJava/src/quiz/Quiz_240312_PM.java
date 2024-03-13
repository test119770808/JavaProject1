package quiz;

import java.util.Scanner;

public class Quiz_240312_PM {

	public static void main(String[] args) {
		// 1. 소수(PrimeNumber) 구하기
		//   소수는 1과 자기 자신만으로 나누어지는 수를 말함. 
		//   조건문과 반복문을 사용하여 100이하의 소수를 출력해 보세요
		//   (for문 안에 for문)
		System.out.println("======= Prime Number ======");
		int cnt;
		for (int i = 2; i < 100; i++) {
			cnt = 0;  //배수여부 확인...
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					cnt ++;
				}
			}
			
			// 소수인 경우... 
			if (cnt == 2) System.out.print(i + " ");
		}
		System.out.println();
		// 2. 단어 거꾸로 출력하기(reverse 출력)
		//   자바의 Scanner 객체를 이용하여 콘솔에 데이터를 입력
		//   입력된 데이터를 for문을 사용하여 거꾸로(reverse) 출력하세요
		//   (String.charAt(index)를 사용)
//		System.out.println("======== 입력 값 거꾸로 출력하기 ========");
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();   // hello
//		String reverse = "";
//		for (int i = str.length(); i > 0; i--) {
//			reverse += str.charAt(i-1);  // 역으로 읽어서 reverse 대입하기 위해서... 
//			System.out.print(str.charAt(i-1));
//		}
//		System.out.println();  //줄바꿈... 
//		System.out.println("거꾸로 문자열 : "+reverse);
//		scan.close();
		
		// 3. 로또 번호 추출하기
		//   앞서 배운 난수를 활용하여, 중복되는 번호 없이 1 ~ 45까지의 숫자 중
		//   6개의 숫자를 랜덤추출하고, 콘솔에 출력하세요. 
		//   (while문에 for)
		System.out.println("======== 로또 추출 ========");
		int[] lotto = {0,0,0,0,0,0};
		
		int index = 0;
		while(true) {
			// 랜덤값 생성
			int rand = (int)(Math.random()*45) + 1;  // 1 ~ 45
			int i = 0; //index와 값을 비교하기 위해서... 
			for (i = 0; i < index; i++) {
				if(rand == lotto[i]) {  // 추첨된 번호가 중복됨...
					break;
				}
			}
			if(index == i) {  // 추첨된 번호가 lotto에 없어요... 
				lotto[index++] = rand;				
			}
			if(index > 5) break; // 6개 번호 추출 끝
		}
		
		// 결과 추출
		for (int i=0; i< lotto.length; i++) {
			System.out.print(lotto[i]+"\t");
		}
		
		System.out.println();
		// 4. 대문자가 입력된다면 소문자로 출력하고, 
		//   소문자가 입력된다면 대문자로 출력하는 프로그램을 작성해보세요
		Scanner scan = new Scanner(System.in);
		System.out.print(">> ");
		char ch = scan.next().charAt(0); //charAt()
		
		if (ch >= 'A' && ch <= 'Z') {
			ch = (char)(ch - 'A' + 'a');
		}else if (ch >= 'a' && ch <= 'z') {
			ch = (char)(ch - 'a' + 'A');
		}
		System.out.println(ch);		
		
		//문자열을 대문자 문자열 변경...  String.toUpperCase() 
		//문자열을 소문자 문자열 변경...  String.toLowerCase()
		System.out.println("Hello, world!".toUpperCase());
		System.out.println("Hello, world!".toLowerCase());
		
		System.out.println();
		// 5. 커피의 가격은 2000원, 10개 이상 구매하면 초과분에 대해서 
		//   커피는 1500원을 받는다. 
		//   커피의 개수를 입력받고, 총 가격이 얼만인지 계산하여 출력하는 
		//   프로그램을 만들어보세요!
		System.out.println("커피 값 계산 프로그램");
		System.out.print(">");
		int qty = scan.nextInt();  //몇 잔?
		int price = 0;   // 커피 가격
		int normal_price = 2000;
		int discount_price = 1500;
//		if(qty > 10) {
//			price += (10 * normal_price) + (qty - 10) * discount_price;
//		}else {
//			price += qty * normal_price;
//		}
		
		switch (qty / 10) {
		case 0:  // 10잔 미만
			price += qty * normal_price;
			break;
		default: // 10잔 이상인 경우 
			price += (10 * normal_price) + (qty - 10) * discount_price;
			break;
		}
		
		System.out.println("커피 가격은 " + price + "원 입니다.");
		// 6. 램덤으로 알파벳 대문자 50개 생성하여 출력하는 프로그램을 만들어 보세요. 
		//   출력은 10줄 마다 줄바꿈해서 출력되게 해주세요. 
		//   예> 	DEFDEGSDFE
		//       	ADEFSGESGS
		//          ...
		int symbol_size = 'Z' - 'A' + 1;  //26
		for (int i = 0; i < 50; i++) {
			char ch6 = (char)(Math.random()*symbol_size + 'A');
			System.out.print(ch6);
			if (i % 10 == 9) System.out.println();
		}
	}

}
