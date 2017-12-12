package StringEX;

import java.util.Scanner;

public class EX52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();// Пример: s1 = blackcat,s2 = cat , s2 cодержиться в s1
        String s2 = sc.next();
        boolean f = false;
        for (int i = 0; i < s1.length(); i++) {
            int coincidence = 0;
            if (s1.charAt(i) == s2.charAt(0)) {
                coincidence = 1;
                for (int j = 1; j < s2.length(); j++) {
                    if (s1.charAt(i + j) != s2.charAt(j)) {
                        break;
                    }
                    coincidence++;
                }
            }
            if (coincidence == s2.length()) {
                f = true;
            }
        }
        if (f)
            System.out.println("Строка s2 содержиться в s1");
        else
            System.out.println("Строка s2 не содержиться в s1");
    }
}

