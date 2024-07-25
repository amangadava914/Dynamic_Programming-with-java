///*
//The steps are the following:
//
//First, we will use two loops(nested loops) to traverse all the cells of the matrix.
//If any cell (i,j) contains the value 0, we will mark all cells in row i and column j with -1 except those which contain 0.
//We will perform step 2 for every cell containing 0.
//Finally, we will mark all the cells containing -1 with 0.
//Thus, the given matrix will be modified according to the question.
//
//Note: Here, we are assuming that the matrix does not contain any negative numbers. But if it contains negatives,
//we need to find some other ways to mark the cells instead of marking them with -1.
// */
//
//import java.util.ArrayList;
//import java.util.*;
//// Brute force solution with the time complexity is go till the n^3;
//public class SetMatrixZero {
//    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
//        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
//        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
//        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
//
//        int n = matrix.size();
//        int m = matrix.get(0).size();
//
//        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);
//
//        System.out.println("The Final matrix is: ");
//        for (ArrayList<Integer> row : ans) {
//            for (Integer ele : row) {
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }
//}
//
//    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
//        // Set -1 for rows and cols that contains 0. Don't mark any 0 as -1:
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (matrix.get(i).get(j) == 0){
//                    markRow(matrix, n, m, i);
//                    markCol(matrix, n, m, j);
//                }
//            }
//        }
//
//        // Finally, mark all -1 as 0:
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (matrix.get(i).get(j) == -1) {
//                    matrix.get(i).set(j, 0);
//                }
//            }
//        }
//        return matrix;
//    }
//
//    static void markRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i) {
//        // set all non-zero elements as -1 in the row i:
//        for (int j = 0; j < m; j++) {
//            if (matrix.get(i).get(j) != 0) {
//                matrix.get(i).set(j, -1);
//            }
//        }
//    }
//
//    static void markCol(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j) {
//        // set all non-zero elements as -1 in the col j:
//        for (int i = 0; i < n; i++) {
//            if (matrix.get(i).get(j) != 0) {
//                matrix.get(i).set(j, -1);
//            }
//        }
//    }
//}



// This is the better solution to find the zero matrix with the time complexity is go till the TC : 2(n * m)
// and space complexity is O(n) + O(m)

import java.util.ArrayList;
import java.util.Arrays;

class SetMatrixZero {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n , m);
//        System.out.println(ans);
        for (ArrayList<Integer> ele : ans) {
            for (int element : ele) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int[] row = new int[n];
        int[] col = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1){
                    matrix.get(i).set(j, 0);
                }
            }
        }

        return matrix;
    }
}