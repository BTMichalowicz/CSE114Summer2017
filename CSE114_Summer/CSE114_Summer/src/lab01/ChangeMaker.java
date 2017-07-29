package lab01;
//Benjamin Michalowicz (SBU ID: 110982339)
import java.util.Scanner;




public class ChangeMaker {
	
	public static void main(String[] args){
		
		System.out.print("Enter a value between 1 and 99 cents: ");
		
		Scanner sc = new Scanner(System.in);
		
		int change = sc.nextInt(); //integer declaration and initialization
		int rem; //remainder value
		
		int quarters =  change/25;
		rem = change%25; //The remainder of the change
		int dimes = rem/10; 
		rem%=10;
		int nickels = rem/5;
		rem%=5;
		int pennies = rem;
		
		sc.close();
		System.out.println("Your change can be divided into: \n" + quarters + " Quarters\n" + dimes + " Dimes\n" + nickels + " Nickels, and\n" + pennies + " Pennies. Have a nice day.");
	}

}
