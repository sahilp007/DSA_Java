package DSA_450;

import java.util.*;

public class Array1_Reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int n = sc.nextInt();
        System.out.println("Enter the Input Array");
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int len = arr.length;
        int swap;
        for (int i = 0; i < (len) / 2; i++) {
            swap = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = swap;
        }
        for (int k : arr) {
            System.out.print(k);

        }
    }
}
//import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//
//// Main class
//// BufferedReaderTest
//class GFG {
//
//    // Main driver method
//    public static void main(String[] args)
//            throws IOException
//    {
//
//        // Creating an object of BufferedReader class
//        BufferedReader bi = new BufferedReader(
//                new InputStreamReader(System.in));
//
//        // Custom integer array of size 10
//        int num[] = new int[10];
//        // Array of string type to store input
//        String[] strNums;
//
//        // Display message
//        System.out.println("enter string of numbers");
//
//        // Reading input a string
//        strNums = bi.readLine().split(" ");
//
//        for (int i = 0; i < strNums.length; i++) {
//            num[i] = Integer.parseInt(strNums[i]);
//        }
//
//        // Display message
//        System.out.println("printing stored numbers ");
//
//        // Printing the stored numbers using for loop
//        for (int i = 0; i < strNums.length; i++) {
//            System.out.println(num[i]);
//        }
//    }
//}