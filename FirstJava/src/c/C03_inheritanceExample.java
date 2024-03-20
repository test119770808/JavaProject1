package c;
import obj.inheritance.Person;
import obj.inheritance.goodcase.Student;

public class C03_inheritanceExample {

	public static void main(String[] args) {
		
//		Person p = new Person();
//		p.name = "홍길동";
//		p.age = 25;
//		p.height = 179.8f;   //protected  -> 같은 패키지 내와 자식 클래스는 접근 가능
//		p.weight = 100.0f;   //default  -> 같은 패키지내에서 접근 가능
		Person p = new Person("홍길동", 25, 179.8f, 105.6f);
		System.out.println(p.getDetails());

//		Student s1 = new Student();
//		s1.name = "이순신";
//		s1.age = 30;
//		s1.studentId = "20240314";
//		s1.major = "해양학과";
		Student s1 = new Student("이순신", 30, "20240314", "해양학과");
		System.out.println(s1.getDetails());
	
	}

}
