package Array;

// Find the max profit in buy and sell stock if can hold atmost
// one stock at any time and can sell it on the same day

public class pivotIndexSolution {
    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 6, 5, 6 };

        int ans = pivotIndex(arr);
        System.out.println(ans);

    }

    public static int pivotIndex(int[] arr) {

        int leftSum = 0;
        int rightSum = 0;
        int totalSum = totalSum(arr);

        for (int i = 0; i < arr.length; i++) {
            leftSum = leftSum + arr[i];
            rightSum = totalSum - leftSum + arr[i];
            if (rightSum == leftSum) {
                return i;
            }
        }
        return -1;
    }

    static int totalSum(int[] arr) {
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {

            totalSum = totalSum + arr[i];

        }
        return totalSum;
    }
}