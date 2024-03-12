package quiz;

import java.util.Scanner;

public class ForStarDiamond {

	public static void main(String[] args) {
		// 다이아몬드 찍기(0312 오전에)
		// 1. 다음과 같은 형태로 별직기를 진행해 보세요.  
		/*          힌트  : 공백, 별, 단(줄)
		      *
		     ***
		    *****
		   *******
		  *********
		   *******
		    *****
		     ***
		      *
		 */

		Scanner scan = new Scanner(System.in);
		 
		// 줄 수 입력 받는 부분... 
		System.out.print("줄 수 를 입력해주세요 : ");
		int dan = scan.nextInt();
		 
//		for (int i = 0; i < dan; i++) {
//			for(int j = 0; j < dan - i - 1; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < i * 2 + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 0; i < dan - 1; i ++) {
//			for(int j = 0; j < i + 1; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j < 2 * (dan - i - 1) -1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		// 2. 1번의 코드를 활용하여 줄 수를 입력 받아서 그 줄 수 에 맞는 다이아몬드 별을 찍는 
 		//   프로그램을 작성해 보세요. (단, 줄은 홀수로만 입력 받아야 합니다.)

		// 변수 선언 : sp(여백), st(별), 반전을 위한 flag(boolean)- true(삼각형), false(역삼각형)
		int sp = dan/2;
		int st = 1;
		boolean flag = true;
		
		for (int i = 0 ; i < dan ; i ++ ) {
			
			// 여백처리... 
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");
			}
			// 별찍기... 
			for (int j = 0; j < st; j++) {
				if(j == 0 || j == st -1)
					System.out.print("*");
				else {
					if (j%2 == 0) System.out.print("$");
					else System.out.print(" ");
				}
			}
			System.out.println();
			if(i == (dan/2)) flag = false; //반적
			if(flag) {
				sp -= 1; st += 2;
			}else {
				sp += 1; st -= 2;
			}
				
		}
		
		scan.close();
		
		
		
		
		
		
		
	}

}