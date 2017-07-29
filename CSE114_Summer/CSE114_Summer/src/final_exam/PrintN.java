package final_exam;

/**
 *
 * @author Ben Michalowicz
 */
import java.util.Scanner;

public class PrintN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        printN(n);
        System.out.println("\n\n");
        
        printNRec(n);
    }

    public static void printN(int n) {

        for (int i = 0; i < n; i++) {

            System.out.print("N");

            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }

            if (i > 0 && i < n - 1) {
                System.out.print("N");
            }

            for (int k = (i==0 || i==n-1? i : i+1); k < n; k++) {
                
                System.out.print(" ");

            }

            System.out.println("N");
        }
    }
    
    
    
    public static void printNRec(int n){
        rec_1(n, 0);
    }
    
    public static void rec_1(int n, int i){
        if(i<n){
            System.out.print("N");
            spaces(i, 0);
            if(i>0 &&i<n-1) {
                System.out.print("N");
            }
            
            int k = (i==0||i==n-1?i:i+1);
            
            spaces(n, k);
            System.out.println("N");
            rec_1(n, i+1);
        }
        
    }
    
    public static void spaces(int i, int j){
        if(j<i){
            System.out.print(" ");
            spaces(i, j+1);
        }
    }

}
