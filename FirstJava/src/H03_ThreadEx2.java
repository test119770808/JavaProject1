
public class H03_ThreadEx2 {
	
	/*
	 *  [스레드 상태 제어]** 
	 *    스레드 작업시 프로그램 중지 및 버그가 발생할 수 있는 부분.... 
	 *  - sleep() : 스레드를 원하는 시간만큼 멈추고 싶을 때 사용.
	 *            InterruptedException처리를 강제하기 때문에 try구문 사용
	 *  - interrupt() : 스레드가 일시 정지 상태에 있을 때에 InterruptedException예외발생
	 *             run()메서드가 정상종료 시킬 수 있게 한다.
	 *  - join() : 다른 스레드 실행이 완료될때까지 기다리는 메서드 
	 *  - yield() : 다른 스레드에게 실행 양보하는 메서드        
	 *    
	 */
	

	public static void main(String[] args) {
		
		//sleep()
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i = 1;
				while(true) {
					//interrupt 확인
					System.out.println("t1 : "+i);
					i++;
					if (Thread.interrupted()) {   //interrupt 발생 여부 확인
						System.out.println("인터럽트가 발생했었네요. 반복문 종료합니다.");
						break;
					}
					
					// sleep 확인
//					try {
//						Thread.sleep(1000);  //1초
//					} catch (InterruptedException e) {
//						System.out.println(e.getMessage());
////						System.exit(0);
//					}
				}
				System.out.println("스레드 실행 종료");
				
			}
		});
		
		t1.start();
		
		// interrupt() 메서드
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		t1.interrupt();  // 스레드가 일시 정지 상태이면 예외 발생. sleep interrupted
		
		// join() 메서드
		Sum t2 = new Sum();
		Sum t3 = new Sum();
		
		t2.start();
		t3.start();
		try {
			t2.join();   // t1 스레드가 종료될때까지 대기
			t3.join();   // t2 스레드가 종료될때까지 대기
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("두 스레드의 Sum의 합계 : "+(t2.sum + t3.sum));
		
		
		//yeild() 
		
	}

}

class Sum extends Thread {
	int sum = 0;
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
	}
}
