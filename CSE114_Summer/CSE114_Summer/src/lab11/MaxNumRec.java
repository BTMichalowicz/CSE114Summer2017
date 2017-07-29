package lab11;

//Benjamin Michalowicz(SBU ID: 110982339)
//Lab 11: Part 1: Maximum Integer in an Array
public class MaxNumRec {
    
    
  /**
   * 
   * @param arr: The int array
   * @param n The number of elements in the array (or, arr.length)
   * @return the largest number in the array
   */
    public static int findLargestRec(int[] arr, int n){
        
        if(n==1) {
            return arr[n-1];
        }
        if(n==0) {
            return 0;
        }
        
        
        if(arr[n-1]> findLargestRec(arr, n-1)){
            return arr[n-1];
        }else {
            return findLargestRec(arr, n-1);
        }
        
    }
    
    public static void main(String[] args) {
        int[] arr= new int[]{
            1, 2, 3, 4, 54, 77, 234, 65, 2, 5, 7, 8, 5, 432, 3452,12};
        
        
        int[] arr2 = new int[]{};
        
        
        //Full array
        System.out.println("The largest number in the (full) array (test) is: " + 
                findLargestRec(arr, arr.length));
        
        
        System.out.println("The largest number in the (empty) array (test) is: "
            + findLargestRec(arr2, arr2.length));
        
        int[] arr3 = new int[]{12};
        
        System.out.println("The largest number in the (single element) array (test) is: " + 
                findLargestRec(arr3, arr3.length));
    
    
    }
    
    
    
}
