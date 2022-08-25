package BackTracking;

import java.util.List;

import java.util.ArrayList;

// Col Wise
public class NQueenCol {

    static void helper(char[][] board, List<List<String>> allBoards, int col) {
        // base condition

        if (col == board.length) {

            saveBoard(board, allBoards);
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col) {
        // check for horizontal col
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // check for vertical
        for (int i = 0; i < board[0].length; col++) {
            if (board[col][i] == 'Q') {
                return false;
            }
        }

        // check for upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // check for upper right
        r = row;
        for (int c = col; c < board.length && r >= 0; c++, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // check for lower left
        r = row;
        for (int c = col; c >= 0 && r < board.length; c--, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // check for lower right
        r = row;
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";
        List<String> result = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row = row + 'Q';
                } else {
                    row = row + '.';
                }
                result.add(row);
            }
        }
        allBoards.add(result);
    }

    static List<List<String>> solveNQueen(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        System.out.println(solveNQueen(4));
    }
}
