package lab05;




/*
 * Benjamin Michalowicz (SBU ID: 110982339)
 * Lab 5, Part 3: Number Pattern
 */

import java.util.Scanner;
public class NumberPattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = sc.nextInt();
		
		displayPattern(num);
		sc.close();
	}
	
	
	public static void displayPattern(int n){
		
		for(int i =1; i<=n; i++){
			for(int j = i; j>0; j--){
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
