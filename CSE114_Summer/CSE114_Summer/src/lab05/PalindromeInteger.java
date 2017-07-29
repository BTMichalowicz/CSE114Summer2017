package lab05;




/*
 * Benjamin Michalowicz (SBU ID: 110982339)
 * Lab 5, part 2: Palindrome Integers
 */

import java.util.Scanner;
public class PalindromeInteger {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		
		int num1 = sc.nextInt();
		
		
		int reverse = reverse(num1);
                
                System.out.println("The reversed version of this number is " + reverse);
		
		System.out.println("The number " + num1 + ((isPalindrome(num1))?" is a palindrome.":" is not a palindrome."));
		
		
		
		
		
		sc.close();
		
	}
	
	
	public static int reverse(int number){
		int reversed = 0;
		
		
                
                while(number>0){
                    reversed = reversed*10 + number%10;
                    
                    number/=10;
                }
                
                return reversed;
	}
	
	public static boolean isPalindrome(int number){
		
		return number == reverse(number);
		
	}
}
