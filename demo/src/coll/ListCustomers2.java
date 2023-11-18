package coll;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class ListCustomers2 {

	public static void main(String[] args) throws Exception {
		Path p = Path.of("customers.txt");
		var customers = new TreeMap<String, Set<String>>();

		for (var line : Files.readAllLines(p)) {
			var parts = line.split(",");
			if(parts.length < 2)
				continue;   // ignore line 
			
			var name = parts[0];
			var phone = parts[1];
			
			var phones = customers.getOrDefault(name, 
					                   new HashSet<String>());
			phones.add(phone);
			customers.put(name,  phones);
		}

		for (var name : customers.keySet()) {
			var phones = String.join(" - ",customers.get(name));
			System.out.printf("%-20s  %s\n", name,phones); 
		}
					  

	}

}
