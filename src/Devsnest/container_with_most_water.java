package Devsnest;
//
//import java.util.Arrays;
//
//import static java.lang.Math.min;

public class container_with_most_water {
    public static void main(String[] args) {

        int[] arr = {1,2,1};
        int len = arr.length;
//        System.out.println(Arrays.toString(arr) + " " + len);
        int start = 0, end = len - 1;
        int water = 0;
        int maxWater = 0;
        for (int i = 0; i < len; i++) {
            if (start < end) {
                water = arr[start]<arr[end]? arr[start]*(end-start):arr[end]*(end-start);
            } else {
                break;
            }
            if (water > maxWater) {
                maxWater = water;
            }
            if (arr[start] < arr[end]) {
                start++;
            }
            else{
                end--;
            }
        }
        System.out.println(maxWater);
    }
}
