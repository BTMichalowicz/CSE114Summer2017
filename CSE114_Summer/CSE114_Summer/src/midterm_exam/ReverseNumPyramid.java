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
public class ReverseNumPyramid {
    
    public static void printPyramid(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for(int j = i; j<n; j++){
                System.out.print(j+1);
            }
            for(int j = n-1; j>i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        printPyramid(9);
    }
    
}
