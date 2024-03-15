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
	int width;
	int height;

	public Rectangle(int width, int height) {
		this(0, 0, width, height);
	}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {
		return width * height;
	}

}

class Triangle extends Shape {
	int width;
	int height;

	public Triangle(int width, int height) {
		this(0, 0, width, height);
	}

	public Triangle(int x, int y, int width, int height) {
		super(x, y);
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {
		return (width / height) / 2;
	}

}

public class C10_abstract {
	public static void main(String[] args) {
		Shape circle = new Circle(50, 50, 10);
		Shape rectangle = new Rectangle(10, 5);
		Shape triangle = new Rectangle(20, 5);

		System.out.println("원 넓이 : " + circle.getArea());
		System.out.println("사각형 넓이 : " + rectangle.getArea());
		System.out.println("삼각형 넓이 : " + triangle.getArea());

	}
}