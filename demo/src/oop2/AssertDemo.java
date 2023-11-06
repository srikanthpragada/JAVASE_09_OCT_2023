package oop2;

public class AssertDemo {
	public static boolean isEven(int n) {
		return n / 2 == 0;
	}
	public static void main(String[] args) {
		 
		assert isEven(11)  == false : "isEven(11) not working";
        assert isEven(10) : "isEven(10) not working";

	}

}
