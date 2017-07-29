package homework1;


//Benjamin Michalowicz (SBU ID: 110982339)
//Homework 1, part 3: Calculating meters from an input in feet

import java.util.Scanner;
public class FeetToMeters {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value in feet: ");
		int feet = sc.nextInt();
		
		double meters = feet*0.305;
		
		System.out.println(feet + " feet is " + meters + " meters.");
		sc.close();
	}

}