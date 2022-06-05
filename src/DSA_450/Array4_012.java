package DSA_450;

import java.util.Scanner;

public class Array4_012 {
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
//        int zero = 0, one = 0, two = 0;
//        for (int i = 0; i < len; i++) {
//            if (arr[i] < 1) {
//                zero++;
//            } else if (arr[i] > 1) {
//                two++;
//            } else {
//                one++;
//            }
//        }
//        int ans[] = new int[len];
//        for (int i = 0; i < zero; i++) ans[i] = 0;
//        for (int i = zero; i < zero + one; i++) ans[i] = 1;
//        for (int i = zero + one; i < len; i++) ans[i] = 2;
        int lo = 0, hi = len - 1, mi = 0, itr = 0;
        while (!(mi > hi)) {
            itr++;
            switch (arr[mi]) {
                case 0 -> {
                    int t = arr[lo];
                    arr[lo] = arr[mi];
                    arr[mi] = t;
                    mi++;
                    lo++;
                }
                case 1 -> mi++;
                case 2 -> {
                    int t = arr[hi];
                    arr[hi] = arr[mi];
                    arr[mi] = t;
                    hi--;
                }

            }
        }

        for (int k : arr) System.out.print(k);
        System.out.println("\n Iterations = " + itr);

    }
}