package Array;

// Array Problem 

// Best time to buy and sell stocks

public class BuySell {
    public static void main(String[] args) {
        int[] a = { 2, 4, 5, 10, 12, 100, 130, 140, 160, 180 };

        System.out.println(ans(a));
    }

    static int ans(int[] a) {

        int maxProfit = 0;
        int minsoFar = a[0];

        for (int i = 0; i < a.length; i++) {
            minsoFar = Math.min(minsoFar, a[i]);
            int profit = a[i] - minsoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}