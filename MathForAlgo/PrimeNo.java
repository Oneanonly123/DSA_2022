package MathForAlgo;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 40;

        // for (int i = 1; i <= n; i++) {
        System.out.println(primeNo(n));

    }

    static boolean primeNo(int n) {
        // int count = 0;
        // Good Approach

        // if (n <= 1) {
        // return false;
        // }

        // int c = 2;

        // while (c * c <= n) {
        // if (n % c == 0) {
        // return false;
        // }
        // c++;
        // }
        // return true;

        // bad approach as complexity is increasing

        for (int i = 2; i < n; i++) {

            if ((n % i) == 0) {
                return false;
            }
        }
        return true;

    }
}
