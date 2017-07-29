/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermSolutions;

/**
 *
 * @author Ben Michalowicz
 */
public class MidtermSolutions {

    public static void main(String[] args) {
        int sum = 0, item = 0;

        do {
            item++;
            sum += item;
            if (sum >= 4) {
                continue;
            }
        } while (item < 7);

        System.out.println(sum);
    }

    public static int[] slice(int[] a, int i, int k) {

        int sizeB = k - i + 1;

        int[] b = new int[sizeB];

        for (int j = k; j >= i; j--) {
            b[sizeB--] = a[j];
        }

        return b;
    }

    public static double max(double[] a) {

        double max = a[0];

        for (double d : a) {
            if (d > max) {
                max = d;
            }
        }

        return max;
    }

    public static int[] insert(int[] a, int x, int i) {

        int[] b = new int[a.length + 1];

        for (int j = 0; j < i; j++) {
            b[j] = a[j];
        }

        b[i] = x;

        for (int j = i; j < a.length; j++) {
            b[j + 1] = a[j];
        }
        return b;
    }

}
