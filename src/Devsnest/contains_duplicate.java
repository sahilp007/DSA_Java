package Devsnest;

import java.util.HashMap;

public class contains_duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2};
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int j : arr) {
            if (count.containsKey(j)) {
                System.out.println("Found"+j);
//                return 1;
                break;
            } else {
                count.put(j, 1);
            }
        }
    }
}
