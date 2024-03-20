package c;
import obj.Student;

public class C01_Class {

	// 객체지향 프로그래밍 (OOP : Object Oriented Programming)
	
	// 객체 (Object) : 세상에 존재하는 모든 것들 (사물, 추상적인 것들 등등)
	//  - 세상에 존재하는 모든 것은 변수와 메서드로 표현할 수 있습니다. 
	//  - 메서드는 객체의 행동 및 기능을 나타내고, 변수는 상태(설정값)를 나타내게 됩니다. 
	
	// 클래스(Class)
	//  - 객체를 프로그래밍 언어로 표현한 것
	//  - 객체의 설계도
	//  - 클래스를 통해 만드는 하나의 실제 객체를 인스턴스라고 부릅니다. 
	//  - 클래스의 메서드는 객체의 행동, 클래스의 변수는 객체의 현재 상태를 나타낸다. 
	//  - 클래스는 참조형 변수 타입니다. 
	
	// JAVA 클래스의 규칙들... 
	//  - public class는 파일 이름과 같아야 합니다.
	//  - public class는 한 파일에 한개만 존재할 수 있습니다. 
	//  - 같은 패키지 내에서는 같은 이름의 클래스는 사용할 수 없다. 
	//  - 다른 패키지에서 import할 때는 public class만 접근할 수 있다. 
	//  - public class는 파일의 이름이기 때문에 그 소스 파일 전체의 주제를 알 수 있는 이름으로 짓는 것이 좋다.
	//  - 클래스의 이름 대문자로 시작하는 것이 좋다. 
	
	public static void main(String[] args) {
		
		// 학생의 클래스 Student로 학생의 실제 객체를 하나 생성... 
		Student s1 = new Student();
		Student s2 = new Student();
		
		// 클래스 타입의 배열을 사용할 수 있어요. 
		Student[] kids = new Student[100];  // Student Object 100개를 가진 배열 선언
		
		for (int i = 0; i < kids.length; i++) {
			kids[i] = new Student();        // 배열 초기화... 
			kids[i].name = "default name "+(i+1);  
			System.out.println((i + 1) + "번째 학생의 이름 : "+kids[i].name);
		}
		
		// Student[] 타입이기 때문에 값을 꺼내면... Student 객체가 나오게 됩니다. 
		Student s50 = kids[50];
		System.out.println(s50.getName());
		
		int i = 1;
		for (Student s: kids) {
			System.out.println(i + "번째 학생의 이름 : "+s.name);
			i ++;
		}
				
		s1.kor = 100;
		s1.eng = 99;
		s1.name = "홍길동";
		
//		System.out.println(s1);
//		System.out.println(s1.kor);
//		System.out.println(s2.kor);
//		System.out.println(s1.eng);
//		System.out.println(s1.name);
//		System.out.println(s1.getTotal());
//		System.out.println(s1.getName());

	}

}
