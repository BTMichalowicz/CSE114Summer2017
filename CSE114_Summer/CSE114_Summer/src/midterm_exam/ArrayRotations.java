/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm_exam;

import java.util.Arrays;

/**
 *
 * @author Ben Michalowicz
 */
public class ArrayRotations {
    
    public static void rotateRight(int[] arr, int n){
        
        for(int i = 0; i< n; i++){
            int temp = arr[arr.length-1];
            
            for(int j = arr.length-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            
            arr[0] = temp;
        }
    }
    
    
    public static void rotateLeft(int[] arr, int n){
        
        for(int i = 0; i< n; i++){
            
            int temp = arr[0];
            for(int j = 0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
                
            }
            arr[arr.length-1] = temp;
           
        }
    }
    
    
    public static void main(String[] args){
        int[]a = new int[]{1, 2, 3, 4, 5};
        
        
        rotateRight(a, 3);
        
        System.out.println(Arrays.toString(a));
        
        rotateLeft(a, 3);
        
        System.out.println(Arrays.toString(a));
    }
    
}
