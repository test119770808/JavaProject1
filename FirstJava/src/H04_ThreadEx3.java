
public class H04_ThreadEx3 {
	
	/*
	 *   [스레드 동기화]
	 *     여러 스레드가 동작하는 프로그램에서 하나의 객체를 함께 사용하는 경우, 의도치 않은 
	 *   결과를 가져올 수 있습니다. 하나의 스레드가 작업이 끝날때까지 객체가 변경되지 않도록
	 *   하는 것을 동기화(synchronized)
	 *     동기화 지정 방법 - synchronized 키워드를 사용
	 *   1. 동기화 메서드 
	 *   2. 동기화 블럭   
	 * 
	 *   동기화에서 사용하는 스레드 작업 메서드.... 
	 *    - wait(), notify(), notifyAll()
	 */

	public static void main(String[] args) {
		// 게임 객체를 생성
		SmartPhoneGame game = new SmartPhoneGame();
		
		// 플레이어1 객체 생성 후 스레드 실행
		Player1 p1 = new Player1();
		p1.setSmartPhoneGame(game);
		p1.start();
		// 플레이어2 객체 생성 후 스레드 실행
		Player2 p2 = new Player2();
		p2.setSmartPhoneGame(game);
		p2.start();

	}

}

//스마트폰 게임 클래스
class SmartPhoneGame {
	private int level; //레벨
	
	public int getLevel() {
		return level;
	}
	
	// 1.메서드에 동기화 설정
//	public synchronized void increaseLevel() {
	public void increaseLevel() {
		synchronized (this) {   // 2. 동기화 블럭
			while(true) {
				this.level++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
				
				//현재 스레드의 이름과 레벨 출력
				System.out.println(Thread.currentThread().getName() +
						" Level : "+this.level);
				
				if (this.level == 5) {
					notifyAll();   // 현재 대기중인 모든 스레드를 실행 상태로 전환
					try {
						// notify() : 현재 대기중인 스레드를 한개만 실행 중으로 변환(직접 지정 불가)
						wait();    // 현재 실행 중인 스레드를 대기 상태로 전환
					} catch (InterruptedException e) {}
					break;
				}
				
				//레벨이 10의 배수가 되면 종료
				if(this.level % 10 == 0) break;
			}
		}
		
	}
}

//플레이어1 스레드
class Player1 extends Thread {
	private SmartPhoneGame game;
	
	public void setSmartPhoneGame(SmartPhoneGame game) {
		this.setName("Player1");
		this.game = game;
	}
	
	@Override
	public void run() {
		game.increaseLevel();
	}
}

//플레이어2 스레드
class Player2 extends Thread {
	private SmartPhoneGame game;
	
	public void setSmartPhoneGame(SmartPhoneGame game) {
		this.setName("Player2");
		this.game = game;
	}
	
	@Override
	public void run() {
		game.increaseLevel();
	}
}





