package Array;

// Find the max profit in buy and sell stock if can hold atmost
// one stock at any time and can sell it on the same day

public class BuySellStock2 {
    public static void main(String[] args) {
        int[] prices = { 1, 2, 3, 4, 5 };
        int ans = buysellstock(prices);
        System.out.println(ans);

    }

    static int buysellstock(int[] prices) {
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit = profit + (prices[i] - prices[i - 1]);
            }

        }
        return profit;
    }
}