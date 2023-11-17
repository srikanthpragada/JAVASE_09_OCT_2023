package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class SortStudents {

	public static void main(String[] args) throws IOException {
		Path file = Path.of("students.txt");
		var lines = Files.readAllLines(file);

		var students = new TreeSet<String>();

		for (var line : lines) {
			var names = line.split(",");
			for (var name : names)
				students.add(name.strip());
		}
		
		for(var student : students)
			System.out.println(student);
	}

}
