package final_exam;

/**
 *
 * @author Ben Michalowicz
 */
import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = sc.nextInt();

        diamond(n);

    }

    public static void diamond(int n) {

        if (n % 2 == 0) {
            diamondEven(n);
        } else {
            diamondOdd(n);
        }

    }

    public static void diamondOdd(int n) {

        for (int i = 1; i <= n/2; i++) {
// n-i spaces
            for (int j = 1; j <= n/2 - i; j++) {
                System.out.print(" ");
            }
            
// print 2*(i-1) spaces

            if (i == 1) {
                System.out.print("*\n");
          

            } else {
                System.out.print("*");
                for (int j = 1; j <= 2 * (i - 1)-1; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

        }
// lower part
        for (int i = 2; i <= n/2; i++) {
// print i-1 spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
// print 2*(n-i) spaces 

            if (i == n/2) {
                System.out.print("*");
                System.out.println();

            } else {
                System.out.print("*");
                for (int j = 1; j <= 2 * (n/2 - i)-1; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

        }
    }

    public static void diamondEven(int n) {
        for (int i = 1; i <= n/2; i++) {
// n-i spaces
            for (int j = 1; j <= n/2 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
// print 2*(i-1) spaces

            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }
            System.out.println("*");

        }
// lower part
        for (int i = 2; i <= n/2; i++) {
// print i-1 spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
// print 2*(n-i) spaces 
            for (int j = 1; j <= 2*(n/2 - i); j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

    }

}
