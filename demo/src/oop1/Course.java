package oop1;

public class Course {
	// Instance variables
	private String name;
	private int fee;
	// Class variable
	private static int taxRate = 12;
	private static int count = 0;

	public static void setTaxRate(int taxRate) {
		Course.taxRate = taxRate;
	}
	
	public static int getCount() {
		return Course.count;
	}

	// Constructor
	public Course(String name, int fee) {
		this.name = name;
		this.fee = fee;
		Course.count++;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.fee);
	}

	public int netFee() {
		return this.fee + this.fee * taxRate / 100;
	}

}
