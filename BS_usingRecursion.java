import java.util.Arrays;

public class BS_usingRecursion {
    public static void main(String[] args) {
        int[] arr = {115,655,13,15,483,12,48,443,61646,6,31,1,4,3216,644};
        bubbleSorting(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSorting(int[] arr, int row, int col) {
        if (row == 0){
            return;
        }
            if (row > col){
                if (arr[col] > arr[col + 1]){
                    int temp = arr[col];
                    arr[col] = arr[col + 1];
                    arr[col + 1] = temp;
                }
                bubbleSorting(arr, row, col+1);
            }
            else {
                bubbleSorting(arr, row - 1, 0);
            }
    }
}
