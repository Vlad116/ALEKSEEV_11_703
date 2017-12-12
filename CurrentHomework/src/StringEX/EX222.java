package StringEX;

import java.util.Scanner;

public class EX222 {
    public static boolean ItPalindrome(String word) {
        boolean f = true;
        for (int i = 0; i < word.length() / 2 && f; i++) {
            if (word.charAt(i) != word.charAt(word.length() - (i + 1))) {
                f = false;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String[] word = {s1, s2, s3};
        for (int i = 0; i < word.length; i++) {
            if (ItPalindrome(word[i])) {
                System.out.println((i + 1) + "-ое слово является полиндромом");
            }
        }
    }
}