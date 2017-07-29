package homework5;

//Benjamin Michalowicz (SBU ID: 110982339)
//Homework 5 Part 2: Summing of Squares recursively


public class SumSquaresRec {
    public static void main(String[] args) {
        System.out.println(sumSquares(1, 5));
        
    }
    
   
    
    public static int sumSquares(int i, int n){
         
        
        return sumSquaresRec(i, n, 0);
    }
    
    public static int sumSquaresRec(int i, int j, int result){
        if(i<=j){
            result+=i*i;
            return sumSquaresRec(i+1, j, result);
        }
        return result;
    }
    
}
