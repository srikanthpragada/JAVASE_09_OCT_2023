package oop1;

public class Course {
	// Instance variables 
	private String name;
	private int fee;
	// Class variable 
	private static int taxRate = 12;
	
	public static void setTaxRate(int taxRate) {
		Course.taxRate = taxRate;
	}
	
	//Constructor
	public Course(String name, int fee) {
		this.name = name;
		this.fee = fee; 
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.fee);
	}
	
	public int netFee() {
		return  this.fee +  this.fee * taxRate / 100; 
	}

}
