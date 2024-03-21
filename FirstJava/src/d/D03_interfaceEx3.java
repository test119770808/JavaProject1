package d;
import interface_.ISomething;

public class D03_interfaceEx3 implements ISomething {
	
	@Override
	public void run() {   //인터페이스는 반드시 재정의가 필요함... 
//		My_INT = 33;
		System.out.println("run() : "+ISomething.A);
	}

	public static void main(String[] args) {
		//상수라면 두 값은 같을 겁니다.
		System.out.println(ISomething.My_INT);
		System.out.println(D03_interfaceEx3.My_INT);

		// 메서드의 동작이 같을 겁니다. 다형성
		ISomething is = new D03_interfaceEx3();
		is.run();
		D03_interfaceEx3 di = new D03_interfaceEx3();
		di.run();
	}

}
