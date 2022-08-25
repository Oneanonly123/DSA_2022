package BinarySearch;

public class FirstLastPosition {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int ans[] = { -1, -1 };
        // check for the first occurence

        // int start = firstlastposition(nums, target, true);
        // int end = firstlastposition(nums, target, false);

        ans[0] = firstlastposition(nums, target, true);

        if (ans[0] != -1) {
            ans[1] = firstlastposition(nums, target, true);
        }

        return ans;

    }

    static int firstlastposition(int[] nums, int target, boolean findSearch) {

        // check for the first occurence

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findSearch) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}