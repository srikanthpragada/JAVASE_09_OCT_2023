package coll;

import java.time.LocalDate;
import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		 ArrayList al = new ArrayList(); // not type-safe 
		 
		 al.add("Abc");
		 al.add(10);  // Integer 
		 al.add(LocalDate.now());
		 
		 String s = (String) al.get(0);
		 
		 
		 ArrayList<String> names = new ArrayList<>();
		 names.add("Abc");
		 String name = names.get(0);
		 
		 ArrayList<Integer> prices = new ArrayList<>();
		 var marks = new ArrayList<Integer>();
		 
		 

	}

}
