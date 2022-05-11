package DAA;

import java.util.*;

/**
 * Write a recursive program to find the solution of placing n queens on chess board so that no queen takes each other 
 * (backtracking)
 * 
 * time complexity = O(n^2)
 * 
 * Note : This is the most well-known algorithm for solving N-Queen problem. 
 * The time complexity is O(n^2) because we are selecting 
 * if we can put or not put a Queen at that place. The space is the board size times the result.
 */
public class assignment_6 {
    public static void p(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static boolean ch(int[][] a, int row, int col, int n) {
        int i, j;

        for (j = 0; j < col; j++) {
            if (a[row][j] == 1) {
                return false;
            }
        }

        for (i = row, j = col; i >= 0 && j >= 0; j--, i--) {
            if (a[i][j] == 1) {
                return false;
            }
        }

        for (i = row, j = col; i < n && j >= 0; i++, j--) {
            if (a[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean bt(int[][] a, int c, int n) {
        if (c >= n) {
            return true;
        }

        for (int i = 0; i < n; i++) {
            if (ch(a, i, c, n)) {
                a[i][c] = 1;

                if (bt(a, c + 1, n)) {
                    return true;
                }

                a[i][c] = 0;
            }

        }
        return false;
    }

    public static void nq(int n) {
        int a[][] = new int[n][n];

        if (!bt(a, 0, n)) {
            System.out.println("\nSoln Doesn't Exist!");
        }

        else {
            System.out.println("\nSoln is:");
            p(a, n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter #Queens:");
        int n = sc.nextInt();
        nq(n);
        sc.close();
    }
}
