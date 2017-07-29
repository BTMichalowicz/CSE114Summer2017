/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm_exam;

/**
 *
 * @author Ben Michalowicz
 */
public class ReverseString {
    
    public static String reverse(String s){
        String result = "";
        
        for(int i = s.length()-1; i>=00; i--){
            result+=s.charAt(i);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(reverse("Benjamin Michalowicz Franklin Roosevelt"));
        System.out.println(reverse("The quick brown fox jumped over the lazy brown dog."));
    }
    
}
