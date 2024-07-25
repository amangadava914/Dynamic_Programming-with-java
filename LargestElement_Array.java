import java.util.Scanner;
import java.util.Arrays;

public class LargestElement_Array {

    // Brute force approach to find a largest element of the array
    public static int LargestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    // Optimal approach to find a largest element of the array
    public static int LargestElement2 (int[] arr){
return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println(LargestElement(arr));
        System.out.println(LargestElement2(arr));
    }
}
