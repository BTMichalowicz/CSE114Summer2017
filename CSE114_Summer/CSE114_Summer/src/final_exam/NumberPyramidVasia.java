package final_exam;

/**
 *
 * @author Ben Michalowicz
 */

import java.util.Scanner;
public class NumberPyramidVasia {
    
    //A variant of the number pyramid printing problem from midterm1 review, but
    //a la final study guide by vasia patov
    
   
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        
        int res = sc.nextInt(); 
       
        printNumPyramid(res);
        
        System.out.println();
        
        numPyramidRec(res);
    }
    
    public static void printNumPyramid(int n){
        
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            
            for(int j = 1; j<=n-i; j++){
                System.out.print(j);
            }
            
            for(int j = n-i-1; j>0; j--){
                System.out.print(j);
            }
            
            System.out.println();
        }
            
        
    }
    
    
    public static void numPyramidRec(int n){
        
        rec_1(n, 0);
    }
    
    private static void rec_1(int n, int i){
        if(i<n){
            spaces(i, 0);
            nums1(1, n-i);
            nums2(n-i-1, 0);
            System.out.println();
            rec_1(n, i+1);
        }
    }
    
    private static void spaces(int i, int j){
        if(j<i){
            System.out.print(" ");
            spaces(i, j+1);
        }
    }
    
    private static void nums1(int i, int j){
        if(i<=j){
            System.out.print(i);
            nums1(i+1, j);
        }
    }
    
    private static void nums2(int i, int j){
        if(i>j){
            System.out.print(i);
            nums2(i-1, j);
        }
    }
    
}
