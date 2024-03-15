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
	
	public String toString() {
		return "[x=" + x + "y=" + y + "]";
	}
}

class Circle extends Shape {

	@Override
	public double getArea() {
		return 0;
	}
	
}



public class C09_abstract {

}