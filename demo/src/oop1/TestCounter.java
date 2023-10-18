package oop1;

class Counter {
	private int value;

	public Counter() {
	}
	
	public Counter(int v) {
		value = v;
	}

	public void inc() {
		value++;
	}
	public void inc(int step) {
		value += step;
	}

	public void dec() {
		value--;
	}

	public void dec(int step) {
		value -= step;
	}
	
	public int getValue() {
		return value;
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
