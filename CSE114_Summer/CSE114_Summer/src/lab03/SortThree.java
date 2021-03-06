package lab03;

//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 3, part 3: Sort Three Integers

import java.util.Scanner;

public class SortThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int temp1, temp2, temp3;

		System.out.print("Enter three numbers in any order: ");
		temp1 = sc.nextInt();
		temp2 = sc.nextInt();
		temp3 = sc.nextInt();

		int num1 = 0, num2 = 0, num3 = 0;

		// Any possible event of sorting the three numbers based on user input
		// Ternary operators work as well, but this

		if (temp1 <= temp2 && temp1 <= temp3) {
			if (temp2 <= temp3) {
				num1 = temp1;
				num2 = temp2;
				num3 = temp3;
			} else {
				num1 = temp1;
				num2 = temp3;
				num3 = temp2;
			}
		} else if (temp3 <= temp1 && temp3 <= temp2) {
			if (temp1 <= temp2) {
				num1 = temp3;
				num2 = temp1;
				num3 = temp2;
			} else {
				num1 = temp3;
				num2 = temp2;
				num3 = temp1;
			}
		} else if (temp2 <= temp1 && temp2 <= temp3) {
			if (temp1 <= temp3) {
				num1 = temp2;
				num2 = temp1;
				num3 = temp3;
			} else {
				num1 = temp2;
				num2 = temp3;
				num3 = temp1;
			}
		}

		System.out.println("The sorted numbers are: " + num1 + " " + num2 + " " + num3);
		sc.close();

	}

}
