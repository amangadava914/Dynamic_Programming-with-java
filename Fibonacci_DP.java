import java.util.*;

public class Fibonacci_DP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the integer value : ");
        int n = in.nextInt();
//        for(int i = 0; i < n; i++) {
//            System.out.print(fibo(i) + " "); // prints the fibonacci series
//        }

        // using memoization
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);  // [-1, -1, -1, -1, -1, -1,........n+1]
        System.out.println(fiboUsingMemoization(n - 1, dp) + fiboUsingMemoization(n - 2, dp));
    }

    /*
     0 1 1 2 3 5 8 13 21 34 ..............................
     Using Recursion the Time and Space complexity of the program is :-
     Time Complexity: O(2N)
     Auxiliary Space: O(n)
    */
    static int fibo(int n){
        // Base Case
        if (n <= 1){
            return n;
        }

        // Recursive call
        return fibo(n - 1) + fibo(n - 2);
    }


    /* ************* Fibonacci series using memoization ************** */
    static int fiboUsingMemoization(int n, int[] dp){
        // Base Condition
        if (n <= 1){
            return n;
        }

        if (dp[n] != -1){
            return dp[n];
        }

        return fiboUsingMemoization(n - 1, dp) + fiboUsingMemoization(n - 2, dp);
    }
}
