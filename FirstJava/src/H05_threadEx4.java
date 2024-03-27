
public class H05_threadEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// 통장 클래스
class Account {
	int money;
	synchronized void withdraw() {
		while (money == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				break;
			}
		}
		notifyAll();
		System.out.println(Thread.currentThread().getName() + money +"원 출금");
		money = 0;
	}
	
	synchronized void deposit() {
		while(money > 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				break;
			}
		}
		// 랜덤 입금 1 ~ 5 만원
		money = (int)((Math.random()*5)+1)*10000;
		notifyAll();
		System.out.println();
		System.out.println(Thread.currentThread().getName() +money+"원 입금");
	}
}

// 엄마 스레드
class Mother extends Thread {
	Account account;
	
	public Mother(Account account) {
	    super("엄마");
	    this.account = account;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				account.deposit();
				sleep((int)(Math.random()*2000));
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}

// 아들 스레드
class Son extends Thread {
	Account account;
	
	Son(Account account) {
		super("아들");
		this.account = account;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				account.withdraw();
				sleep((int)(Math.random()*300));
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}



