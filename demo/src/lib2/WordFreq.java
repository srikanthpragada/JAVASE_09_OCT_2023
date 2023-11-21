package lib2;

import java.util.TreeMap;
import java.util.regex.Pattern;

public class WordFreq {

	public static void main(String[] args) {
		String data = """
				This is    first line.
				This is second line.
				One more line.
				First, second,  third.
				One more line here.
				""";
		
		Pattern p = Pattern.compile("\\W+");
		var words = p.split(data);
		
		var wordFreq = new TreeMap<String, Integer>();
		
		for(var w : words)
		{
			if (wordFreq.containsKey(w)) // increment count 
				wordFreq.put(w, wordFreq.get(w) + 1);
			else
				wordFreq.put(w,1);  // new word
		}
		
		for(var w : wordFreq.keySet())
			System.out.printf("%-20s  %3d\n", w, wordFreq.get(w));

	}

}
