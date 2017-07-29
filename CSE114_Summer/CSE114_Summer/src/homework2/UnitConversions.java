package homework2;
//Benjamin Michalowicz (SBU ID: 110982339)
//Homework 2, part 2: Unit Conversions

import java.util.Scanner;
public class UnitConversions {
	
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an letter between A and E: ");		
		System.out.print("\nA--> convert pounds to kilograms"
				+ "\nB-->convert kilograms to pounds"
				+ "\nC-->convert kilometers to miles"
				+ "\nD-->convert miles to kilograms"
				+ "\nE-->Exit\n");
		
		char c = sc.next().charAt(0);
		
		while(c!='A' &&c!='a' &&c!='B' &&c!='b' &&c!='C' &&c!='c' &&c!='D' &&c!='d' &&c!='E' &&c!='e'){			
			System.out.print("Please enter a proper choice: ");
		
			c = sc.next().charAt(0);
		
		}
		
		switch(c){
		case 'A': case 'a':
			System.out.println("Enter a quantity in pounds: ");
			double pounds = sc.nextDouble();
			poundsToKilos(pounds);
			break;
		case 'B': case 'b':
			System.out.println("Enter a quantity in kilograms: ");
			double kilograms = sc.nextDouble();
			kilosToPounds(kilograms);
			break;
		case 'C': case 'c':
			System.out.println("Enter a quantity in kilometers: ");
			double kilometers = sc.nextDouble();
			kmToM(kilometers);
			break;
		case 'D': case 'd':
			System.out.println("Enter a quantity in miles: ");
			double miles = sc.nextDouble();
			MToKm(miles);
			break;
		case 'E': case 'e':
			break;
		}
		
		System.out.println("Have a nice day!");
		
		sc.close();
		
		
	}
	
	public static double poundsToKilos(double pounds){
		double kilos = pounds/2.20462262;
		
		System.out.printf("the kilogram equivalent is %.3f\n", kilos);		
		
		return kilos;
		
	}
	public static double kilosToPounds(double kilos){
		double pounds = kilos*2.20462262;
		
		System.out.printf("the pound equivalent is %.3f\n", pounds);		
		
		return pounds;
		
		
	}
	public static double kmToM(double kms){
		
		double miles = kms/1.60934;
		System.out.printf("The miles equivalent is %.3f\n", miles);	
		return miles;
	
	
	}
	public static double MToKm(double m){
		double kms = m/1.60934;
		System.out.printf("The kilometer equivalent is %.3f\n", kms);	
		return kms;
	
	
	
	
	}

}
