package Bitwise;

import java.util.ArrayList;
import java.util.List;

// Pascal Traingle
public class Pascals {
    public static void main(String[] args) {
        System.out.println(pascals(8));

    }

    static List<List<Integer>> pascals(int n) {

        List<List<Integer>> result = new ArrayList<>();

        if (n == 0)
            return new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int col = 0; col < i; col++) {

                if (col == 0 || col == i - 1) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 2).get(col) + result.get(i - 2).get(col - 1));
                }
            }
            result.add(row);
        }
        // when 1 row is printed we want to print a new line
        return result;
    }
}
