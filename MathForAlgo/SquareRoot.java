package MathForAlgo;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 40;
        // int p = 3;
        // System.out.println(sqrt(n, p));
        System.out.println(NewtonRapson(n));
    }

    // TIME COMPLEXITY = O(LogN);

    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;

        double root = 0.0;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if ((mid * mid) > n) {
                e = mid - 1;
            } else if (mid * mid < n) {
                s = mid + 1;
            } else {
                return mid;
            }
        }

        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr = incr / 10;
        }

        return root;

    }

    // // Newton Rapson Method

    static double NewtonRapson(double n) {
        double x = n;
        double root;

        while (true) {
            root = 0.5 * (x + n / x);

            if (Math.abs(root - x) < 0.5) {
                break;
            }

            x = root;
        }

        return root;
    }

}
