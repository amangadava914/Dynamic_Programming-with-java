import java.util.Arrays;

public class Missing_and_Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4, 5};
        System.out.println(Arrays.toString(setMismatch(arr)));
    }

    static int[] setMismatch(int[] arr){
        int n = arr.length;
        int duplicate = -1;
        int missing = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            if (count > 1) {
                duplicate = i;
            } else if (count == 0) {
                missing = i;
            }
        }
        return new int[] {duplicate, missing};
    }
}
