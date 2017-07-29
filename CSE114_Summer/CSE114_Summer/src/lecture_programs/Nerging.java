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
public class Nerging {

    public static int[] merge(int[] arr1, int[] arr2) {
        int result[] = new int[arr1.length + arr2.length];
        int idex_A = 0;
        int idex_B = 0;
        int idex_result = 0;
        while (idex_A < arr1.length || idex_B < arr2.length) {
            if (idex_B >= arr2.length || (idex_A < arr1.length && arr1[idex_A] < arr2[idex_B])) {
                result[idex_result++] = arr1[idex_A++];
            } else {
                result[idex_result++] = arr2[idex_B++];
            }
        }
        return result;
    }

}
