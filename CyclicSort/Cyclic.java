
// Time Complexity - We are doing N-1 comparison for inner and N comparison
// total = N + N-1 = 2N

package CyclicSort;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr = { 9, 2, 3, 4, 5, 1, 6, 10, 7, 8 };
        CyclicAlgo(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void CyclicAlgo(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }

        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }

}
