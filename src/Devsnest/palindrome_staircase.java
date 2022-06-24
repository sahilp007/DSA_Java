package Devsnest;

public class palindrome_staircase {
    public static void main(String[] args) {
        int n = 5;
        String[] arr = new String[n];
        String current = "";
        String currentE = "";
        int maini = 0;
        for (int i = 1; i <= n; i++) {
            current = current + Integer.toString(i);
            currentE = Integer.toString(i) + currentE;
            arr[maini] = current+currentE.substring(1);
            maini++;
        }
        for(String a: arr){
            System.out.println(a);
        }
    }
}
