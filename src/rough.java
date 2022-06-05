//https://leetcode.com/problems/add-to-array-form-of-integer/discuss/?currentPage=1&orderBy=most_votes&query=

//import java.util.ArrayList;
//import java.util.List;
//
//public class rough {
//    public static List<Integer> main(String[] args) {
//        int[] nums = {1, 2, 3};
//        List<Integer> ans = new ArrayList<>();
//        int k = 999;
//        int ns = 0;
//        for (int num : nums) {
//            ns = (ns * 10) + num;
//        }
//        ns = ns + k;
//        int s = (Integer.toString(ns)).length();
////        int[] ans = new int[s];
//        for (int i = 0; i < s; i++) {
//            ans[s - i - 1] = ns % 10;
//            ns = ns / 10;
//        }
//        for (int i : ans) {
//            System.out.print(i + ", ");
////        return ans;
//        }
//    }
//}

class rough{
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,1,2,3};
        int[] ans = new int[indices.length];
        for (int index : indices) {
            ans[indices[index]] = s.charAt(index);
        }
        String s1= "";
        for (int i = 0; i < s.length(); i++) {
            s1 += (char) ans[i];
        }
        System.out.println(s1);
    }
}