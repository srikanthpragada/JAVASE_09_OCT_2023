package coll;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class ListCustomers {

	public static void main(String[] args) throws Exception {
		Path p = Path.of("customers.txt");
		var customers = new TreeMap<String, String>();

		for (var line : Files.readAllLines(p)) {
			var parts = line.split(",");
			customers.put(parts[0], parts[1]);
		}

		for (var name : customers.keySet())
			System.out.printf("%-20s  %s\n", name, 
					  customers.get(name));

	}

}
