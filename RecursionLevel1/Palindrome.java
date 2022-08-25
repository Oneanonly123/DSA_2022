package RecursionLevel1;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(111));
    }

    static int revOfDigit2(int n) {
        int digit = (int) (Math.log10(n)) + 1;
        return helper(n, digit);
    }

    private static int helper(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digit - 1)) + helper(n / 10, digit - 1);
    }

    static boolean isPalindrome(int n) {
        return n == revOfDigit2(n);
    }
}
