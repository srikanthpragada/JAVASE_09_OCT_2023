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
	@Override 
	public void print() {
		super.print();
		System.out.println(this.side);
	}

	public int area() {
		return this.side * this.side;
	}

}

class Rect extends Shape {
	private int length, width;

	public Rect(int x, int y, int length, int width) {
		super(x, y); // pass params to superclass constructor
		this.length = length;
		this.width= width;
    }

	// Override
	@Override 
	public void print() {
		super.print();
		System.out.println(this.length);
		System.out.println(this.width);
	}

	public int area() {
		return this.length * this.width;
	}
}


public class TestShapes {

	public static void main(String[] args) {
		 Shape s;
		 
		 s = new Square(10,20,5);  // Upcasting 
		 s.print();
		 
		 s = new Rect(10,10,20,20); // upcasting
		 
		 
		 if (s instanceof Square) {
		     Square sq1 = (Square) s;  // Downcasting
		 }
		 
		 
		 if (s instanceof Square sq)
			 System.out.println(sq.area());
		     
}
