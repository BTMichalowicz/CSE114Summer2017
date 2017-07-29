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

import java.util.Arrays;
import java.util.Scanner;
public class MatrixStuff {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a size for a matrix: ");
        int size = sc.nextInt();
        
        int[][] matrix = new int[size][size];
        
        
        
        int count = 1;
        
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                matrix[i][j] = count++;
            }
        }
        
        System.out.println("The original matrix is: ");
         for(int[] a: matrix){
            System.out.println(Arrays.toString(a));
        }
        
        
       flipMajor(matrix);
        
        System.out.println();
        
        
        System.out.println("After inversion with respect to the major diagonal: ");
        for(int[] a: matrix){
            System.out.println(Arrays.toString(a));
        }
        
        System.out.println();
        
        count = 1;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                matrix[i][j] = count++;
            }
        }
        
        flipMinor(matrix);
        System.out.println("After inversion with respect to the minor diagonal: ");
        for(int[] a: matrix){
            System.out.println(Arrays.toString(a));
        }
        
        
    }
    
    
    public static void flipMinor(int[][] m){
        int n = m.length;
        int temp;
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i; j++){
                temp = m[i][j];
                m[i][j] = m[n-j-1][n-i-1];
                m[n-j-1][n-i-1] = temp;
            }
        }
    }
    
    
    
    public static void flipMajor(int[][] m){
        int n = m.length;
        int temp;
        
        for(int i = 0; i<n; i++){
            for(int j =0; j<i; j++ ){
                temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
    }
    
}
