package lab11;


import java.util.Scanner;

//Benjamin Michalowicz(SBU ID: 110982339)
//Lab 11: Part 2: Reversing a String
public class ReverseString {
    
    
    public static void reverseDisplay(String str){
        
        if(str==null || str.length()==0 || str.equals("")){
            System.out.println("");
            return;
        }
        
        System.out.print(str.charAt(str.length()-1));
        
        reverseDisplay(str.substring(0, str.length()-1));
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        
        String str = sc.nextLine();
        
        reverseDisplay(str);
    }
    
}
