package lib2;

import java.nio.file.Files;
import java.nio.file.Path;

public class NamesStream {

	public static void main(String[] args) throws Exception {
		 var file = Path.of("names.txt");
		 
		 Files.lines(file)
		      .sorted()
		      .forEach(System.out::println);
	}

}
