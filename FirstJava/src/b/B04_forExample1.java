package b;

public class B04_forExample1 {

	public static void main(String[] args) {
		// 반복문(Loop) : for, while, do~while
		
		// for문 : 횟차가 정해진 경우에 사용을 많이 함.
		/*
		 *  구문 : 
		 *   for (초기값; condition; 증가값) {
		 *   	조건이 참인 경우에 반복할 문장들이 있음... 
		 *   }
		 */

		// 기본
		// 초기값은 for문에 사용할 변수의 초기값을 의미. 
		for (int i = 0; i < 10; i++) {
			System.out.println("i의 값 : "+i);
		}
		System.out.println();
		// 초기값과 증가값의 위치는 변경이 가능합니다.(단, 보기 좋지는 않음)
		int i = 0; //초기값
		for (; i < 10 ;) {
			//반복구문 내에서 증감값이 존재해야 함..
			System.out.println("i의 값 : "+i);
			i++;  
		}
		
		
		//예제1) for문을 사용하여 1부터 10까지 숫자들의 합~!!
		int sum = 0;
		for (i = 1;i <= 10;i++) {
			System.out.println(i);
			sum +=i;   // sum = sum + i;
		}
		System.out.println("합은 : " + sum);
		
		//예제2) for문을 사용하여 1부터 100까지 홀수들의 합!!!
		int odd = 0;
		for (i = 1; i <= 100; i++) {
			if(i%2 == 1) {
				odd +=i;
			}
		}
		System.out.println("홀수의 합은 : " + odd);	

	}

}
