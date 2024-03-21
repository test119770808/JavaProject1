package d;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class D04_anonymousEx1 {
	
	private Frame f;
	
	public D04_anonymousEx1() {
		f = new Frame("Anonymous innerClass");
	}
	
	public void launchFrame() {
		// 익명 클래스 사용 - 익명 클래스는 이름이 없기 때문에 생성자 가지지 않고, 호출 및 상속X
		// 때문에 이미 만들어진 인터페이스나 클래스를 상속 또는 구현해서 만들어지게 된다.
		// 여러번 사용할 클래스가 아닌 한번만 사용할 클래스에 주로 사용됩니다. 
		// 클래스 내에 메서드를 재정의 하기 용이하여 '함수형 프로그램'과 비슷하게 활용할 수 있음.
		// 인터페이스와 익명 클래스를 같이 사용하면 여러 상황에서 쓰일 수 있는 유틸리티 클래스를
		// 만들어 사용할 수 있습니다. 
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료 버튼을 눌렀어요!!!");
				System.exit(0);
			}
		});
		f.setSize(640, 480);
		f.setVisible(true);
	}
	

	public static void main(String[] args) {
		D04_anonymousEx1 da = new D04_anonymousEx1();
		da.launchFrame();

	}

}
