package PatternRecursion;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quick(int[] arr, int low, int high) {
        while (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }

            while (arr[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }

            // after the all the element on left are smaller and all the element on the
            // right are greater

            quick(arr, low, e);
            quick(arr, s, high);
        }

    }
}
