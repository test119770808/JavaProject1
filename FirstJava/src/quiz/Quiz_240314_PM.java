package quiz;

class Airplane {
	// 멤버 변수
	String name;

	// 생성자
	public Airplane(String name) {
		this.name = name;
	}
	
	// 메서드
	void takeOff() {
		System.out.println("비행기가 이륙합니다.");
	}
	
	void fly() {
		System.out.println("일반 모드로 비행합니다.");
	}
	
	void land() {
		System.out.println("비행기가 착륙합니다.");
	}
	
}

class SuperSonicAp extends Airplane {
	
	/*
	 *  Airplane은 멤버 변수로 name을 가지고 있습니다. 
	 *  생성자로 이름을 입력받아 초기화 받게 설정하고, 
	 *  메서드는 takeOff(), fly(), land() 3가지를 가지고 있습니다.
	 * 
	 *  1. Airplane을 생성 상속 받습니다. 생성자는 이름을 받아서 초기화
	 *  2. flyMode는 int형 변수로 선언합니다.
	 *  3. fly() 메서드를 오버라이딩 합니다.
	 *     fly() 메서드 안에서는 flyMode가 1이면 "고속 모드로 비행합니다." 출력
	 *     	flyMode가 0이라면, super를 통해 부모님의 메서드를 호출
	 */
	
	int flyMode;

	public SuperSonicAp(String name) {
		super(name);
	}
	
	@Override
	void fly() {
		if(flyMode == 0) {
			super.fly();
		}else if(flyMode == 1) {
			System.out.println("고속 모드로 비행합니다.");
		}
		
	}
	
	
	

}

public class Quiz_240314_PM {
	
	public static void main(String[] args) {
		
		// 비행기 SuperSonicAp
		SuperSonicAp s1 = new SuperSonicAp("스텔스");
		s1.takeOff();
		s1.fly();
		s1.flyMode = 1;
		s1.fly();
		s1.flyMode = 0;
		s1.land();
				
	}
}



