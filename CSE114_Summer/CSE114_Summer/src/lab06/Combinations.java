package lab06;


/*
 * Benjamin Michalowicz(SBU ID: 110982339)
 * Lab 6: part 3: Number combinations
 */

import java.util.Scanner;
public class Combinations {
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter ten numbers: ");
		
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The combinations of choosing 2 numbers from the input are as follows:");
		
		for(int i = 0; i<arr.length;i++){
			for(int j = i+1; j<arr.length; j++){
				if(i==j) continue;
				else{
					System.out.print(arr[i] + "-" + arr[j] + "\t");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
	
	 
	

}
