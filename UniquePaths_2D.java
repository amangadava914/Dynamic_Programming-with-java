/*
Given two values M and N, which represent a matrix[M][N]. We need to find the total unique
paths from the top-left cell (matrix[0][0]) to the rightmost cell (matrix[M-1][N-1]).
At any cell we are allowed to move in only two directions:- bottom and right.
 */

import java.util.Arrays;

public class UniquePaths_2D {
    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        System.out.println(Memoization(m, n));
    }

    // Function to count the number of ways to reach cell (m-1, n-1)
    static int Memoization(int m, int n){
        // Create a 2D DP array to store the results
        int[][] memo = new int[m][n];

        // Initialize the DP array with -1 to indicate uncomputed values
        for(int[] row : memo){
            Arrays.fill(row, -1);
        }
        // Start the recursive calculation from the bottom-right cell (m-1, n-1)
        return CountWays(m - 1, n - 1, memo);
    }

    // Function to count the number of ways to reach cell (i, j)
    static int CountWays(int i, int j, int[][] memo){
        // base condition
        // If we reach the starting cell (0, 0), there's one way to reach it.
        if (i == 0 && j == 0){
            return 1;
        }

        // If we go out of bounds, there's no way to reach the cell.
        if (i < 0 || j < 0) {
            return 0;
        }

        // If the value for this cell is already computed, return it.
        if (memo[i][j] != -1) return memo[i][j];

        // Calculate the number of ways by moving up and moving left.
        int up = CountWays(i - 1, j, memo);
        int left = CountWays(i, j - 1, memo);

        // Store the result in the DP array and return it.
        return memo[i][j] = up + left;
    }
}

/*

import java.util.*;

class TUF {
    // Function to count the number of ways to reach cell (m, n)
    static int countWaysUtil(int m, int n, int[][] dp) {
        // Loop through each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Base condition: If we are at the top-left cell (0, 0), there's one way to reach it.
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue;
                }

                int up = 0;
                int left = 0;

                // Calculate the number of ways by moving up (if possible) and left (if possible)
                if (i > 0)
                    up = dp[i - 1][j];
                if (j > 0)
                    left = dp[i][j - 1];

                // Store the total number of ways to reach the current cell in the DP array
                dp[i][j] = up + left;
            }
        }

        // Return the number of ways to reach the bottom-right cell (m-1, n-1)
        return dp[m - 1][n - 1];
    }

    // Function to count the number of ways to reach cell (m, n)
    static int countWays(int m, int n) {
        // Create a 2D DP array to store the results
        int dp[][] = new int[m][n];

        // Initialize the DP array with -1 to indicate uncomputed values
        for (int[] row : dp)
            Arrays.fill(row, -1);

        // Call the countWaysUtil function to calculate and return the result
        return countWaysUtil(m, n, dp);
    }

    public static void main(String args[]) {
        int m = 3;
        int n = 2;

        // Call the countWays function and print the result
        System.out.println(countWays(m, n));
    }
}
 */

/*

import java.util.*;

class TUF {
    // Function to count the number of ways to reach cell (m, n)
    static int countWays(int m, int n) {
        // Create an array to store the results for the previous row
        int prev[] = new int[n];

        for (int i = 0; i < m; i++) {
            // Create a temporary array to store the results for the current row
            int temp[] = new int[n];

            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    // Base condition: There's one way to reach the top-left cell (0, 0)
                    temp[j] = 1;
                    continue;
                }

                int up = 0;
                int left = 0;

                // Calculate the number of ways by moving up (if possible) and left (if possible)
                if (i > 0)
                    up = prev[j];
                if (j > 0)
                    left = temp[j - 1];

                // Store the total number of ways to reach the current cell in the temporary array
                temp[j] = up + left;
            }

            // Set the temporary array as the previous array for the next row
            prev = temp;
        }

        // Return the number of ways to reach the bottom-right cell (m-1, n-1)
        return prev[n - 1];
    }

    public static void main(String args[]) {
        int m = 3;
        int n = 2;

        // Call the countWays function and print the result
        System.out.println(countWays(m, n));
    }
}
 */