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
public class Q42010 {

    
    static int a;
    static String b;
    public static void main(String[] args) {
        String s = "HELLO";

        int i = 0;

        while (s.length() < 10) {
            s += s.substring(i, i + 2);
            i++;
        }

        System.out.println(s);
        
        char RandomLowerCaseLetter = (char)('a' + Math.random()*('z'-'a' + 1));
        
        
        
        a = 5;
        b = "ABC";
        
        method1(a);
        System.out.println(a);
        System.out.println(b);
        
        a = 5;
        b = "ABC";
        method2(b);
        System.out.println(a);
        System.out.println(b);
        
        b = "ABC";
        method3(b);
        System.out.println(b);
        
        
        
        System.out.println();
        
        String t;
        t = "a\tb\"c\nd";
        
        int num = t.length();
        System.out.println(num);
        
        
        
    }
    
    
    public static void method1(int x){
        x = 0;
        b = "DEF";
    }
    
    public static void method2(String y){
        a = 0;
        y = "DEF";
        
        
        
        
    }
    
    
    
    public static void method3(String z){
        z.substring(1);
    }

}
