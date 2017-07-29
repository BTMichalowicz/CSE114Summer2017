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
public class Jun82017Part3 {

    //Matrix Testing!!!
    public static void main(String[] args) {
        int[][] matrix = new int[3][2];
        Scanner sc = new Scanner(System.in);

//        for(int[] a: matrix){
//            for(int i: a){
//                a[i] = sc.nextInt();
//            }
//        } //Initializing Arrays via for-each loop
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        } //Initializing with a nested for-loop

        for (int[] a : matrix) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        
        
        
        //random shuffling
        
        
        for(int i = 0; i< matrix.length; i++){
            for (int j =0; j< matrix[i].length; j++){
                int i1 = (int)(Math.random()*matrix.length);
                int j1 = (int)(Math.random()*matrix[i1].length);
                
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }
        
        System.out.println();
        
        for (int[] a : matrix) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        
        
    }

}
