/*
 # 인터페이스 

 인터페이스 선언 
 
  interface InterfaceName [extends <SuperInterface>,<SupterInterface>....] {
  		interfaceBody
  }
 
 예) 인터페이스 정의
  public intrface Aquatic {
  		public abstract void swimming();
  		public abstract void breathUnderWater();
  }
 
  - 인터페이스는 골격만 정의해 놓은 것으로 주로 기능(메서드)의 명세를 정의
  - 인터페이스 내에 메서드는 모두 추상메서드이며 public abstract는 생략 가능합니다. 
  - 인터페이스 내에 변수는 항상 public static final이며 이 또한 생략이 가능합니다. 
  - 인터페이스는 구현하면 다중 상속과 같은 효과를 낼 수 있습니다.
    (상속을 여러개 받으면 어느 부모의 멤버를 상속받아야할지 결정할 수 없지만, 
     인터페이스는 클래스의 골격에 해당하기 때문에 여러개를 구현할 수 있습니다.)
  
 class className implements InterfaceName1, InterfaceName2,... {
 		classbody;
 }
 
예) 클래스에 인터페이스 구현
public class Mermaid extends Human implements Aquatic {
		public void swimming() {
			//인어가 수영하는 기능 구현... 
		}
		
		public void breathUnderWater() {
			//물속에서 숨쉬는 기능 구현...
		}
}

 - 인터페이스는 implements 라는 키워드를 통해서 구현
 - 여러개의 인터페이스를 동시에 구현할 수 있습니다. 
 - 반드시 인터페이스 내에 모든 메서드를 구현해야 합니다. 

 */
package d;


interface ShapeInterface {
	
	// 인터페이스 변수는 public static final을 생략할 수 있고, 이는 상수로
	// 인터페이스 메서드는 추상 메서드로 public abstract를 생략할 수 있음...
	public abstract double getArea();   //추상 메서드..
	// double getArea(); 				//위와 같음... 
}

class RectangleI implements ShapeInterface {
	
	int width;
	int height;
	
	public RectangleI(int width, int height) {
		this.width = width;
		this.height = height;			
	}
	
	@Override
	public double getArea() {
		// width * height
		return width * height;
	}
}

class TriangleI implements ShapeInterface {
	
	int width;
	int height;
		
	public TriangleI(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height / 2;
	}
}


public class D01_interfaceEx1 {

	public static void main(String[] args) {
		// test
		RectangleI rectangleI = new RectangleI(20, 34);
		TriangleI triangleI = new TriangleI(20, 34);
		
		ShapeInterface s1 = new RectangleI(30, 48);  //다형성
		
		System.out.println("rect's Area = " + rectangleI.getArea());
		System.out.println("tri's Area = " + triangleI.getArea());
		System.out.println("s1's Area = " + s1.getArea());
	}

}
