//Smallest letter greater than the target 
// letter should wrap around if target is not found

package BinarySearch;

public class SmallestLetter {

    public static void main(String[] args) {
        char[] arr = { 'a', 'c', 'e', 'j' };
        char target = 'j';
        char ans = nextGreatestLetter(arr, target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        //
        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds
            // the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}