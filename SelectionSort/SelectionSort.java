package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 5, 2 };
        SelectionSortAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SelectionSortAlgo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // fnd the max item in the remaining array and swap it with
            // correct index

            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[start] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
