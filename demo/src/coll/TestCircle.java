package coll;

import java.util.HashSet;

class Circle {
	private int radius;
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "radius=" + radius;
	}
	@Override 
	public int hashCode() {
		return this.radius;
	}
	
	@Override
	public boolean equals(Object o) {
		Circle other = (Circle) o;
		return this.radius == other.radius;
	}
}

public class TestCircle {
	public static void main(String[] args) {
		var circles = new HashSet<Circle>();

		circles.add(new Circle(10));
		circles.add(new Circle(15));
		circles.add(new Circle(10));
		circles.add(new Circle(20));

		for (var c : circles) {
			System.out.println(c);
			System.out.println(c.hashCode());
		}
	}
}
