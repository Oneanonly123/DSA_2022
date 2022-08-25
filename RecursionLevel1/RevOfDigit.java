package RecursionLevel1;

public class RevOfDigit {
    public static void main(String[] args) {

        System.out.println(revOfDigit2(1133));
    }

    static int sum = 0;

    static void revOfDigit(int n) {
        if (n == 0) {
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        revOfDigit(n / 10);
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
}
