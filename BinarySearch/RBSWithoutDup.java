package BinarySearch;

import JavaCollection.string;

public class RBSWithoutDup {

    public static void main(string[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findPivotWithDup(arr));
    }

    static int search(int[] arr, int target) {
        int pivot = findPivotWithDup(arr);

        // if u don't find the pivot

        if (pivot == -1) {
            // do binary Search

            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // if pivot is found in 2 asc sorted array

        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        // int start = 0;
        // int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    static int findPivotWithDup(int[] arr) {

        // Pivot - Element for which all the next element are asc
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 Cases

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // if element at mid, start, end are duplicate

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicate
                // but also checking the condition whether or not
                // start and end are same
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;

            }

            // if left side is sorted , so pivot should be in right

            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }
}