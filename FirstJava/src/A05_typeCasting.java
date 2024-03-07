
public class A05_typeCasting {
	
	public static void main(String[] args) {
		// 타입 캐스팅 : 어떤 변수 혹은 값을 강제로 다른 타입으로 변환시키는 것
		long a = 550_0000_0000L;
		float f = 1.234f;
		
		// byte < char <= short < int < long < float < double
		// 일반적으로 큰 타입을 작은 타입에 넣으면 에러가 발생한다. 
//		int i = f;
//		int i = a;
		
		// 타입 캐스팅을 통해서 값을 억지로 넣어 줄 수 있음. 
		// 다만, 타입 캐스팅을 하면 값이 손실이 일어날 수 있음을 인지하고 사용!
		int i = (int)f;
		System.out.println("float -> int : "+i);
		i = (int)a;
		System.out.println("long -> int : "+i);
		
		// ASCII 코드
		//  문자는 각 문자에 해당하는 정수 값을 가지고 있습니다. 
		//  그 정수 값 중에 0 ~ 127까지의 값들을 ASCII코드라고 부릅니다. 
		
		// char타입 변수에 65를 넣는 것과 'A'를 넣는 것은 같다.
		char ch = 65;     
		System.out.println(ch);
		ch = 'A';
		System.out.println(ch);
		
		// int타입 값을 char타입으로 캐스팅을 한다면, 해당하는 ASCII코드 문자로 변환됩니다. 
		int c = 97;
		System.out.println(c);
		System.out.println(97);
		
		System.out.println((char)c);
		System.out.println('a');
		
		// 문자끼리도 연산이 가능합니다.
		System.out.println("=======================");
		System.out.println('A');
		System.out.println('D' - 'A');
		System.out.println('A' < 'C');
		System.out.println('9' - '0');
		System.out.println('0' - '0');
		
		// 문자와 정수 사이에도 연산이 가능합니다. 
		System.out.println('A' + 3);
		System.out.println((char)('A' + 3));
		System.out.println('A' > 10);
		
		// 더 큰 타입과 연산을 하게 되면, 자동적으로 큰 타입으로 변환이 일어남.
		double d1 = 1.234;
		int i1 = 10;
		System.out.println('A'+i1);
		System.out.println(d1 + i1);
		
		
	}

}
