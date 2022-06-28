package Devsnest;

import java.util.ArrayList;

public class Devsnest_pattern {
    public static void main(String[] args) {
        int N = 81;
        int n = (N / 3 - 1) / 2;//lines
        int c = 1;
        ArrayList<String> Ans = new ArrayList<String>();
        String temp = "";
        for (int i = 0; i < n; i++) {
            c = i * 2 + 1;
            for (int j = 0; j < (N - 3 * c) / 2; j++) {
                temp += "-";
            }
            for (int j = 0; j < c; j++) {
                temp += ".|.";
            }
            for (int j = 0; j < (N - 3 * c) / 2; j++) {
                temp += "-";
            }
            Ans.add(temp);
            temp = "";
        }
        for (int i = 0; i < N - 9; i++) {
            temp += "-";
            if (i == (N - 1 - 9) / 2) {
                temp += "DEVSNEST!";
            }
        }
        Ans.add(temp);
        temp = "";
        for (int i = n - 1; i >= 0; i--) {
            c = i * 2 + 1;
            for (int j = 0; j < (N - 3 * c) / 2; j++) {
                temp += "-";
            }
            for (int j = 0; j < c; j++) {
                temp += ".|.";
            }
            for (int j = 0; j < (N - 3 * c) / 2; j++) {
                temp += "-";
            }
            Ans.add(temp);
            temp = "";
        }
        for(String s:Ans){
            System.out.println(s);
        }
//        return Ans.toArray(new String[Ans.size()]);
    }
}
