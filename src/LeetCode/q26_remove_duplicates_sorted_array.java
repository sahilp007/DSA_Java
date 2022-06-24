package LeetCode;

public class q26_remove_duplicates_sorted_array {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int end = nums.length;
        for (int i = 0; i < end - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                int t = nums[i + 1];
                nums[i + 1] = nums[i + 2];
                nums[i + 1] = t;
            }
        }
        for (int k : nums) System.out.print(k);
    }
}
