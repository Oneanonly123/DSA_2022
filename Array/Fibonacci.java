package Array;

// To find the majority element and it always exist

public class Fibonacci {
    public static void main(String[] args) {
        // int n = 2;
        int ans = fibonacci(9);
        System.out.println(ans);
    }

    // returning the index of fibonacci series element index

    static int fibonacciIndex(int n) {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        int a = 1, b = 1, c = 0;

        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // to print the fibonaci series

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

}