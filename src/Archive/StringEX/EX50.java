package Archive.StringEX;

import java.util.Scanner;

public class EX50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean f = true;
        if (s1.length() != s2.length()) {
            f = false;
        }
        for (int i = 0; f && i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                f = false;
            }
        }
        System.out.println(f);
    }
}