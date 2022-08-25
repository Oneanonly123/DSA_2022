package Bitwise;

// Pascal Traingle
public class PascalPattern {
    public static void main(String[] args) {
        // int n = 10;
        // System.out.println(nthRowSum(2));
    }

    static void pascalpattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            int col = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(col + " ");
                col = col * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    static int SumofAllRows(int n) {

        // Sum of all the row in a traingle
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + (1 << i);
        }

        return sum;
        // for (int i = 0; i < n; i++) {
        // for (int s = 1; s <= n - i; s++) {
        // System.out.print(" ");
        // }
        // int col = 1;
        // for (int j = 0; j <= i; j++) {
        // System.out.print(col + " ");
        // col = col * (i - j) / (j + 1);
        // }
        // System.out.println();
        // }

    }

    // static int nthRowSum(int n) {
    // int row = 1 << (n - 1);

    // return row = 1 * (int) (Math.pow(2, n - 1));

    // }

}