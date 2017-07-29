package lab10;



//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 10: Part 6: Finding the number of uppercase Letters in a String

import java.util.Scanner;
public class UppercaseCharSearch {

    public static int uppercaseSearch(String str) {
        if (str == null || str.length() == 0 || str.equals("")) {
            return 0;
        }

        if (Character.isUpperCase(str.charAt(0))) {
            return 1 + uppercaseSearch(str.substring(1, str.length()));

        } else {
            return uppercaseSearch(str.substring(1, str.length()));
        }

    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.println("There are " + uppercaseSearch(str) + " uppercase letters in the string.");
    }

}
