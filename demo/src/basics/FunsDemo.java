package basics;

public class FunsDemo {

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static boolean isPrime(int num) {
		for(int i = 2; i <= num/2 ; i ++)
			if(num % i == 0)
				return false;
		
		return true; 
	}
	

	public static void main(String[] args) {

		System.out.println(add(10, 20));
		System.out.println(isPrime(13));
		
	}

}
