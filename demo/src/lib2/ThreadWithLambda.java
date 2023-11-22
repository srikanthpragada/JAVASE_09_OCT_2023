package lib2;

public class ThreadWithLambda {

	public static void main(String[] args) {
		 
		Thread t = new Thread( () -> System.out.println("Thread!!!"));
		t.start();
		

	}

}
