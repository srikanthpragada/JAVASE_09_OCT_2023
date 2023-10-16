package oop1;

public class Course {
	// Instance variables 
	private String name;
	private int fee;
	
	// Methods 
	public void init(String n, int f) {
		name = n;
		fee = f; 
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(fee);
	}
	
	public int netFee() {
		return  fee +  fee * 12 / 100; 
	}

}
