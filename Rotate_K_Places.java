import java.util.*;
public class Rotate_K_Places {

    // Brute force approach
    public static void RotateToRight(int[] arr, int n, int k) {
            if (n == 0)
                return;
            k = k % n;
            if (k > n)
                return;
            int[] temp = new int[k];
            for (int i = n - k; i < n; i++) {
                temp[i - n + k] = arr[i];
                System.out.println(temp[i - n + k]);
            }
            for (int i = n - k - 1; i >= 0; i--) {
                arr[i + k] = arr[i];
                System.out.println(arr[i + k]);
            }
            for (int i = 0; i < k; i++) {
                arr[i] = temp[i];
            }
        }
        public static void main(String args[]) {
            int n = 7;
            int[] arr = {1,2,3,4,5,6,7};
            int k = 2;
            RotateToRight(arr, n, k);
            System.out.println("After Rotating the elements to right ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
}


// Optimal approach
/*
import java.util.*;
public class Rotate_K_Places {
  // Function to Reverse the array
  public static void Reverse(int[] arr, int start, int end) {
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
  // Function to Rotate k elements to left
  public static void RotateToLeft(int[] arr, int n, int k) {
    // Reverse first k elements
    Reverse(arr, 0, k - 1);
    // Reverse last n-k elements
    Reverse(arr, k , n - 1);
    // Reverse whole array
    Reverse(arr, 0, n - 1);
  }
  public static void main(String args[]) {
    int[] arr = {1,2,3,4,5,6,7};
    int n = 7;
    int k = 2;
    RotateToLeft(arr, n, k);
    System.out.print("After Rotating the k elements to left ");
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
}
 */