/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm_exam;

/**
 *
 * @author Ben Michalowicz
 */
public class TriangleNumbers {
    
    public static int genNum(int n){ return (n*(n+1))/2;}
    
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        
        int amount = sc.nextInt();
        
        
        int totalCount = 1, perRowCount = 0, rowCount = 1, amountPerRow = genNum(rowCount);
        
        for(; totalCount<=amount; totalCount++){
            int num = genNum(totalCount);
            
            System.out.print(num); 
            perRowCount++;
            if(perRowCount==amountPerRow){
                System.out.println();
                perRowCount = 0;
                rowCount++;
                amountPerRow = genNum(rowCount);
            }else{
                if(totalCount!=amount){
                    System.out.print(", ");
                }
            }
            
        }
        System.out.println("");
    }
                
            
        
    
    
}
