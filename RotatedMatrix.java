//import java.util.*;
//
///*
//1, 2, 3
//4, 5, 6
//7, 8, 9
// */
//public class RotatedMatrix {
//        static int[][] rotate(int[][] matrix) {
//            int n = matrix.length;
//            int rotated[][] = new int[n][n];
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    rotated[j][n - i - 1] = matrix[i][j];
//                }
//            }
//            return rotated;
//        }
//
//        public static void main(String args[]) {
//            int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//            int rotated[][] = rotate(arr);
//            System.out.println("Rotated Image");
//            for (int i = 0; i < rotated.length; i++) {
//                for (int j = 0; j < rotated.length; j++) {
//                    System.out.print(rotated[i][j] + " ");
//                }
//                System.out.println();
//            }
//
//        }
//    }


public class RotatedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                          {1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}
        };
        Rotated(matrix);
        System.out.println("Rotated Image");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Rotated(int[][] matrix){
//        Step 1: Transpose the matrix. (transposing means changing columns to rows and rows to columns)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                /*
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
                 */
            }
        }

        // Step 2: Reverse each row of the matrix.
        for (int i = 0; i < matrix.length; i++) {
            // for (int j = 0; j < 1; j++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
        /*
        7, 4, 1
        8, 5, 2
        9, 6, 3
         */
    }
}
