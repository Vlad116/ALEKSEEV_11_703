package StringEX;

import java.util.Scanner;

public class EX34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        System.out.println(s);
        char max = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < max) {
                max = s.charAt(i);
            }
        }
        System.out.println(max);
    }
}