package DSA_450;

import java.util.Scanner;

public class Array2_Max_Min {
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
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < len; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max =" + max + ", Min =" + min);
    }

}

