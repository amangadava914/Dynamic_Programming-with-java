import java.util.Arrays;
import java.util.Scanner;

public class ProblemPractice {
    public static void main(String[] args) {

        // Fibonacci series using memoization
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print("Enter the Integer Value : ");
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        System.out.println("fibonacci of " + n + " is : " + fibonacciMemo(n, memo));
    }

    static int fibonacciMemo(int n, int[] memo) {
        // Base condition
        if (n <= 1) {
            return n;
        }

        if (memo[n] != -1) {
            return memo[n];
        }

        return fibonacciMemo(n - 1, memo) + fibonacciMemo(n - 2, memo);
    }
}
