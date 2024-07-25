/*
Sort an array of 0s, 1s and 2s :-
Problem Statement: Given an array consisting of only 0s, 1s, and 2s. Write a program to
in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
 */

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0, 1};
        int n = arr.length;
        int c1 = 0, c2 = 0, c3 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0){
                c1++;
            }
            else if (arr[i] == 1){
                c2++;
            }
            else c3++;
        }

        for (int i = 0; i < c1; i++) {
            arr[i] = 0;
        }
        for (int i = c1; i < c1+c2; i++) {
            arr[i] = 1;
        }
        for (int i = c1+c2; i < n; i++) {
            arr[i] = 2;
        }
        System.out.println(Arrays.toString(arr)); // Brute Force approach
    }
}
