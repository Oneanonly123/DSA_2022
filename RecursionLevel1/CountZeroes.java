package RecursionLevel1;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(count(3120));
    }

    static int count(int n) {
        return helper(n, 0);
    }

    // When u want pass the value in recursion call, we use helper
    // function , as we pass the value in the form of argument

    static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, count + 1);
        }
        return helper(n / 10, count);

    }

}
