package JavaCollection;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 4, 5, 6, 7, 10 };
        int target = 3;
        int[] answ = twoSum(arr, target);
        System.out.println(answ);

    }

    public static int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(target - arr[i])) {
                ans[0] = hash.get(target - arr[i]);
                ans[1] = i;

                return ans;
            }
            hash.put(arr[i], i);
        }

        return ans;
    }

}