/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture_programs;

import java.util.Scanner;

/**
 *
 * @author Ben Michalowicz
 */
public class RecursionExcamples {

    public static long factorial(int n) {
        if(n==0) {
            return 1;
        }
        return n*factorial(n-1);
    }
    
    static int count2 = 0;
    public static long fibonacci(int idx){
        
        if(idx==0 || idx==1){
            return 1;
        }
        
        count2++;
        return fibonacci(idx-1) + fibonacci(idx-2);
    }
    
    
    static int count = 0;
    static long[] l;
    public static long tabledfib(int idx){
        
        
        if(idx==0||idx==1) {
            return 1;
        }
        
        if(l[idx]!=0) {
            return l[idx];
        } else {
            count++;
            l[idx] = tabledfib(idx-1)+tabledfib(idx-2);
        }
        return l[idx];
        
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idx = sc.nextInt();
        l = new long[idx+1];
        
        System.out.println("\n\n");
        
        System.out.println(tabledfib(idx));
        System.out.println(count);
      
        System.out.println("\n\n");
        
        
        System.out.println(fibonacci(idx));
        System.out.println(count2);
   
    }

}
