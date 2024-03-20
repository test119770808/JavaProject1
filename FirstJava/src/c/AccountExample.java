package c;

public class AccountExample {

	public static void main(String[] args) {
		// Account 클래스를 테스트하기 위한 메인 메서드
		
		Account acc1 = new Account("홍길동", "010-1111-2345-108", null, 100000);
		System.out.println("잔액 확인 : "+acc1.getBalance());
		// 입금 : 10000원
		acc1.saveMoney(10000);
		System.out.println("10000원 입금 후 잔액 확인 : "+acc1.getBalance());
		acc1.withdrawMoney(70000);
		System.out.println("70000원 출금 후 잔액 확인 : "+acc1.getBalance());

	}

}

class Account {
	
	/*
	  클래스 명 : Account
      속성(명사적 특성) : 이름, 계좌번호, 패스워드, 예금, 이자
      기능(동사적 특성) : 입금, 출금, 예금 확인
      생성자 : 이름, 계좌번호, 패스워드, 예금 를 이용한 오버로딩
	 */
	
	//필드, 속성, 멤버변수
	public String name;
	public String accountNumber;
	public String accountPw;
	public long balance;
	public float interest;
	
	// 생성자
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(String name, String accountNumber, String accountPw) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountPw = accountPw;
	}

	public Account(String name, String accountNumber, String accountPw, long balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountPw = accountPw;
		this.balance = balance;
	}
	
	// 메서드
	// 예금하다
	public void saveMoney(long amount) {
		balance = balance + amount;  // balance += amount;
	}
	// 출금하다
	public void withdrawMoney(long amount) {
		balance -= amount;
	}
	
	// 잔액 확인
	public long getBalance() {
		return balance;
	}
	
	
	
	
	
}
