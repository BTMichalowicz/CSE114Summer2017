/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture_programs;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Ben Michalowicz
 */
public class MeasureTime {

    public static void main(String[] args) {
        Date d1 = new Date();

        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }

        java.util.Arrays.sort(arr); //Uses quicksort

        Date d2 = new Date();

        long elapsedTime = d2.getTime() - d1.getTime();

        System.out.println(elapsedTime / 1000 + " seconds");
    }

    public static void selectionSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int minIdx = i;
            int min = a[i];

            for (int j = i + 1; j < a.length; j++) {
                   if(min>a[j]){
                       min = a[j];
                       minIdx = j;
                   }
            }
            
            if(minIdx!=i){
                a[minIdx] = a[i];
                a[i] = min;
            }
        }
    }

}
