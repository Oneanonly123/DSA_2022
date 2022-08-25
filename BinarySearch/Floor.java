package BinarySearch;

// Q1 = To Find the floor of Number- Biggest number smaller than and Equal to target
public class Floor {

    public static void main(String[] args) {
        int[] arr = { -2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
        int ans = floorofNumber(arr, target);
        System.out.println(ans);
    }

    static int floorofNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
        return end;
    }
}