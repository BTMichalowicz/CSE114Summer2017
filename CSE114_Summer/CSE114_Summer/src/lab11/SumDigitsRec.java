package lab11;


import java.util.Scanner;

//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 11: part 3: Summing the digits in an integer recursively
public class SumDigitsRec {
    
    
    public static int sum(int n){
        
        
        if(n==0) {
            return 0;
        }
        
        
        return n%10 +sum(n/10);
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        
        int n = sc.nextInt();
        
        
        System.out.println("The sum of the digits in " + n + " is " + sum(n));
    }
    
    
    
    
    
}
