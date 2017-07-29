package lecture_programs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben Michalowicz
 */
public class DiamondPattern {

    public static void main(String[] args) {
        hourglass(10);
        
        diamond(10);
    }

    public static void hourglass(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            System.out.print("-");
        }
        System.out.println();
// upper part
        for (int i = 1; i <= n; i++) {
// print i-1 spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
// print 2*(n-i) spaces 
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            System.out.println("/");
        }
// lower part
        for (int i = 1; i <= n; i++) {
// n-i spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
// print 2*(i-1) spaces
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }
        for (int i = 1; i <= 2 * n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void triangle(int n) {
// upper part
        for (int i = 1; i <= n; i++) {
// n-i spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
// print 2*(i-1) spaces
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }
        for (int i = 1; i <= 2 * n; i++) {
            System.out.print("-");
        }
    }

    public static void diamond(int n) {
// upper part
        for (int i = 1; i <= n; i++) {
// n-i spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
// print 2*(i-1) spaces
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }
// lower part
        for (int i = 1; i <= n; i++) {
// print i-1 spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
// print 2*(n-i) spaces 
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            System.out.println("/");
        }
    }
}
