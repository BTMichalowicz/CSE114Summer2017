package lecture_programs;

import java.util.Scanner;


/**
 * 
 * @author Hen Michalowicz
 *
 *
 *Basic Changemaker class
 */
public class ChangeMaker {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value between 0 and 99 (ideally for cents, but you can enter larger values): ");
		
	
		
		int amount = sc.nextInt();
		
		if(amount<0) {
			extracted();
		}
		
		int quarters = amount/25;
		
		int rem = amount%25;
		
		int dimes = rem/10;
		
		rem = rem%10;
		
		int nickels = rem/5;
		
		rem%=5;
		
		int pennies = rem;
		
		
		System.out.println("Quarters = " + quarters + "\nDimes = " + dimes + "\nNickels = " + nickels + "\nPennies = " + pennies);
		
		
		sc.close();
	}

	private static void extracted() {
		throw new IllegalArgumentException("What the fuck, dude?");
	}

}
