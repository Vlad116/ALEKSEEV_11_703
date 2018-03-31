package Archive.StringEX;

import java.util.Scanner;

public class EX52 {
    public static boolean Contains(String st1, String st2) {
        boolean f = false;
        for (int i = 0; i < st2.length() - st1.length() + 1 && !f; i++) {
            for (int k = 0; k < st1.length(); k++) {
                if (st1.charAt(k) != st2.charAt(k + i))
                    break;
                else if (k != 0 && st1.charAt(k) == st2.charAt(k + i))
                    f = true;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if (s2.length() < s1.length())
            System.out.println(Contains(s2, s1));
        else
            System.out.println(Contains(s1, s2));
    }
}