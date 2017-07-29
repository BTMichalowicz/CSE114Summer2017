package homework3;


//Benjamin Michalowicz (SBU ID: 110982339)
//Homework 3, Part 1: List partitioning
import java.util.Scanner;

public class PartitionList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the list, followed by its elements\n"
                + "the pivot point will be the first element of the list: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }

        int pivot = partition(arr);
        System.out.print("The list after the partition is: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.print("The pivot is at position (0-based-index): " + pivot);

        sc.close();

    }

    public static int partition(int[] arr) {

        int start = 0;

        int low = start, high = arr.length - 1;
        int pivot = arr[start];

        int[] newArr = new int[arr.length];

        for (int i = 1; i < arr.length; i++) {
            if (pivot > arr[i]) {
                newArr[low++] = arr[i];
            } else {
                newArr[high--] = arr[i];
            }

        }

        newArr[low] = pivot;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArr[i];

        }

        return low;

    }

}
