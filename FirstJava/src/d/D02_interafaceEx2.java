/*
 *  인터페이스 정리
 *  - 단일 상속 문제를 해결할 수 있음.
 *  - 인터페이스 메서드는 추상메서드
 *  - 인터페이스 변수는 자동으로 상수
 *  - 인터페이스 구현은 implements 할 수 있음(구현)
 *  - 인터페이스 상속은 다른 인터페이스 여러개를 extends로 할 수 있음(상속)
 *  *** 기능의 명세를 위해서 사용(프로그램의 구조를 기술하기 때문) *** * 
 * 
 */
package d;


import interface_.ToDo;
import interface_.ToDo3;
import interface_.ToDo4;

public class D02_interafaceEx2 {

	public static void main(String[] args) {
		ToDo todo = new ToDo();  // 인터페이스 구현체 ToDo클래스
		ToDo3 itodo3 = todo;     // 다형성이 적용됨. 
		itodo3.m1();
		itodo3.m2();
		itodo3.m3();
//		itodo3.m4();
		ToDo4 itodo4 = todo;
		itodo4.m4();

	}

}
