package Devsnest;

public class Devsnest_pattern {
    public static void main(String[] args) {
        int n = 3;
        int c = 1;
        for (int i = 0; i < n; i++) {
            c = i * 2 + 1;
            for (int j = 0; j < c; j++) {
                System.out.print(".|.");
            }
            System.out.println();
        }
    }
}
