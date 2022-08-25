package Bitwise;

// to find non repeating number in given array
public class NotRepeating {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 4, 4, 2, 6 };
        System.out.println(nonRepeating(arr));
    }

    static int nonRepeating(int[] arr) {
        int unique = 0;

        for (int n : arr) {

            unique ^= n;
        }

        return unique;
    }
}
