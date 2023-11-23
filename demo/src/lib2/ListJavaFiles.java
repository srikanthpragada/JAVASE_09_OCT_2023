package lib2;

import java.nio.file.Files;
import java.nio.file.Path;

public class ListJavaFiles {

	public static void printFile(Path p) {
		try {
			System.out.println(p.toString());
			System.out.println("=".repeat(50));
			Files.lines(p).forEach(System.out::println);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void main(String[] args) throws Exception {
		Path stdir = Path.of("d:\\classroom\\oct9\\demo");
		Files.walk(stdir)
		    .filter(f -> f.toString().endsWith(".java"))
		    .forEach(f -> printFile(f));
	}

}
