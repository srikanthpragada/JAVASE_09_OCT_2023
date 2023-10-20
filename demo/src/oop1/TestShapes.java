package oop1;

class Shape {
	protected int x, y;

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println(this.x);
		System.out.println(this.y);
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

}

class Square extends Shape {
	private int side;

	public Square(int x, int y, int side) {
		super(x, y); // pass params to superclass constructor
		this.side = side;
	}

	// Override
	public void print() {
		super.print();
		System.out.println(this.side);
	}

	public int area() {
		return this.side * this.side;
	}

}

public class TestShapes {

	public static void main(String[] args) {
		 Square s = new Square(10,20,5);
		 System.out.println(s.area());
		 s.print();
	}
}
