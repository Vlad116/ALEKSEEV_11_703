package StringEX;

import java.util.Scanner;

public class EX38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        System.out.println(s);
        char max = s.charAt(0);
        boolean f = false;
        for (int i = 1; i < s.length() && !f; i++) {
            if ((s.charAt(i) % 2 == 0) || (s.charAt(i) % 3 == 0)) {
                f = true;
            }
        }
        System.out.println(f);
    }
}
