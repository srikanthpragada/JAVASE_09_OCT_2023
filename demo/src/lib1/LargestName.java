package lib1;

public class LargestName {
	public static void main(String[] args) {
		String input = "Joe, Jackson  , Mark, Steves, Jane";
		String names[] = input.split(",");

		String largestName = "";

		for (String name : names)
			if (name.strip().length() > largestName.length())
				largestName = name.strip();

		System.out.println(largestName);

	}

}
