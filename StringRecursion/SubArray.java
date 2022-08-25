package StringRecursion;

import java.util.ArrayList;
import java.util.List;

// Time Complexity - O(N * 2(pow(n)))

// Space Complexity - O(N * 2(pow(n)
public class SubArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(subArray(arr));
        List<List<Integer>> ans = subArray(arr);
        for (List<Integer> list : ans) {
            System.out.print(list);
        }
    }

    static List<List<Integer>> subArray(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();

            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;

    }
}
