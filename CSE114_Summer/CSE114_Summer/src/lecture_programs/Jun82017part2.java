/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture_programs;

/**
 *
 * @author Ben Michalowicz
 */
public class Jun82017part2 {
    public static void main(String[] args) {
        int[] list1 = new int[]{1, 2, 908, 4, 5, 6, 7};
        
        print(list1);
        
        System.out.println();
        int[] list2 = reverse(list1);
        
        
        reverse2(list1);
        
        
        print(list1);
        System.out.println();
        print(list2);
        System.out.println();
        
        System.out.println(linearSearch(list1, 0));
        
        
        insertionSort(list2);
        
        System.out.println("\n");
        print(list2);
    }
    
    public static int[] reverse(int[] arr1){
        int[] arr2 = new int[arr1.length];
        
        for(int i = 0, j = arr1.length-1; i<arr2.length && j>=0; i++, j--){
        arr2[i] = arr1[j];
    }
        
        return arr2;
    }
    
    
    public static void reverse2(int[] arr){
        for(int i = 0, j=arr.length-1; i<arr.length/2&& j>=arr.length/2; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        } 
    }
    
    
    public static void print(int[] list){
        for(int x:list){
            System.out.print(x + " ");
        }
    }
    
    
    
    
    public static int linearSearch(int[] arr, int key){
        for(int i : arr){
            if(key==i){
                return key;
            }
            
        }
        return -1;
        
    }
    
    
    public static int binarySearch (int[] sortedList, int key){
        int low = 0;
        int high = sortedList.length-1;
        
        int mid;
        
        while(high>=low){
            
            mid = (low+high)/2;
            
            if(key<sortedList[mid]) {
                high = mid-1;
            } else if(key==sortedList[mid]) {
                return mid;
            } else {
                low = mid+1;
            }
            
            
        }
        return -1-low;
    }
    
    
    //Selection Sort
    
    public static void selectionSort(int[] list){
        
        
        for(int i = 0; i<list.length;i++){
            int curMin = list[i];
            
            int minIndex = i;
            
            for(int j = i+1; j<list.length; j++){
                if(minIndex>list[j]){
                    curMin = list[j];
                    minIndex = j;
                }
            }
            
            if(minIndex!=i){
                list[minIndex] = list[i];
                list[i] = curMin;
            }
        }
    }
    
    
    public static void insertionSort(int[] list){
        int temp;
        
        for(int i = 1; i<list.length; i++){
            temp = list[i];
            
            int j = i-1;
            while(j>=0 && list[j]>temp){
                list[j+1] = list[j];
                j--;
            }
            
            list[j+1] = temp;
        }
        
        
    }
    
}
