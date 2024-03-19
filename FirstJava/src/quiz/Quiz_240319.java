package quiz;

abstract class Shape {
	protected int x;
	protected int y;
	
	public void showPosition() {
		System.out.println("x좌표 : "+x+" y 좌표 :"+y);
	}
	
	public abstract double getArea();
}

class Rectangle extends Shape {
	private int w;
	private int z;
	
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
		w = 0;
		z = 0;
	}
	
	@Override
	public double getArea() {
		double result = (x - w) * (y - z);
		return result;
	}

}

class Triangle extends Shape {
	private int z;
	
	public Triangle(int x, int y) {
		this.x = x;
		this.y = y;
		z = 0;
	}
	@Override
	public double getArea() {
		double result = (x - z)*(y - z)/2;
		return result;
	}
}

public class Quiz_240319 {

	public static void main(String[] args) {
		// 도형은 좌표를 이용해 각 도형의 요소들을 나타낼 수 있는 넓이를 구하는 방식은 도형별로 
		// 다르다.
		//  즉, 추상 클래스는 여러 속성과 기능을 넘겨주면서 기능을 확장해서 사용해야 하는 경우
		// 유용함. 인터페이스는 여러 속성을 넘겨줄 수 없기 때문입니다. 
		Triangle tri = new Triangle(10, 5);
		Rectangle rect = new Rectangle(10, 10);
		System.out.println(tri.getArea());
		System.out.println(rect.getArea());
		tri.showPosition();
		rect.showPosition();

	}

}
