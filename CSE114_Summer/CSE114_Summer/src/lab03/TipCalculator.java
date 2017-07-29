package lab03;
//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 3: Part 1: Tip Calculator

import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Enter the subtotal: $");
//
//		double value = sc.nextDouble();
//
//		double tip = 0;
//
//		//Conditions for the tip calculations
//		if (value < 30) {
//			tip = 5;
//		} else {
//			tip = (value * 0.15);
//		}
//
//		System.out.printf("The gratuity is $%.2f and the total is $%.2f", tip, (tip + value));
//		sc.close();
		
		
		//Do While alternative
		Scanner sc = new Scanner(System.in);
		String repeat = "";
	
		
		do{
			System.out.print("Enter the subtotal: $");
			
			double value = sc.nextDouble();
			double tip = 0;
			
			if(value<30){
				tip = 5;
			}else{
				tip = value*0.15;
			}
			
			System.out.println("The tip is $" + tip + " and the total is $" + (tip+value));
			System.out.print("Do you want another tip? (Y or N): ");
			
			repeat = sc.next();
		}while(!repeat.toUpperCase().equals("N"));
		System.out.println("Have a good day!");
		sc.close();
	}

}
