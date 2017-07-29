package final_exam;

/**
 *
 * @author Ben Michalowicz
 */
public class ReverseArrayClass {
    
    
    public static void main(String[] args) {
        int[] arr = new int[1000];
        
        for(int i = 0; i< arr.length; i++){
            arr[i] = i+1;
        }
        
        
        arr = reverseArray(arr);
        
        
        for(int a: arr){
            System.out.print(a + " ");
        }
    }
   
    
    public static int[] reverseArray(int[] arr){
        
        int[] res = new int[arr.length];
        
        
        for(int i = 0; i<arr.length; i++){
            
            res[i] = arr[arr.length-1-i];
            
        }
        
        return res;
    }
}
