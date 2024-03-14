package obj.inheritance.goodcase;

import obj.inheritance.Person;

public class Student extends Person {
	
	public String studentId;
	public String major;
	
	
	/*
	 *  this와 super
	 *   - this 
	 *    > this는 현재 객체(자기 자신)
	 *    > this. 
	 *       - 변수 또는 메서드를 참조
	 *       - this.name => 자기 자신의 name 멤버변수를 참조
	 *       - this.go()  => 자기 자신의 go() 메서드를 참조하겠다... 
	 *    > this()
	 *       - 자기 자신 클래스 내의 다른 생성자를 참조
	 *       - this();   => 기본 생성자를 참조
	 *       - this("hello");   => 자신이 가지고 있는 생성자를 호출. 인자 값을 처리하는 생성자
	 *   
	 *   - super
	 *    > super는 현재 객체의 부모 객체, 한단계 위 부모를 의미함. 
	 *    > super.
	 *       - 부모의 변수 또는 메서드를 참조
	 *       - super.name => 부모의 name 멤버변수를 참조
	 *       - super.go() => 부모의 go() 메서드를 참조
	 *    > super()
	 *       - 부모 생성자를 참조
	 *       - super()  => 부모의 기본 생성자를 참조
	 *       - super(10, 20) => 부모의 해당 인자값을 처리하는 생성자를 참조
	 *       - super("hello")
	 */
	
	public Student() {
		
	}

	public Student(String name, int age) {
		super(name, age);
	}

	public Student(String name, int age, String studentId, String major) {
		this(name,age);
		this.studentId = studentId;
		this.major = major;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "[이름: "+name+"\t나이: "+age+"\t학번: "+studentId+"\t전공: "
				+major+"]";
	}

}
