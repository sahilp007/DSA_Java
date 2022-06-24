package Devsnest;

public class fibonacci {
    public static void main(String[] args) {

        int n = 6;
        int one = 1, two = 1, three = 2;
        if (n < 3) {
            three = 1;
        }
        for (int i = 3; i <= n; i++) {
            three = one + two;
            one = two;
            two = three;

        }
        System.out.println(three);
    }
}
