package ArrayRecursion;

import java.util.ArrayList;

public class FindIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 8, 10, 23, 24 };
        int target = 23;
        System.out.println(find(arr, target, 0));
        // findMultipleIndex(arr, target, 0);
        // System.out.println(result);

        // ArrayList<Integer> ans = findMultipleInd(arr, 23, 0);
        // System.out.println(ans);
        // System.out.println(findLastIndex(arr, target, arr.length - 1));
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            System.out.println(index);
            return false;
        }

        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    static int findLastIndex(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index - 1);
        }
    }

    // Find Multiple Occurence

    static ArrayList<Integer> result = new ArrayList<>();

    static void findMultipleIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            result.add(index);

        }
        findMultipleIndex(arr, target, index + 1);

    }

    // static ArrayList<Integer> findMultipleInde(int[] arr, int target, int index,
    // ArrayList<Integer> result) {

    // if (index == arr.length) {
    // return result;
    // }

    // if (arr[index] == target) {
    // result.add(index);

    // }
    // return findMultipleInde(arr, target, index + 1, result);

    // }

    // If do not want to pass list in the argument

    static ArrayList<Integer> findMultipleInd(int[] arr, int target, int index) {

        ArrayList<Integer> result = new ArrayList<>();

        if (index == arr.length) {
            return result;
        }

        // this will contain ans from above call only
        if (arr[index] == target) {
            result.add(index);

        }

        // ans from below call ... When function is coming out
        ArrayList<Integer> ansFromBelowCalls = findMultipleInd(arr, target, index + 1);

        result.addAll(ansFromBelowCalls);

        return result;
    }

}
