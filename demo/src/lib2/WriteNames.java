package lib2;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames {

	public static void main(String[] args) throws IOException {
		String names[] = { "Larry", "Mark", "James", "Peter", "Kevin" };

		try (FileWriter fw = new FileWriter("names.txt")) {
			for (String name : names)
				fw.write(name + "\n");
		}

	}
}
