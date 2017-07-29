package homework2;
//Benjamin Michalowicz (SBU ID: 110982339)
//Homework 2, Part 1: Average of Numbers, and number of Positive/Negative Numbers read


import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageSumPosNeg {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		try{
		System.out.println("Please enter non-zero integers, separated by a space (Enter 0 to quit):");
		
		int total = 0;
		int count = 0;
		
		
		int positive = 0, negative = 0;
		
		int number;
		while((number = input.nextInt()) != 0) {
		    total += number;
		    count++;
		    if(number > 0){
		        positive++;
		    } else if(number < 0) {
		        negative++;
		    }
		} 
		double average = total/(float)count;
		
		System.out.println("The total number of positive numbers that have been read = " + positive);
		
		System.out.println("The total number of negative numbers that have been read = " + negative);
		
		System.out.printf("The sum of the numbers is %d and the average of the numbers is %.4f", total, average);
		
		input.close();
		}catch (InputMismatchException e){
			e.printStackTrace();
		}
	}
}