package final_exam;

/**
 *
 * @author Ben Michalowicz
 */
public class Sorting {

    public static void main(String[] args) {
        int[] arr = new int[9000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }

        Long timestart = System.currentTimeMillis();
        selectionSort(arr);

        Long timeEnd = System.currentTimeMillis();

        System.out.println("\n\n Time taken to SelctionSort = " + (timeEnd - timestart) + " milliseconds");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }

        timestart = System.currentTimeMillis();
        insertionSort(arr);

        timeEnd = System.currentTimeMillis();

        System.out.println("\n\n Time taken to InsertionSort = " + (timeEnd - timestart) + " milliseconds");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }

        timestart = System.currentTimeMillis();
        bubbleSort(arr);
        timeEnd = System.currentTimeMillis();

        System.out.println("\n\n Time taken to BubbleSort = " + (timeEnd - timestart) + " milliseconds");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }
        timestart = System.currentTimeMillis();
     mergeSort(arr);
        timeEnd = System.currentTimeMillis();

        System.out.println("\n\n Time taken to MergeSort = " + (timeEnd - timestart) + " milliseconds");

    }

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int curMin = arr[i];
            int minIdx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (curMin > arr[j]) {
                    curMin = arr[j];
                    minIdx = j;
                }
            }

            if (curMin != arr[i]) {
                arr[minIdx] = arr[i];
                arr[i] = curMin;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort(int[] arr) {

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static int[] mergeSort(int[] arr) {

        if (arr.length <= 1) {
            return arr;
        }

        int[] i = new int[arr.length / 2];

        int[] j = new int[arr.length-arr.length / 2];

        System.arraycopy(arr, 0, i, 0, arr.length/2);
        System.arraycopy(arr,0, j, 0, arr.length-arr.length/2);

        i = mergeSort(i);
        j = mergeSort(j);

        return merge(i, j);
    }

    public static int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while (i < left.length || j < right.length) {
            if (i == left.length) {
                result[k++] = right[j++];
            } else if (j == right.length) {
                result[k++] = left[i++];
            } else if (left[i] > right[j]) {
                result[k++] = right[j++];
            } else {
                result[k++] = left[i++];
            }
            

        }
        
        return result;

    }

}
