/*
 *   JAVA GUI란?
 *    - 프로그램을 그래픽화(프레임창)시켜 작동 시키는 것. 
 *      AWT(만들기 쉽고, 무겁다), Swing(만들기 어렵고, 가볍다)패키지를 이용해서 프레임창 구현.
 *    - Frame 또는 JFrame  클래스를 이용해 프레임 창을 구현. 프레임 창 구현 후에 각종 이벤트
 *    처리 및 버튼, 패널, 입력창, 메뉴바, 속성 같은 구성 요소들을 각 클래스들을 이용해서 구현.
 *    
 *    - Frame(A)클래스가 각종 구성요소(B) 클래스들을 전부 호출. 구성요소(B)클래스 들은 각 프레임
 *    창별로 달라지기 때문에 개별 클래스화 한다면 여러 측면에서 낭비 -> 내부 클래스 사용.
 *    
 */
package d;


import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class D04_java_gui {
	
	// 프레임 멤버 intance 변수
	private Frame f;
	
	public D04_java_gui() {
		f = new Frame("Inner 클래스를 위한 AWT 확인!-내부클래스");
	}
	
	public void launchFrame() {
		f.addWindowListener(new MyWindowAdapter());
		f.setSize(640, 480);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		D04_java_gui dj = new D04_java_gui();
		dj.launchFrame();

	}
	
	// 멤버 Inner 클래스... 
	private class MyWindowAdapter extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("X를 클릭했어요...");
			System.exit(0);    // 프로그램 종료... 
		}
	}
	

}
