package quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		String banner = "* * * * * 출력 결과 * * * * *";
		String name = "홍길동";
		int age = 20;
		String tel = "010-1234-1234";
		double height = 178.5;
		double weight = 75;
		String bloodType = "O";
		
	    System.out.println(banner);
	    System.out.printf("이름\t: %s\n",name);
	    System.out.printf("나이\t: %d\n",age);
	    System.out.printf("Tel\t: %s\n",tel);
	    System.out.printf("키\t: %f\n",height);
	    System.out.printf("몸무게\t: %f\n",weight);
	    System.out.printf("혈액형\t: %s\n",bloodType);
		

	}

}
