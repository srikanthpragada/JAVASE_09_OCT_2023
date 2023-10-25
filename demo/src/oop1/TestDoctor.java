package oop1;

abstract class Doctor {
	private String name, mobile;

	public Doctor(String name, String mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.mobile);
	}
	
	public abstract int getPay();
}

class ResidentDoctor extends Doctor {
	private int salary;

	public ResidentDoctor(String name, String mobile, int salary) {
		super(name, mobile);
		this.salary = salary;
	}
	
	public void print() {
		super.print();
		System.out.println(this.salary);
	}
	
	public int getPay() {
		return this.salary;
	}
}

class Consultant extends Doctor {
	private int visits, charge;

	public Consultant(String name, String mobile, int visits, int charge) {
		super(name, mobile);
		this.visits = visits;
		this.charge = charge;
	}
	
	public void print() {
		super.print();
		System.out.println(this.visits);
		System.out.println(this.charge);
	}
	
	public int getPay() {
		return this.visits * charge;
	}
}


public class TestDoctor {

	public static void main(String[] args) {
		 Doctor d = new Consultant("Dr. Kim", "393939333", 10, 2000);
		 d.print();
		 System.out.println(d.getPay());
	}

}
