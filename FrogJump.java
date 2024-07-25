// Question
/*
https://takeuforward.org/data-structure/dynamic-programming-frog-jump-dp-3/

Given a number of stairs and a frog, the frog wants to climb from the 0th stair to the (N-1)th stair.
At a time the frog can climb either one or two steps. A height[N] array is also given. Whenever the
frog jumps from a stair i to stair j, the energy consumed in the jump is abs(height[i]- height[j]),
where abs() means the absolute difference. We need to return the minimum energy that can be used
 by the frog to jump from stair 0 to stair N-1.
 */


import java.util.*;

/* ***************************** Using Memoization or Top-Down Approach *************************** */
public class FrogJump {
    public static void main(String[] args){
        int height[]={30, 10, 60, 10, 60, 50};
        int n = height.length;
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        System.out.print("Minimum cost of Frog Jump is : " + func(n - 1, height, memo));
    }

    static int func(int index, int[] height, int[] memo){
        // Base case
        if (index == 0){
            return 0;
        }

        if (memo[index] != -1){
            return memo[index];
        }
        int jumpTwo = Integer.MAX_VALUE;
        int jumpOne = func(index - 1, height, memo) + Math.abs(height[index] - height[index - 1]);

        if (index > 1) jumpTwo = func(index - 2, height, memo) + Math.abs(height[index] - height[index - 2]);
        return memo[index] = Math.min(jumpOne, jumpTwo);
    }
}

/*
Time Complexity: O(N)
Reason: The overlapping subproblems will return the answer in constant time O(1). Therefore the total number of new subproblems we solve is ‘n’. Hence total time complexity is O(N).

Space Complexity: O(N)
Reason: We are using a recursion stack space(O(N)) and an array (again O(N)). Therefore total space complexity will be O(N) + O(N) ≈ O(N)
*/




/* **************************************** Using Tabulation *************************************************** */
/*
public class FrogJump {
    public static void main(String[] args) {
        int height[]={30, 10, 60, 10, 60, 50};
        int n = height.length;
        int[] tabu = new int[n];
        Arrays.fill(tabu, -1);
        tabu[0] = 0;
        for (int index = 1; index < n; index++) {
            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne = tabu[index - 1] + Math.abs(height[index] - height[index - 1]);
            if (index > 1){
                jumpTwo = tabu[index- 2] + Math.abs(height[index] - height[index - 2]);
            }
            tabu[index] = Math.min(jumpOne, jumpTwo);
        }
        System.out.print("Minimum cost : " + tabu[n - 1]);
    }
}
 */

/* *********************************** Using Space Optimization ****************************************** */
/*
public class FrogJump {
    public static void main(String[] args) {
        int height[]={30, 10, 60, 10, 60, 50};
        int n = height.length;
        int prev1 = 0;
        int prev2 = 0;
        for (int index = 1; index < n; index++) {
            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne = prev1 + Math.abs(height[index] - height[index - 1]);

            if (index > 1) jumpTwo = prev2 + Math.abs(height[index] - height[index - 2]);

            int current_i = Math.min(jumpOne, jumpTwo);
            prev2 = prev1;
            prev1 = current_i;
        }
        System.out.println("Minimum Cost : " + prev1);
    }
}
 */