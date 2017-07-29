package homework5;

//Benjamin Michalowicz (SBU ID: 110982339)
//Homework 5, Part 1: Finding the maximum odd number in an array of integers
public class RecursiveOddNum {
   	

	public static int recursiveOdd(int[] arr) {
		int largestNum = 0;

		if (arr.length == 1) {
			if (arr[0] % 2 == 0) {
				return 1; //No odd elements in the array
			} else {
				return arr[0]; //The odd number is the largest odd number
			}
		} else {
			largestNum = recursiveOddHelp1(arr, largestNum, 0);
		}

		return largestNum;
	}

	//Helper method
	public static int recursiveOddHelp1(int[] arr, int largestOdd, int counter) {
		
		if (counter<arr.length) {
			if (arr[counter] % 2 != 0) {
				if (largestOdd < arr[counter]) {
					largestOdd = arr[counter];
					
					return recursiveOddHelp1(arr, largestOdd, counter+1);

				}else{
					return recursiveOddHelp1(arr,largestOdd, counter+1);
				}

			}else{
				return recursiveOddHelp1(arr,largestOdd, counter+1);
			}
		}
		return largestOdd;
		
		
	}

}