package BinarySearch;
// Find Peak in Mountain Array - Binary Search

public class ElementinMountain {

    public static void main(String[] args) {
        // int[] arr = { -18, -12, -4, 0, 2, 4, 6, 18, 22, 89 };
        // int target = 22;
        // int ans = orderAgnosticBinarySearch(arr, target);
        // System.out.println(ans);

    }

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if (firstTry != -1) {

            return firstTry;
        }
        // try to search in the second half
        else {
            return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
        }

    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2
        // checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are ponting to just one element, that is the max one because
        // that is what the checks say
        // more elaboration: at every point of time for start and end, they have the
        // best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line
        // that is the best possible ans
        return start; // or return end as both are =
    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {

        // no need of start and end as we are searching manually from start to peak
        // int start = 0;
        // int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2
        // checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are ponting to just one element, that is the max one because
        // that is what the checks say
        // more elaboration: at every point of time for start and end, they have the
        // best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line
        // that is the best possible ans
        return -1; // or return end as both are =
    }
}