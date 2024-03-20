package c;

import obj.inheritance.Person;
import obj.inheritance.goodcase.Employee;
import obj.inheritance.goodcase.Student;
import obj.inheritance.goodcase.Teacher;

/*   다형성
 *    - 여러가지 형태를 가지는 성질을 의미함.
 *    - 다형성은 상속을 전제조건으로 함.
 *    - 동일한 메시지라도 어떤 객체에 전달되느냐에 따라서 다양한 동작을 발생하게 된다. 
 *     이것은 프로그램에서 유연성을 부여하는 역할을 합니다. 
 *    - 다형성은 존재하지 않았던 클래스를 기존 시스템에 수정없이, 시스템에 추가되도록 합니다.
 *     (다형성 인자 예제)
 *    - 다형성을 적용하는 방법은 부모클래스의 객체를 선언하고, 자식클래스의 객체를 할당하는 것.
 *     반대의 경우에는 불가능!
 *    - 다형적 객체의 경우 부모 클래스에 있는 메서드만 사용이 가능함. 
 *     자식클래스에 재정의 되어 있다면 실행은 자식클래스에 있는 메서드로 실행됩니다. 
 *     자식클래의 메서드가 실행된다고해서 부모 클래스에 있는 해당 메서드를 지우면 안됩니다. 
 *     이유는 컴파일 시에는 부모의 메서드를, 실행시에는 자식의 메서드를 사용하기 때문!
 *    - 선언시 자료형은 반드시 구현된 클래스일 필요는 없다. 추상클래스나 인터페이스도 가능하고, 
 *     이런 특성을 이용하여 개발자는 인터페이스를 통해서 명세를 제공할 수 있습니다.
 * 
 */


public class C08_polymorphism {

	public static void main(String[] args) {
		// 다형성 테스트 
		Person p = new Student("홍길동", 17, "20240315", "도술");
		// 오버라이드 된 메서드의 실행... 
		System.out.println(p.getDetails());  // 오버라이드 된 내용은 자식의 내용을 출력!
		Person pO = new Person("이순신", 40);
		System.out.println(pO.getDetails());
		p.walk(); //상속받은 메서드 실행... 
//		p.study();  // p는 다형적 객체이기 때문에 부모 클래스에 있는 메서드만 사용할 수 있어요.
		Student casting = (Student)p;
		// study() 사용해야 하는 경우에는 Student로 캐스팅이 되어야 사용이 가능해요.
		casting.study();
		
		////// 
		Person p2;
		p2 = new Teacher("홍선생", 22, "Java Programming!!!");
		// instanceof 연산자는 좌항의 객체와 우항의 클래스를 비교!
		System.out.println(p2 instanceof Person);
		System.out.println(p2 instanceof Teacher);
		System.out.println(p2 instanceof Student);
		System.out.println(p2.getDetails());
		
		p2 = new Employee("홍사원", 25, "교무처");
		// instanceof 연산자는 좌항의 객체와 우항의 클래스를 비교!
		System.out.println(p2 instanceof Person);
		System.out.println(p2 instanceof Employee);
		System.out.println(p2.getDetails());
		
		p2 = new Student("홍길동", 17, "20240315", "도술");
		System.out.println(p2 instanceof Person);
		System.out.println(p2 instanceof Student);
		System.out.println(p2.getDetails());

	}

}
