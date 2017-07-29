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
public class Tartan {

    public static void main(String[] args) {
        tartan_rec(4);

        System.out.println();
        tartan(24);

    }

    public static void tartan(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(n + " ");
                } else {
                    System.out.print(n - 1 + " ");
                }
            }
            System.out.println();
        }
    }
    
    
    public static void tartan_rec(int n){
        tartan_rec1(n, 0);
    }

    public static void tartan_rec1(int n, int i) {
        
        if (i <n) {
            tartan_rec2(n, i, 0);
            System.out.println();
            tartan_rec1(n, i+1);
            
        }

    }

    public static void tartan_rec2(int n,int i, int j) {

        if (j < n) {
            if ((j + i) % 2 == 0) {
                System.out.print((n) + " ");
            } else {
                System.out.print((n-1) + " ");
            }
            tartan_rec2(n, i, j + 1);
        }
    }

}
