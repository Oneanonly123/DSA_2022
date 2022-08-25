package BackTracking;

import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
        // System.out.println(mazeCount(3, 3));
        // mazePath("", 3, 3);
        // System.out.println(mazePathRet("", 3, 3));
        System.out.println(mazePathDiagonal("", 3, 3));
    }

    static int mazeCount(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = mazeCount(r - 1, c);
        int right = mazeCount(r, c - 1);

        return left + right;
    }

    static void mazePath(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            mazePath(p + 'D', r - 1, c);
        }

        if (c > 1) {
            mazePath(p + 'R', r, c - 1);
        }

    }

    static ArrayList<String> mazePathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        // Local list
        ArrayList<String> ans = new ArrayList<>();

        if (r > 1) {
            ans.addAll(mazePathRet(p + 'D', r - 1, c));
        }

        if (c > 1) {
            ans.addAll(mazePathRet(p + 'R', r, c - 1));
        }

        return ans;
    }

    // if Diagonal Path is also allowed
    static ArrayList<String> mazePathDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        // Local list
        ArrayList<String> ans = new ArrayList<>();

        if (r > 1 && c > 1) {
            ans.addAll(mazePathDiagonal(p + 'D', r - 1, c - 1));
        }

        if (r > 1) {
            ans.addAll(mazePathDiagonal(p + 'V', r - 1, c));
        }

        if (c > 1) {
            ans.addAll(mazePathDiagonal(p + 'H', r, c - 1));
        }

        return ans;
    }
}
