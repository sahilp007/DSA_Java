package LeetCode;

public class q287_duplicate_number_floyd {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 3};
        int slow =0, slow2 = 0, fast = 0;
        while (true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow==fast){
                break;
            }
        }
        while (slow != slow2){
            slow = nums[slow];
            slow2 = nums[slow2];
        }
        System.out.println(slow2);
    }
}
