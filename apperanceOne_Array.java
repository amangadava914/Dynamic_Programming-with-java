public class apperanceOne_Array {
    public static void main(String[] args) {
        int[] array = {4, 1, 2, 1, 2};
        int n = array.length;
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ array[i];
        }
        System.out.println(xor);
    }
}

/*
Assume the given array is: [4,1,2,1,2]
XOR of all elements = 4^1^2^1^2
      = 4 ^ (1^1) ^ (2^2)
      = 4 ^ 0 ^ 0 = 4^0 = 4
Hence, 4 is the single element in the array.
 */