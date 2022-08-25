package Recursion;

public class BinarySeach {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 6, 9, 10 };
        int target = 4;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
    }

    static int binarySearch(int[] arr, int target, int s, int e) {
        if (target > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target > arr[mid]) {
            binarySearch(arr, target, mid + 1, e);
        }

        return binarySearch(arr, target, s, mid - 1);

    }
}
