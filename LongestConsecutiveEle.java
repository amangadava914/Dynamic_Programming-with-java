import java.util.*;

public class LongestConsecutiveEle {
        public static int longestSuccessiveElements(int[] arr) {
            int n = arr.length;
            if (n == 0){
                return 0;
            }

            int longest = 1;
            HashSet<Integer> set = new HashSet<>();

            for(int i = 0; i < n; i++) { // put all the array elements into set
                set.add(arr[i]);
            }
            // Find the longest sequence
            for (int iterate: set) {
                if(!set.contains(iterate - 1)) {
                    int count = 1;
                    int x = iterate;
                    while (set.contains(x + 1)) {
                        x = x + 1;
                        count++;
                    }
                    longest = Math.max(longest, count);
                }
            }
            return longest;
        }

        public static void main(String[] args) {
            int[] arr = {100, 200, 1, 2, 3, 4};
            int ans = longestSuccessiveElements(arr);
            System.out.println("The longest consecutive sequence is : " + ans);
        }
}
