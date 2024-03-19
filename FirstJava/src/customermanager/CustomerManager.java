package customermanager;

import java.util.Scanner;

import customermanager.oop.Customer;

	//이전에 만들어 놓은 고객관리 프로그램을 OOP형식으로 변경하여 재 프로그래밍을 진행!
	// 1. Customer 클래스를 생성하고,
	// 2. 관련 프로그램을 위에 생성한 Customer 클래스 기준으로 재작성하세요!


public class CustomerManager {
	
	// 배열에 저장할 수 있는 최대 고객 수 
	static final int MAX = 100;
	
	// Customer 객체의 배열을 선언
	static Customer[] cusList = new Customer[MAX];
	
	// 배열을 참조하기 위해서 인덱스를 사용... 
//	static int index = -1;
	
	static int count;    // 고객 정보 저장 개수
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		while(true) {
			// 고객 메뉴 ui(TEXT UI)
			System.out.printf("\n[INFO] 고객 수 : %d\n", count);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (S)elect, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력 : ");
			String menu = scan.next();
			menu = menu.toLowerCase();  // 대소문자 구분X 
			// 메뉴 선택시 동작을 구현... 
			switch(menu.charAt(0)) {
			case 'ㅑ':
			case 'i':  // insert
				System.out.println("고객 정보 입력을 시작합니다.");
				if (count >= MAX) {
					System.out.println("더 이상 저장할 수 없습니다. ");
				}else {
					//저장을 위한 메서드... 
					insertCustomerData();
					System.out.println("고객 정보를 저장했습니다.");
				}
				break;
			case 's':
			case 'ㄴ':
				System.out.println("데이터를 출력합니다.");
				if(count > 0) {
					printCustomerData(selectCustomerData());
				}else {
					System.out.println("출력할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'ㅕ':
			case 'u':
				System.out.println("데이터를 수정합니다.");
				if(count > 0) {
					updateCustomerData(selectCustomerData());
				}else {
					System.out.println("수정할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'ㅇ':
			case 'd':
				System.out.println("데이터를 삭제합니다.");
				if (count > 0) {
					deleteCustomerData(selectCustomerData());
				}else {
					System.out.println("삭제할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'ㅂ':
			case 'q':  //종료
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0); //프로세스 종료
				break;
			default :
				System.out.println("메뉴를 잘 못 입력했습니다. 다시 선택해 주세요");
			}
		}

	}

	public static void insertCustomerData() {
		// 이름, 성별, 이메일, 출생년도 입력
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("성별 : ");
		String gender = scan.next();
		System.out.print("이메일 : ");
		String email = scan.next();
		System.out.print("출생년도 : ");
		int birthYear = scan.nextInt();
		
		// 고객 객체를 배열에 저장
		Customer c1 = new Customer(name, gender, email, birthYear);
		/*  // or
		 * Customer c1 = new Customer();
		 * c1.setName(name);
		 * c1.setGender(gender);
		 * c1.setEmail(email);
		 * c1.setBirthYear(birthYear);
		 */
		cusList[count] = c1;
		count ++;   //count번째 배열에 객체 저장 후에 count값 증가... 	
		
	}
	
	public static Customer selectCustomerData() {
		while (true) {
			System.out.println("출력, 수정 또는 삭제할 사람의 이름을 입력하세요.");
			String name = scan.next();
			for (int i = 0; i < count; i++) {
				if(cusList[i].getName().equals(name)) {
					return cusList[i];
				}
			}
			System.out.println("입력하신 이름을 가진 데이터가 없습니다.");
		}
	}
	
	public static void printCustomerData(Customer cus) {
		System.out.println("==========CUSTOMER INFO==========");
		System.out.println("이름 : "+cus.getName());
		System.out.println("성별 : "+cus.getGender());
		System.out.println("이메일 : "+cus.getEmail());
		System.out.println("출생년도 : "+ cus.getBirthYear());
		System.out.println("=================================");
	}
	
	public static void updateCustomerData(Customer cus) {
		System.out.println("-------UPDATE CUSTOMER INFO-------");
		System.out.print("이름("+cus.getName()+") :");
		String name = scan.next();
		if(name.length() != 0) {  // 검증... 
			cus.setName(name);
		}
		System.out.print("성별("+cus.getGender()+") : ");
		cus.setGender(scan.next());
		System.out.print("이메일("+cus.getEmail()+") : ");
		cus.setEmail(scan.next());
		System.out.print("출생년도("+cus.getBirthYear()+") : ");
		cus.setBirthYear(scan.nextInt());
	}
	
	public static void deleteCustomerData(Customer cus) {
		for (int i = 0; i < count - 1; i++) {
			if(cusList[i].getName().equals(cus.getName())) {
				for (int j = i; j < count; j++) {
					cusList[j] = cusList[j+1];
				}
			}
		}
		System.out.println("데이터가 삭제되었습니다.");
		count --;
	}
	

}
