package lib2;

import java.nio.file.Files;
import java.nio.file.Path;

public class PrintLongNames {

	public static void main(String[] args) throws Exception {
		var file = Path.of("names.txt");

		var avg  = 
		   	  Files.lines(file)
		      .mapToInt( l -> l.length())
		      .average()
		      .getAsDouble();
		
		Files.lines(file)
		     .filter( name -> name.length() > avg)
		     .forEach(System.out::println);
		
		
		
	     	
		     
	}

}
