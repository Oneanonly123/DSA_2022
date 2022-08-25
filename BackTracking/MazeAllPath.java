package BackTracking;

// import java.util.ArrayList;
import java.util.Arrays;

public class MazeAllPath {
    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        // int[][] path = new int[board.length][board[0].length];
        mazeAllPath("", board, 0, 0);
        // System.out.println(mazeList("", 3, 3));
        // maze("", 3, 3);
    }

    // This Concept is known as BackTracking
    // Marking false ==1 need to be valid for the current calls
    // in the maze , while moving back we have to restore the original
    // value in order to allow the other right path

    // After the function is returned we need to mark it again as true
    static void mazeAllPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        if (r < maze.length - 1) {
            mazeAllPath(p + 'D', maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            mazeAllPath(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            mazeAllPath(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            mazeAllPath(p + 'L', maze, r, c - 1);
        }
        // At this point the function will be over
        // so before the function get removed also remove the changes
        // that were made by that function
        // remove the path history after it has done his work
        maze[r][c] = true;
    }

    static void mazeAllPathRet(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            mazeAllPathRet(p + 'D', maze, r + 1, c, path, step + 1);
        }

        if (c < maze[0].length - 1) {
            mazeAllPathRet(p + 'R', maze, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            mazeAllPathRet(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            mazeAllPathRet(p + 'L', maze, r, c - 1, path, step + 1);
        }
        // At this point the function will be over
        // so before the function get removed also remove the changes
        // that were made by that function
        // remove the path history after it has done his work
        maze[r][c] = true;
        path[r][c] = 0;

    }

}
