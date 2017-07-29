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
public class Euler {
    
    public static int gcd(int a, int b){
        while(b!=0){
            int t = b;
            b = a%b;
            a = t;
        }
        
        return a;
    }
    
    public static int euler_totient(int n){
        int count = 0;
        
        for (int i = 1; i<n; i++){
            if(gcd(i, n)==1){
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args){
        
        System.out.println(euler_totient(1));
        
    }
    
}
