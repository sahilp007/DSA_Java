package LeetCode;

public class q75_012 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 1, 0, 0, 1};
        int lo = 0, mi = 0, hi = nums.length - 1;
        while (mi <= hi) {
            switch (nums[mi]) {
                case 0 -> {
                    int temp = nums[lo];
                    nums[lo] = nums[mi];
                    nums[mi] = temp;
                    lo++;
                    mi++;
                }
                case 1 -> {
                    mi++;
                }
                case 2 -> {
                    int temp = nums[hi];
                    nums[hi] = nums[mi];
                    nums[mi] = temp;
                    hi--;
                }
            }
        }
        for(int i:nums){
            System.out.print(i);
        }
    }
}
