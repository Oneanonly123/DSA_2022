package BubbleSort;

// import java.util.Arrays;

// Space Complexity - O(1);

// Time Complexity = O(N2);

public class BubbleSortSearch {

    // we are usign static here because we
    // want to run the main function
    // without actually creating the object of main
    // class. // static func do not depemd
    // on anything

    // String[] args - command line argument
    public static void main(String[] args) {
        int[] arr = { 2, 9, 4, 5, 1 };

        bubbleSort(arr);
        // System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr) {
        // if array is already sorted

        boolean swapped;
        // run the steps N-1 time;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                // swap if item is smaller than the previous item

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }

                if (!swapped) {
                    break;
                }
            }
        }
    }
}