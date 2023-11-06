package oop2;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		int total = 0;
		Scanner s = new Scanner(System.in);

		for (int i = 1; i <= 5; ) {
			System.out.print("Enter number :");
			try {
				int n = Integer.parseInt(s.nextLine());
				total += n;
				i ++;
			} catch (NumberFormatException ex) {
                System.out.println("Invalid Number!");
			}
		}

		System.out.println(total);
	}

}
