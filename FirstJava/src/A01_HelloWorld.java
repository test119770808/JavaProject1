/*
 *  여러줄 주석 
 *    주석은 프로그램 코드를 실행하지 않아요!
 *    주석은 코드를 설명하거나 기술할 때 사용해요.
 *   
 *  * 새 프로젝트 생성 
 *    file -> new -> java project -> 프로젝트 이름 입력
 *  
 *  * 클래스 파일 생성
 *    src(소스 폴더) -> 우클릭 -> new -> class -> 클래스 이름 지정
 */

// 한줄 주석

/*
 *   JAVA 특징
 *    - OOP(Object Oriented Programming) - 객체 지향 프로그래밍
 *      => 수많은 객체들이 서로 상호작용으로 프로그래밍을 함!
 *    - 플랫폼 독립적(아키텍쳐 중립적) -> 자바를 사용하는 가장 큰 이유
 *    - 멀티스레드(Multi-thread) 지원 -> 여러개의 쓰레드를 사용하여 동시에 작업을 수행
 *    - 인터프리터 언어 - 인터프리터와 컴파일을 동시에 실행
 *    - 많은 수의 개발자가 JAVA를 사용하고 있음. 
 */

/*
	Eclipse의 단축키
		Ctrl + F11 : 빌드 (컴파일 + 실행)
		컴파일 - 프로그래밍 언어를 컴퓨터가 알아들을 수 있게 변환하는 과정
		JAVA는 바이트코드라는 것으로 변환한다
		Tab : 들여쓰기, 줄 간격 맞추기 용도로 사용됨
		Tab키를 적절하게 활용하여 코드를 보기좋게 만들어야 한다
		Shift + Tab : 역탭
		Ctrl + Z : 되돌리기
		Ctrl + Y : 되돌리기 취소
		Ctrl + M : 화면 넓게 쓰기
		Ctrl + C : 복사하기
		Ctrl + X : 잘라내기 (잘라내면서 복사)
		Ctrl + V : 붙여넣기
		Ctrl + D : 한줄 삭제
		Ctrl + / : 블록 영역 주석 처리 (풀고 싶을 때는 한번 더)
		Ctrl + Shift + / : 블록 영역 여러 줄 주석 처리
		Ctrl + Shift + \ : 블록 영역 여러 줄 주석 해제

	블록지정 관련 단축키
		HOME키 : 줄의 맨 앞으로 커서를 이동한다
		END키 : 줄의 맨 뒤로 커서를 이동한다
		Shift키를 누른상태로 커서 이동 : 블록 지정
		Ctrl + A : 전체를 블록 지정
*/


// JAVA에서 public class의 이름은 항상 파일명과 같아야 합니다.
// 빨간줄로 오류가 표시되면 F2버튼 : 에러에 대한 정보 및 해결책 제공.
public class A01_HelloWorld {
	
	// main() 메서드 : 프로그램의 시작 위치... 
	public static void main(String[] args) { // {}(중괄호) 블럭은 여러 명령어가 묶여 있는 부분
		
		// ;(세미콜론) : 한 명령어의 끝을 알림.
		// System.out.println() 메서드 : 콘솔에 ()안에 있는 입력 내용을 출력하는 기능의 메서드
		System.out.println("Hello, World!!");
		
		System.out.println("안녕하세요!~!!");
		System.out.println("1234");
		System.out.println("10.1101");
		// "" : 사이에 있는 내용은 문자열
		
		System.out.println(1234);  // 숫자 : 정수형
		System.out.println();      // 아무것도 입력하지 않으면 줄바꿈만 동작함.
		
		System.out.println('A');   // '' : 사이에 있는 내용은 문자형(문자형은 단하나의 글자만 존재)
		System.out.println('7');
		
		System.out.println(10.10011);  // 소수는 실수형
		

	}

}
