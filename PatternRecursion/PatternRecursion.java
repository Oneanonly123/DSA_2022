package PatternRecursion;

public class PatternRecursion {

    public static void main(String[] args) {
        pattern2(5, 0);
    }

    // Without Recursion
    // static void pattern(int n) {
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n - i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    static void pattern(int row, int col) {

        // Reverse Triangle
        if (row == 0) {
            return;
        }

        if (col < row) {
            System.out.print("*");
            pattern(row, col + 1);
        } else {
            System.out.println();
            pattern(row - 1, 0);
        }
    }

    static void pattern2(int row, int col) {

        // Reverse Triangle
        if (row == 0) {
            return;
        }

        if (col < row) {
            pattern2(row, col + 1);
            System.out.print("*");
        } else {
            pattern2(row - 1, 0);
            System.out.println();
        }
    }
}
