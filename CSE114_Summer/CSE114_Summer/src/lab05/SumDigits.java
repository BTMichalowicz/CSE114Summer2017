package lab05;




//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 5, part 1: Sum the digits in an integer

import java.util.Scanner;
public class SumDigits {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		
		long sum = sc.nextLong();
		
		int result = sumDigits(sum);
		
		System.out.println("The sum of the digits is " + result);
		sc.close();
		
	}
	
	
	public static int sumDigits(long n){
		
            int sum = 0;
            while(n>0){
                
                sum+=n%10;
                n/=10;
                
            }
            
            return sum;
		
	}

}
