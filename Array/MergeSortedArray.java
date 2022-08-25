package Array;

// Array Problem 

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = new int[] { 2, 4, 5, 10, 12 };
        int[] nums2 = new int[] { 1, 4, 6 };
        int m = nums1.length;
        int n = nums2.length;

        System.out.println(merge(nums1, m, nums2, n));
    }
    // Good Approach

    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = (m + n - 1); i >= 0; i--) {
            if (n > 0 && (m == 0 || nums1[m - 1] < nums2[n - 1])) {
                nums1[i] = nums2[--n];
            } else {
                nums1[i] = nums1[--m];
            }
        }
        return nums1;
    }

}