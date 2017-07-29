package final_exam;

/**
 *
 * @author Ben Michalowicz
 */

import java.util.Scanner;
public class NumSquare {
    
    public static void main(String[] args){
        
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        printNumSquare(n);
        
        System.out.println("\n\n");
        
        square_rec(n);
    }   
    
    
    public static void printNumSquare(int n){
        
        for(int i = 1; i<=n; i++){
            
            
            
            for(int j = i, count = 0; count<n; count++, j++){
                if(j-1==n){
                    j=1;
                }
                System.out.print(j);
                
            }
            System.out.println();
        }
    }
    
    public static void square_rec(int n){
        rec1(n, 1);
    }
    
    
    public static void rec1(int n, int i){
        if(i<=n){
            rec2(n, i, 0);
            System.out.println();
            rec1(n, i+1);
        }
        
    }
    
    public static void rec2(int n, int j, int count){
        if(count<n){
            if(j-1==n){
                j=1;
            }
            
            System.out.print(j);
            rec2(n, j+1, count+1);
            
        }
        
        
    }
}
