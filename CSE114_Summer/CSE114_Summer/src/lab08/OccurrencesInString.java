package lab08;


import java.util.Scanner;




//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 8, part 2: Occurrences of a specified character
public class OccurrencesInString {
    
    public static int count(String s, char c){
        int numCount = 0;
        
        for(char a: s.toCharArray()){
            if(a==c){
                numCount++;
            }
            
            
        }
        return numCount;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        
        System.out.println("The number of occurrences of the character " + c +" in the string is: " + count(s, c));
        
    }
    
    
  
    
}
