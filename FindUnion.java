import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindUnion {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> Union = findUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");
    }

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        HashSet<Integer> set1 = new HashSet<>();
        ArrayList<Integer> Union = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            set1.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            set1.add(arr2[i]);
        }
        for(int index: set1){
            Union.add(index);
        }
        return Union;
    }
}
