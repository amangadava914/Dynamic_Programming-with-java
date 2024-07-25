import java.util.*;



/* ************************************* Fibonacci series using Recursion ************************************ */
/*
     0 1 1 2 3 5 8 13 21 34 ..............................
     Using Recursion the Time and Space complexity of the program is :-
     Time Complexity: O(2N)
     Auxiliary Space: O(n)
    */
/*
public class Fibonacci_DP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the integer value : ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " "); // prints the fibonacci series
        }
    }
    static int fibo(int n) {
        // Base Case
        if (n <= 1) {
            return n;
        }

        // Recursive call
        return fibo(n - 1) + fibo(n - 2);
    }
}
*/




/* ***************************** Fibonacci series using memoization or top-down approach *********************************** */
/*
    public class Fibonacci_DP {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the integer value : ");
            int n = in.nextInt();
            int[] dp = new int[n + 1];
            Arrays.fill(dp, -1);  // [-1, -1, -1, -1, -1, -1,........n+1]
            System.out.println(fiboUsingMemoization(n - 1, dp) + fiboUsingMemoization(n - 2, dp));
        }

        static int fiboUsingMemoization(int n, int[] dp)
        {
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

Time Complexity: O(N) :-
Reason: The overlapping sub-problem will return the answer in constant time O(1).
Therefore the total number of new subproblems we solve is ‘n’. Hence total time complexity is O(N).

Space Complexity: O(N) :-
Reason: We are using a recursion stack space(O(N)) and an array (again O(N)). Therefore total space
complexity will be O(N) + O(N) ≈ O(N)
*/



/* **************************** Fibonacci series using Tabulation or bottom-up approach **************************************** */
/*
public class Fibonacci_DP{
    public static void main(String[] args) {
        System.out.print("Enter the Integer value : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] tabu = new int[n + 1];
        Arrays.fill(tabu, -1);
        tabu[0] = 0;
        tabu[1] = 1;
        for (int i = 2; i <= n; i++) {
            tabu[i] = tabu[i - 1] + tabu[i - 2];
        }
        System.out.println("The fibonacci of index " + n + " is : " + tabu[n]);
    }
}
 */

/* **************************** Fibonacci series using Space Optimization *************************************** */
public class Fibonacci_DP{
    public static void main(String[] args) {
        System.out.print("Enter the Integer value : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int prev1 = 1;
        int prev2 = 0;
        for(int i = 2; i <= n; i++){
            int current_i = prev2 + prev1;
            prev2 = prev1;
            prev1 = current_i;
        }
        System.out.println("The fibonacci of index " + n + " is : " + prev1);
    }
}