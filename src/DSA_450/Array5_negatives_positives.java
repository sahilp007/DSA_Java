package DSA_450;

import java.util.Scanner;

public class Array5_negatives_positives {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int len = sc.nextInt();
        System.out.println("Enter the Input Array");
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int lo = 0, hi = len - 1, itr = 0;
        while (!(lo > hi)) {
            itr++;
            if (arr[lo] < 0)
                lo++;
            else {
                int t = arr[lo];
                arr[lo] = arr[hi];
                arr[hi] = t;
                hi--;
            }
        }

        for (int k : arr) System.out.print(k+" ");
        System.out.println("\n Iterations = " + itr);

    }
}
