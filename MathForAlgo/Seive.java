package MathForAlgo;

// Print to find all the prime no till n
public class Seive {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        seive(n, primes);

    }

    static void seive(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    // true means number is not prime
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

// Time Complexity
// n/2 + n/3 +n/4 +......
// n(1/2 +1/3 +/////)
// Log(Log N)
// which is O(N * Log(Log N ))