package mariadb;

import java.util.Scanner;

public class PersonsDBMain {
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("[PersonsDB 처리 프로그램");
			System.out.println("1. 전체 조회");
			System.out.println("2. 선택 조회");
			System.out.println("3. 레코드 추가");
			System.out.println("4. 레코드 수정");
			System.out.println("5. 레코드 삭제");
			System.out.println("0. 종 료");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			switch(sel) {
			case 1:
				selectAll();
				break;
			case 2:
				selectOne();
				break;
			case 3:
				insert();
				break;
			case 4:
				update();
				break;
			case 5:
				delete();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default :
				System.out.println("잘못된 값을 입력했습니다.");
			}
		}
		
	}
	
	static void selectAll() {
		
	}
	
	static void selectOne() {
		
	}
	
	static void insert() {
		
	}
	
	static void update() {
		
	}
	static void delete() {
		
	}

}
