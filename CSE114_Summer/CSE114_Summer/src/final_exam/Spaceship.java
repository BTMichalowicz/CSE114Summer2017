/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_exam;

/**
 *
 * @author Ben Michalowicz
 */

import java.util.Scanner;
public class Spaceship {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int n = sc.nextInt();
        
        printSpaceShip(n);
        
        System.out.println("\n\n");
        
        printSpaceshipRec(n);
    }
    
    
    public static void printSpaceShip(int n){
        
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=(2*i); j++){
                System.out.print("\\");
            }
            System.out.println();
        }
        
        
        for(int i = 0; i<2*n+1; i++){
            System.out.print(">");
        }
        
        System.out.println();
        
        
        for(int i = n; i>=0; i--){
            for(int j = 0; j<(2*i-1); j++){
                System.out.print("/");
            }
            System.out.println();

        }
        System.out.println();
    }
    
    
    
    public static void printSpaceshipRec(int n){
        if(n<1){
            System.out.print(">");
            return;
        }
        
        printTop1(n, 0);
        
        printMiddle(2*n, 0);
        System.out.println();
        printBottom1(n, n);
     
    }
    
    
    
    public static void printTop1(int n, int i){
        
        if(i<n){
            printTop2(2*i+1, 0);
            System.out.println();
            printTop1(n, i+1);
        }
    }
    
    
    public static void printTop2(int middle, int j){
        
        if(j<middle){
            System.out.print("\\");
            printTop2(middle, j+1);
        }
        
        
        
        
    }
    
    
    public static void printMiddle(int n, int i){
        if(i<=n){
            System.out.print(">");
            printMiddle(n, i+1);
        }
    }
    
    
    public static void printBottom1(int n, int i){
        if(i>=0){
            printBottom2(2*i-1, 0);
            System.out.println();
            printBottom1(n, i-1);
        }
    }
    
    public static void printBottom2(int middle, int j){
        if(j<middle){
            System.out.print("/");
            printBottom2(middle, j+1);
        }
        
    }
}
