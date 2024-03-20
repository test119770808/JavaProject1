package c;
import obj.Pen;

public class C01_Class2 {

	public static void main(String[] args) {
		// 인스턴스 객체 생성
		
		// 객체 생성 명령어 ... 
		// ClassName instanceName = new Constructor();   // 생성자는 클래스 이름과 같음.
		// 생성자의 역할은 멤버변수(속성) 초기화 혹은 클래스 구동을 위한 사전동작을 구현... 
		Pen redPen = new Pen();
		redPen.color = "red";
		System.out.println(redPen);
		System.out.println(redPen.color);
		// 쓰기
		redPen.write();

		// 클래스를 사용하는 이유? 
		//  - 대량으로 코드를 반복적으로 사용하는 경우에 사전에 틀을 만들어 사용하기 위해서 클래스 사용함. 
		//  - 코드를 최소하여 작업 할 수 있음... 
		
		// 기본 생성자를 통한 instance 객체 생성
		Pen pen1 = new Pen();
		System.out.println(pen1);
		System.out.println(pen1.color);
		
		// 멤버 초기화 생성자를 통한 instance 객체 생성
		Pen pen2 = new Pen("blue");
		System.out.println(pen2);
		System.out.println("펜의 색상은 '"+pen2.color+"'입니다.");
		
		Pen pen3 = new Pen("yellow");
		System.out.println(pen3);
		System.out.println("펜의 색상은 '"+pen3.color+"'입니다.");
		
		// 맴버 초기화 생성자를 통한 인스턴스 객체 - 색상, 가격
		Pen pen4 = new Pen("hot pink", 1000);
		System.out.println(pen4);
		System.out.println("펜의 색상은 '"+pen4.color+"'입니다.");
		System.out.println("펜의 가격은 '"+pen4.getPrice()+"'원 입니다.");
		
	}

}
