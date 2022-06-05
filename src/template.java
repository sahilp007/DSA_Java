import java.util.Scanner;

public class template {
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
        for (int k : arr) {
            System.out.print(k);
        }
    }
}


