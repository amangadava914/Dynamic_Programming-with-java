//public class CountDigit {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            count++;
//        }
//        System.out.println("The Number of Digits in Array is : " + count);
//    }
//}


//public class CountDigit {
//    public static void main(String[] args) {
//        int n = 123456789;
//        int count = 0;
//        while (n > 0) {
//            count += 1;
//            // Divide 'n' by 10 to
//            // remove the last digit.
//            n = n / 10; //Update N by removing its last digit by performing a modulo 10 (%10) operation on it.
//        }
//        // Return the
//        // count of digits
//        System.out.println("The Number of Digits is : " + count);
//    }
//}

public class CountDigit {
    /*
    Step 1: Initialise a variable to store the count of digits of the number.
    Step 2: The count of digits can be calculated using log10 N + 1.
            log10 N operation gives the logarithmic base 10 of which returns the power to which 10 must
            be raised to, to be equal to N. We add 1 to the result which accounts for the possibility that
            N itself is a power of 10. Financially cast the result to an integer to ensure that it is rounded
            down to the nearest whole number.
    Step 3: Return the value of count which represents the count of digits in the input integer N
     */
    public static void main(String[] args) {
        int n = 123456789;
        int count = (int) (Math.log10(n) + 1);
        System.out.println("The Number of Digits is : " + count);
    }
}
