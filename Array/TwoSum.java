// Array Problem 

package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 4, 5, 10, 12, 100, 130, 140, 160, 170 };
        int target = 22;
        System.out.println(twoSum(nums, target));
    }

    // Brute Force Approach
    // public static int[] twoSum(int[] nums, int target) {

    // /**
    // * @param nums
    // * @param target
    // * @return
    // * //
    // */
    // public static int[] twosum(int[] nums, int target) {
    // int n = nums.length;
    // int ans[] = new int[2];

    // for (int i = 0; i < n; i++) {
    // for (int j = i + 1; j < n; j++) {
    // if (nums[i] + nums[j] == target) {
    // ans[0] = i;
    // ans[1] = j;
    // }
    // }
    // }
    // return ans;
    // }

    // Good Approach

    public static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];

        // int[] nums = { 2, 4, 5, 10, 12, 100, 130, 140, 160, 170 };
        // int target = 22;
        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(target - nums[i])) {
                ans[0] = hash.get(target - nums[i]);
                ans[1] = i;
                return ans;
            }
            hash.put(nums[i], i);
        }
        return ans;
    }

}