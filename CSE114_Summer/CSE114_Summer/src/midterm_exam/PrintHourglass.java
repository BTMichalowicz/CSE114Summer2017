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
public class PrintHourglass {

    public static void print(int n) {
        
        if(n==1){
            System.out.println("*");
            return;
        }
        
        for(int i = 0; i<n; i++){
            System.out.print("*");
        }
        System.out.println("");

        int bound = ((n%2==0)?n/2-1:n/2);
            
        for(int i = 1; i<bound; i++){
            for(int j = 0; j<i; j++){
            System.out.print(" ");
            }
            System.out.print("*");
            for(int j = 0; j <(n-2-(2*i)); j++){
                System.out.print(" ");
            }
            System.out.println("*");
            
                       
        }
        
        if(n%2!=0){
            for(int i = 0; i< n/2; i++){
                System.out.print(" ");
               
            }
            
            System.out.println("*");
        }
        
        for(int i = n/2-1; i>0; i--){
            for(int j = 0; j<i; j++){
            System.out.print(" ");
            }
            System.out.print("*");
            for(int j = (n-2-(2*i)); j >=1; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            
            System.out.println();
            
        }
        
         for(int i = 0; i<n; i++){
            System.out.print("*");
        }
         System.out.println();
       
        
        
        
    }

    public static void main(String[] args) {
        print(13);
    }

}
