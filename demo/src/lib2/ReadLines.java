package lib2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLines {

	public static void main(String[] args) throws IOException {
		String filename = "d:\\classroom\\names.txt";
				
		try (FileReader fr = new FileReader(filename);
			 BufferedReader br = new BufferedReader(fr))
			{
			while(true) {
				 String line = br.readLine();
				 if(line == null) // EOF 
					 break;
				 
				 System.out.println(line.toUpperCase());
			}
		}

	}
}
