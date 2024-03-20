package b;

public class B00_format {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.printf("a의 값은 : %d",a);  //제어문자로 %d는 정수
		/*
		 *   정수 : %d
		 *   실수 : %f
		 *   한문자 : %c
		 *   문자열 : %s
		 *   각 제어문자와 대응한 값을 지정해야함.... 
		 */
		
		float b = 10.234f;
		char c = 'A';
		String str = "오늘 날씨는 미세먼지 많음!";
		
		System.out.printf("\na의 값은 정수 %d, b의 값은 실수 %f \nc의 값은 문자 %c, str의 값은 문자열 %s"
				,a,b,c,str);
		
		System.out.println();
		a = 1000;
		System.out.printf("[%10d]",a);   //제어문자 앞에 숫자는 출력 값의 자리수
		System.out.println();
		System.out.printf("[%-10d]",a);   //제어문자 앞에 숫자는 출력 값의 자리수
		System.out.println();
		b = 33.145f;
		System.out.printf("[%10.2f]",b);  //실수제어 문자의 자리수 지정은 ".숫자"를 사용
		System.out.println();
		System.out.printf("[%7.3f]",1000.123457);
		System.out.println();
		System.out.printf("[%010d]",a);   
		

	}

}
