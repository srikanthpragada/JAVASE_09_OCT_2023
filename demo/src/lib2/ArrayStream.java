package lib2;

import java.util.Arrays;

public class ArrayStream {
	
	public static void main(String[] args) {
		 int [] nums = {10,10,20,40,50,66,55,44,33};
		 
		
		 
		 Arrays.stream(nums)
		       .filter( (int v) -> v % 2 == 0)  // IntPredicate - boolean test(int v)
		       .distinct()
		       .sorted()
		       .limit(5)
		       .forEach(System.out::println); // IntConsumer - void accept(int v)
		 
	}

}
