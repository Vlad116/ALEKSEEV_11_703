package StringEX;

import java.util.Scanner;

public class EX35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), s1[] = s.split(" ");
        int min = s1[0].length();
        for (int i = 1; i < s1.length; i++) {
            if (s1[i].length() < min) {
                min = s1[i].length();
            }
        }
        System.out.println(min);
    }
}