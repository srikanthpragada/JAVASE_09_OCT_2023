package lib2;

import java.util.List;

public class ListStream {

	public static void main(String[] args) {
		 var nums = List.of(10,20,30,-55,44,55, -10);
		 
		 nums.stream()
		     .filter(n -> n > 0)
		     .forEach(System.out::println);

	}
}
