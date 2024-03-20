package b;

public class B02_ifExample4 {

	public static void main(String[] args) {
		// 중접(중복) if : if문 안에 if문이 존재하는 경우
		
		int jumsu = (int)(Math.random()*110);  //0 ~ 109
		
		System.out.println("점수 : "+jumsu);
		
		if(jumsu >= 90) {
			if(jumsu > 100) {
				System.out.println("잘못 입력된 점수 입니다.");
			}else {
				System.out.println("당신의 학점은 A입니다.");
			}
		}else if(jumsu >= 80) {
			System.out.println("당신의 학점은 B입니다.");
		}else if(jumsu >= 70) {
			System.out.println("당신의 학점은 C입니다.");
		}else if(jumsu >= 60) {
			System.out.println("당신의 학점은 D입니다.");
		}else {
			System.out.println("당신의 학점은 F입니다.");
			System.out.println("당신은 재수강 대상자입니다.");
		}

	}

}
