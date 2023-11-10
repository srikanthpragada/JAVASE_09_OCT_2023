package lib2;

import java.nio.file.Files;
import java.nio.file.Path;

public class FilesDemo {

	public static void main(String[] args) {
		 Path p = Path.of("d:\\classroom\\oct9\\demo\\names.txt");
		 
		 if (Files.exists(p))
			 System.out.println("Exists");
		 else
			 System.out.println("Does not exist");
		 
	}

}
