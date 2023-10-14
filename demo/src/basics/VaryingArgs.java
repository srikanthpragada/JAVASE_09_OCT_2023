package basics;

public class VaryingArgs {

	public static int total(int... values) {
		int sum = 0;
		for (int n : values)
			sum += n;

		return sum;
	}
	
	public static void wish(String msg, String ... names) {
		for(String name : names)
			System.out.println(msg + " " + name);
	}

	public static void main(String[] args) {

		System.out.println(total(10, 20, 40));
		System.out.println(total(10, 20, 40, 88, 45));
		
		wish("Hi", "Joe", "Andy");
		wish("Hello", "Jane", "Cathy", "Belinda");
		wish("Hi");
		
		

	}

}
