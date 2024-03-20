package b;
import java.util.Random;

public class B02_ifExample2 {

	public static void main(String[] args) {
		// 난수 생성 : 임의 값(Random)
		// 1. Math.random() : 0 ~ 1미만의 임의 값을 출력(double 타입)
		// 2. Random을 임포트 : import를 사용하여 라이브러리에 있는 Random 클래스를 로드
		//   Random는 각 타입별로 난수를 발생시키는 메서드가 존재함.
		//   난수를 생성하기 위해서 Seed를 지정할 수 있음. Seed값이 동일하면 동일한 값이 발생
		//   Random 클래스 메서드
		//    - nextFloat()		: 0.0이상 1.0미만의 float형 난수 발생
		//    - nextBoolean()	: true or false 중 임의 값을 발생
		//    - nextInt()		: int형 타입 이내의 모든 값에서 난수 발생
		//    - nextInt(int)	: 0부터 생성자에 들어간 숫자 -1까지 int형 난수 발생
		
//		Random rand = new Random();
//		float a = rand.nextFloat();
//		boolean b = rand.nextBoolean();
//		int c = rand.nextInt();
//		int d = rand.nextInt(10);
//		System.out.printf("%f, %b, %d, %d", a,b,c,d);   //%b는 boolean타입
		
		// if ~ else문 : if조건문이 true이면 if에 종속 실행문을 그렇지 않으면 else의 실행문을 동작!
		
		// 정수 난수 발생 ( 0 ~ 99 )
		int jumsu = (int)(Math.random()*100);
		System.out.println("점수 : "+ jumsu);
		
		if (jumsu >= 60) {
			System.out.println("60이상인 점수입니다.");
			System.out.println("합격하셨습니다.");
		}else {
			System.out.println("60미만입니다.");
			System.out.println("불합격 하셨습니다.");
		}
		
		
		

	}

}
