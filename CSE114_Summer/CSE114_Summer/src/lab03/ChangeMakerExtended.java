package lab03;
//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 3, part 2: Extended Change Maker

import java.util.Scanner;

public class ChangeMakerExtended {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Price: $");
		double price = sc.nextDouble();
		System.out.print("From: $");
		double total = sc.nextDouble();

		double change = total - price;
		// These variables cannot be of type int, otherwise casting is done that
		// cuts off any decimals
		/*
		 * But casting IS done in the final output
		 */

		System.out.printf("Computed change: %.2f", change);

		//Every declaration is spaced out for readability
		double twenty = (change / 20);

		double rem = (change % 20);

		double ten = rem / 10;

		rem %= 10;

		double fives = rem / 5;

		rem %= 5;

		double single = rem;

		rem = (rem-1) * 100;

		double quarter = rem / 25;

		rem %= 25;

		double dimes = rem / 10;

		rem %= 10;

		double nickels = rem / 5;

		rem %= 5;

		double pennies = rem;

		System.out.println();
		System.out.println((int) twenty + " x $20\n" + (int) ten + " x $10\n" + (int) fives + " x $5\n" + (int) single
				+ " x $1\n" + (int) quarter + " Quarters\n" + (int) dimes + " Dimes\n" + (int) nickels + " Nickels \n"
				+ (int) pennies + " Pennies");
		sc.close();

	}
}
