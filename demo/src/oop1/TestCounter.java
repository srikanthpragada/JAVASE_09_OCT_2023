package oop1;

class Counter {
	private int value;

	public Counter() {
	}
	
	public Counter(int v) {
		this.value = v;
	}

	public void inc() {
		this.value++;
	}
	public void inc(int step) {
		this.value += step;
	}

	public void dec() {
		this.value--;
	}

	public void dec(int step) {
		this.value -= step;
	}
	
	public int getValue() {
		return this.value;
	}
}

public class TestCounter {

	public static void main(String[] args) {
		Counter c = new Counter(100);
		c.inc();
		c.inc(2);
		c.dec(5);
		
		System.out.println(c.getValue());
	}
}
