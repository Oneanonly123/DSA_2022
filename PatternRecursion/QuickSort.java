package PatternRecursion;

import java.util.Arrays;

public class QuickSort {

    // Pivot - Choose any element in which after first
    // pass all the element < pivot wil be on the LHS and element
    // > pivot will be at the RHS of p

    // After every pass pivot is at the right place

    // T(N) = T(k) + T(N-k-1) + O(N)

    // Worst Case - When part of an array is empty if
    // pivot element is we choose is the largest element

    // T(N) = T(0) + T(N-1) +O(N) = O(N2)

    // Best Case = T(N/2) + T(N/2) + O(N)
    // T(N) = 2T(N/2) + O(N) = O(N)

    // Not Stable , MS is better in Linked List

    // Tin Sort -> Mergw Sort + Insertion Sort

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        // now my pivot is at correct index , please sort two halves now

        quickSort(nums, low, e);
        quickSort(nums, s, high);

    }
}
