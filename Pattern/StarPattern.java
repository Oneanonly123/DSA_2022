
package Pattern;

public class StarPattern {

    public static void main(String[] args) {
        pattern9(4);

    }

    // Hollow Butterfly Pattern

    static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {

                if (col == 1 || col == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            for (int space = 0; space < 2 * (n - row); space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        for (int row = n; row >= 1; row--) {

            for (int col = 1; col <= row; col++) {

                if (col == 1 || col == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int space = 0; space < 2 * (n - row); space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {

                if (col == 1 || col == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

    // Butterfly Pattern

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }

            for (int space = 0; space < 2 * (n - row); space++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int row = n; row >= 1; row--) {

            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }

            for (int space = 0; space < 2 * (n - row); space++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    // 1
    // 2 1 2
    // 3 2 1 2 3
    // 4 3 2 1 2 3 4
    // 3 2 1 2 3
    // 2 1 2
    // 1
    static void pattern7(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row : row;

            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    static void pattern5(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;

            for (int col = 1; col <= totalColsInRow; col++) {

                System.out.print("*");

            }

            // when 1 row is printed we want to print a new line
            System.out.println();

        }
    }

    // Diamond
    static void pattern6(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;

            int noOfSpace = n - totalColsInRow;
            for (int s = 0; s < noOfSpace; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInRow; col++) {

                System.out.print("* ");

            }

            // when 1 row is printed we want to print a new line
            System.out.println();

        }
    }

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {

                System.out.print(col);

            }

            // when 1 row is printed we want to print a new line
            System.out.println();

        }
    }

    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }

            // when 1 row is printed we want to print a new line
            System.out.println();
        }
    }

    // * * * * *
    // * * * * *
    // * * * * *

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }

            // when 1 row is printed we want to print a new line
            System.out.println();
        }
    }

    // *
    // * *
    // * * *
    // * * * *

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // when 1 row is printed we want to print a new line
            System.out.println();
        }
    }

}