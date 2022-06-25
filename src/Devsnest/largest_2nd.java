package Devsnest;

public class largest_2nd {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 8, 7, 8};
        int smax = 0;
        int max = 0;
        if (arr[0] > arr[1]) {
            max = arr[0];
            smax = arr[1];
        } else {
            max = arr[1];
            smax = arr[0];
        }
        for (int i = 2; i < 6; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (max!=arr[i] && arr[i] > smax) {
                smax=arr[i];

            }
        }
        System.out.println(smax + "," + max);
    }
}
