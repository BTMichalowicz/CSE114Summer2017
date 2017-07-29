package lab10;


//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 10: Part 4, a and b: Factorial with both loops and recursion
public class FactorialLoopAndRec {
    
    
    public static int factLoop(int n){
        
        if(n==0) return 0;
        
        int res = 1;
        
        for(int i = 1; i<=n; i++){
            res*=i;
        }
        
        return res;
    }
    
    public static int factRec(int n){
        if(n==1) return 1;
        if(n==0) return 0;
        
        return n * factRec(n-1);
    
    }
    
    
    public static void main(String[] args) {
        System.out.println(factLoop(5));
        
        System.out.println(factRec(6));
    }
    
}
