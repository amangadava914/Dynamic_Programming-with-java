
/* Problem Statement
Given an array of ‘N’  positive integers, we need to return the maximum sum of the subsequence such that
 no two elements of the subsequence are adjacent elements in the array.

Note: A subsequence of an array is a list with elements of the array where some elements are deleted
( or not deleted at all) and the elements should be in the same order in the subsequence as in the array.
 */

import java.util.*;

/* ****************************************** Using Memoization *************************************** */
/*
public class MaximumSum {
    public static void main(String[] args) {
        // Input array with elements.
        int[] arr = {2, 1, 4, 9};
        // Get the length of the array.
        int n = arr.length;

        // Call the solve function to find the maximum possible sum.
        int result = Memoization(n, arr);
        System.out.print("The Maximum Sum of Non-adjacent Element is : " + result);
    }

    // This function initializes the dp array and calls the recursive solver
    static int Memoization(int n, int[] arr){
        int[] memo = new int[n];

        // Initialize the dp array with -1 to indicate that values are not calculated yet.
        Arrays.fill(memo, -1);

        // Call the recursive solver for the last index (n-1).
        return solveMemo(n - 1, arr, memo);
    }

    // This function recursively calculates the maximum possible sum
    // by considering or not considering the current element.
    static int solveMemo(int index, int[] arr, int[] memo){
        // If the index is negative, there are no elements left to consider.
        if (index < 0){
            return 0;
        }

        // If the index is 0, there is only one element to consider, so return its value.
        if (index == 0){
            return arr[index];
        }

        // If we have already calculated the result for this index, return it.
        if (memo[index] != -1){
            return memo[index];
        }

        // Calculate the maximum sum by either picking the current element or not picking it.
        int pick = arr[index] + solveMemo(index - 2, arr, memo); // Non-adjacent element
        int nonPick = 0 + solveMemo(index - 1, arr, memo);

        return memo[index] = Math.max(pick, nonPick);
    }
}
*/

/* ****************************************** Using Tabulation ****************************************** */
public class MaximumSum {
    static int solveUtil(int n, int[] arr, int[] dp) {
        // Initialize the dp array with the first element of the input array.
        dp[0] = arr[0];

        // Iterate through the input array to fill the dp array.
        for (int i = 1; i < n; i++) {
            // Calculate the maximum sum by either picking the current element or not picking it.
            int pick = arr[i];

            // If there are at least two elements before the current element, add the value from dp[i-2].
            if (i > 1)
                pick += dp[i - 2];

            // The non-pick option is to use the maximum sum from the previous element.
            int nonPick = dp[i - 1];

            // Store the maximum of the two options in the dp array for the current index.
            dp[i] = Math.max(pick, nonPick);
        }

        // The final element of the dp array contains the maximum possible sum.
        return dp[n - 1];
    }

    // This function initializes the dp array and calls the solver function.
    static int solve(int n, int[] arr) {
        int[] dp = new int[n];

        // Initialize the dp array with -1 to indicate that values are not calculated yet.
        Arrays.fill(dp, -1);

        // Call the solver function to find the maximum possible sum.
        return solveUtil(n, arr, dp);
    }

    public static void main(String args[]) {
        // Input array with elements.
        int arr[] = {2, 1, 4, 9};

        // Get the length of the array.
        int n = arr.length;

        // Call the solve function to find the maximum possible sum.
        int result = solve(n, arr);

        // Print the result.
        System.out.println("The Maximum Sum of Non Adjacent Element is : " + result);
    }
}




/* ************************* Using Space Optimization ********************************************* */
/*
public class MaximumSum {
    static int solve(int n, int[] arr) {
        // Initialize variables to keep track of the maximum sums at the current and previous positions.
        int prev = arr[0];
        int prev2 = 0;

        // Iterate through the array starting from the second element.
        for (int i = 1; i < n; i++) {
            // Calculate the maximum sum by either picking the current element or not picking it.
            int pick = arr[i];

            // If there are at least two elements before the current element, add the value from prev2.
            if (i > 1)
                pick += prev2;

            // The non-pick option is to use the maximum sum from the previous position.
            int nonPick = prev;

            // Calculate the maximum sum for the current position and update prev and prev2.
            int cur_i = Math.max(pick, nonPick);
            prev2 = prev;
            prev = cur_i;
        }

        // The 'prev' variable now holds the maximum possible sum.
        return prev;
    }

    public static void main(String args[]) {
        // Input array with elements.
        int arr[] = {2, 1, 4, 9};

        // Get the length of the array.
        int n = arr.length;

        // Call the solve function to find the maximum possible sum.
        int result = solve(n, arr);

        // Print the result.
        System.out.println(result);
    }
}
*/