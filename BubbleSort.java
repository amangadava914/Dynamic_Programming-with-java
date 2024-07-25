import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {115,655,13,15,483,12,48,443,61646,6,31,1,4,3216,644};
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSorting(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
