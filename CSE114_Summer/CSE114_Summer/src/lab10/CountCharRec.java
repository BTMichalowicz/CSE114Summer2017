package lab10;




import java.util.Scanner;

//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 10, Part 5: Occurrences of a Specified Character in an array
public class CountCharRec {
    
    
    public static int count(char[] chars, char ch){
        
        return count(chars, ch, 0);
    }
    
    public static int count(char[] chars, char ch, int high){
        
        if(high<chars.length){
            if(chars[high] == ch){
                return 1 + count(chars, ch, high+1);
            }else{
                return count(chars, ch, high+1);
            }
        }
        
        return 0;
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        
        System.out.println(c + " occurs " + count(s.toCharArray(), c) + " times in the string.");
    }
    
}
