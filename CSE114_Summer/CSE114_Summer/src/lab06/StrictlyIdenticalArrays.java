package lab06;


/*
 * Benjamin Michalowicz (SBU ID: 110982339)
 * Lab 6, part 1: Strictly Identical Arrays
 */

import java.util.Scanner;
public class StrictlyIdenticalArrays {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the first array, followed by its elements: ");
		
		int size = sc.nextInt();
		int[] arr1 = new int[size];
                for(int i = 0; i<arr1.length; i++){
			arr1[i] = sc.nextInt();
		}
                
                
                
                System.out.print("Enter the size of the second array, followed by its elements: ");
                size = sc.nextInt();
		int[] arr2 = new int[size];
		
		
		
		for(int i = 0; i<arr2.length; i++){
			arr2[i] = sc.nextInt();
		}
		
		
		System.out.println("The arrays are" + (equals(arr1, arr2)?" equal": " not equal"));
		
		sc.close();
	}
	
	 
	
	
	/**
	 * 
	 * @param list1 The first array
	 * @param list2 The second array
	 * @return True or False, depending on whether the arrays are strictly equal
	 * 
	 * This method assumes that the arrays are of equal length, thus making it easier
	 * to determine whether or not the elements in every index are equal.
	 */
	public static boolean equals(int[] list1, int[] list2){
            
            if(list1.length!=list2.length){
                return false;
                    }
		
		for(int i = 0; i<list1.length && i<list2.length; i++){
			if(list1[i]!=list2[i]){
				return false;
			}else{
				continue;
			}
		}
		
		return true;
		
	}
	
	
	

	

}
