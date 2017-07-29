package final_exam;



/**
 *
 * @author Ben Michalowicz
 */
import java.util.Scanner;

public class BernoulliTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = sc.nextInt();

        bernoulli(n);
    }

    public static void bernoulli(int n) {
        if (n <= 1) {
            System.out.println(1);
            return;
        }

        int[][] arr = new int[n+1][n+1];

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < i; j++) {

                arr[i][0] = 1;

                if (j == 1 && i > 0) {
                    arr[i][j] = i + j - 1;
                }

                if (i > 1 && j > 1) {
                    arr[i][j - 1] = arr[i - 1][j - 1] + arr[i - 1][j - 2];
                    arr[i][j] = arr[i][j - 1] + 1;
                }

                
                    
                

            }
        }

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print(arr[i][j] + "\t");

            }

            System.out.println();
        }

    }
}
