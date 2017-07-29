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

public class PrintSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = sc.nextInt();

        //printSquare(n);

        printSquareRec(n);
    }

    public static void printSquare(int n) {

        if (n == 1 || n == 0) {
            System.out.print("*");
            return;
        }

        for (int i = 0; i < n; i++) {

            System.out.print("*");

        }
        System.out.println();

        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");

            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");

        }

        for (int i = 0; i < n; i++) {

            System.out.print("*");

        }
        System.out.println();
    }

    public static void printSquareRec(int n) {

        printLine(n, 0);
        System.out.println();
        printMiddle(n - 2, 0);
   
        printLine(n, 0);
        System.out.println();
    }

    public static void printLine(int n, int i) {
        
        if(n==1){
            System.out.println("*");
            return;
        }
        if (i < n) {
            System.out.print("*");
            printLine(n, i + 1);

        }

    }
    
    
    public static void printMiddle(int middle, int i){
        
        if(i<middle){
            
            System.out.print("*");
            printMid2(middle, 0);
          
            System.out.println("*");
            printMiddle(middle, i+1);
        }
    }
    
    
    public static void printMid2(int middle, int j){
        
     
         if(j<middle){
            System.out.print(" ");
            printMid2(middle, j+1);
         }
     
    }
}
