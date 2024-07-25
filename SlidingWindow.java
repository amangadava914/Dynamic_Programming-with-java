//public class SlidingWindow {
//    public static void main(String[] args) {
//        int[] arr = {2, 5, 1, 3, 10, 10};
//        int n = arr.length;
//        System.out.println("The maximum Sub-Array length is : " + maxSubArrayLength(arr, 14, n));
//    }
//
//    public static int maxSubArrayLength(int[] arr, int k, int n) {
//        int sum = 0;
//        int right = 0, left = 0;
//        int maxlen = 0;
//
//        while (right < n) {
//            sum += arr[right];
//
//            while (sum > k && left <= right) {
//                sum -= arr[left];
//                left++;
//            }
//
//            if (sum <= k) {
//                sum += arr[right];
//                maxlen = Math.max(maxlen, right - left + 1);
//                sum = sum - arr[left];
//                right++;
//            }
//        }
////        return sum;
//        return maxlen;
//    }
//}
// the TC of this code is O(n^2)

/* ********************************** Optimized Code with the TC is O(2n) ************************************** */
public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 10, 10};
        System.out.println(maxSubArrayLength(arr, 14));
    }

    public static int maxSubArrayLength(int[] arr, int k) {
        int sum = 0;
        int left = 0;
        int maxlen = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            // Shrink the window until the sum is less than or equal to k
            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            // Update the maximum length of subarray
            maxlen = Math.max(maxlen, right - left + 1);
        }

        return maxlen;
    }
}
