package final_exam;

import java.util.Scanner;

/**
 *
 * @author Ben Michalowicz
 */
public class BasicPrimitiveTest {
    
    public int[] ids;
    public double balances[];
    public boolean[] hasTickets;
    
    
    public int eligibleForSale(int id){
        int idx = -1;
        
        for(int i = 0; i<100; i++){
            if(ids[i] == id){
                idx = i;
                break;
            }
        }
        
        if(idx==-1){
            System.out.println("Student with id: " + id + " not found");
            return -1;
        }
        
        if(hasTickets[idx]){
            System.out.println("Student already has a ticket");
            return -1;
        }
        
        if(balances[idx]<5.50){
            System.out.println("Insufficient funds for this student");
            return -1;
        }
        
        return idx;
        
        
    }
    
    public void makeSale(int idx){
        balances[idx]-=5.50;
        hasTickets[idx] = true;
    }
    
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the student's ID: ");
        
        int id = sc.nextInt();
        
        int idx = new BasicPrimitiveTest().eligibleForSale(id);
        
        if(idx!=-1){
            new BasicPrimitiveTest().makeSale(idx);
        }
    }
    
}
