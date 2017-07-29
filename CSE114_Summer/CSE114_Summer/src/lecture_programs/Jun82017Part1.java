/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture_programs;

/**
 *
 * @author Ben Michalowicz
 */
import java.util.Scanner;

public class Jun82017Part1 {

    public static void main(String[] args) {
        
       //Array initialization with user input
////
////        Scanner sc = new Scanner(System.in);
////
//       double[] arr = new double[10];
////
////        System.out.println("Enter " + arr.length + " elements: ");
////        
////        for(int i = 0; i<arr.length; i++){
////            arr[i] = sc.nextDouble();
////        }
////        
////        for(double d:arr){
////            System.out.println(d);
////        }
//
//
//        //Initialization with random values
//        
//        for(int i = 0; i<arr.length; i++){
//            arr[i] = (int) (Math.random() * 101);
//        }
//        
//        for(double d:arr){
//            System.out.println(d);
//        }
//         //Finding the maximum element:
//         
//         double max = arr[0];
//         
//         for(int i = 1; i<arr.length; i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         
//         System.out.println("\n" + max);
//         
//         
//         double min = arr[0];
//         
//           for(int i = 1; i<arr.length; i++){
//             if(arr[i]<min){
//                 min= arr[i];
//             }
//         }
//         
//         System.out.println("\n" + min);




            //*Array shuffling
            
            double [] arr = new double[10];
            int j;
            
            Scanner sc = new Scanner(System.in);
            for(int i = 0; i<arr.length; i++){
                arr[i] = sc.nextDouble();
            }
            for(int i = 0; i<arr.length; i++){
                j = (int)(Math.random()*arr.length);
                
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
            for(double d: arr){
                System.out.print(d + " ");
            }
            
            
            
            //Left shift.
            
            
        for(j = 0; j<3; j++){    
            double temp = arr[0];
            
            for(int i = 1; i<arr.length; i++){
                arr[i-  1] = arr[i];
            }
            arr[arr.length-1] = temp;
        }
        
        System.out.println();
            for(double d: arr){
                System.out.print(d + " ");
            }
            
            
            //Right shift
            
            
            for(j = 0; j<3; j++){
                double temp = arr[arr.length-1];
                
                for(int i = arr.length-1; i>0; i--){
                    arr[i] = arr[i-1];
                }
                
                arr[0] = temp;
            }
            
              System.out.println();
            for(double d: arr){
                System.out.print(d + " ");
            }
             

    }

}
