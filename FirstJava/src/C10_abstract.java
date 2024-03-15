abstract class Shape {
	private int x;
	private int y;
	
	public Shape() {
		
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract double getArea();
	
	public String postion() {
		return "[x=" + x + "y=" + y + "]";
	}
}

class Circle extends Shape {
	
	
	private int radius;
	
	public Circle(int r) {
		this(0, 0, r);
	}
	public Circle(int x, int y, int r) {
		super(x, y);
		this.radius = r;
	}

	@Override
	public double getArea() {
		return (Math.PI * radius * radius);
	}
	
}

class Rectangle extends Shape {
	private int radius;

	public Rectangle() {
	}
	
	public Rectangle(int x, int y) {
		super(x, y);
	}

	@Override
	public double getArea() {
		return 0;
	}
	
}

class Triangle extends Shape {

	
	public Triangle() {
		
	}
	public Triangle(int x, int y) {
		super(x, y);
	}
	
	@Override
	public double getArea() {
		return 0;
	}
	
}

public class C10_abstract {
	public static void main(String[] args) {
		Shape circle = new Circle(10);
		
		
		System.out.println("원 넓이 : " + circle.getArea());
		System.out.println("도형 위치 : " + circle.postion());
	}
}