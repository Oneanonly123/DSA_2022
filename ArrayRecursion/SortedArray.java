package ArrayRecursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 4, 5, 6 };
        System.out.println(sortedArray(arr, 0));
    }

    static boolean sortedArray(int[] arr, int index) {
        // base condition

        if (index == arr.length - 1) {
            return true;
        }

        return (arr[index] < arr[index + 1]) && sortedArray(arr, index + 1);

    }
}
