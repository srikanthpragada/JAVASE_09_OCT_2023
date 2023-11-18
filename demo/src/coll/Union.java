package coll;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;

public class Union {

	public static void main(String[] args) throws Exception {
		 Path p1 = Path.of("num1.txt");
		 Path p2 = Path.of("num2.txt");
		 
		 var lines = new LinkedHashSet<String>
		                 (Files.readAllLines(p1));
		 
		 lines.addAll(Files.readAllLines(p2));
		 
		 for(var line : lines)
			 System.out.println(line);
		 
		 
		
		
	}

}
