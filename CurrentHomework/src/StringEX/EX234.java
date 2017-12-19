package StringEX;

import java.util.Scanner;

public class EX234 {
    public static Scanner sc = new Scanner(System.in);

    public static boolean CorectForm(String string) {
        boolean f = true;
        char[] CorectSymbols = {'0', '1'};
        for (int i = 0; i < string.length() && f; i++) {
            if (string.charAt(i) == CorectSymbols[0] || string.charAt(i) == CorectSymbols[1]) {
                f = true;
            } else {
                f = false;
            }
        }
        if (f) {
            System.out.println("Число коректно введено в двоичной системе исчесления.");
            System.out.println("В двоичной системе исчесления: " + string);
            System.out.println("В десятичной системе исчесления: " + FromBinaryToDecimal(string));
        } else {
            System.out.println("Число введено неверно, попробуйте ввести еще раз");
            string = sc.next();
            CorectForm(string);
        }
        return f;
    }

    public static int FromBinaryToDecimal(String number) {
        int n = 0, sum = 0, des = 1;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '1') {
                n = 0;
                des = 1;
                while (n < number.length() - (i + 1)) {
                    des *= 2;
                    n++;
                }
                sum += des;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = sc.nextLine();
        CorectForm(str);
    }
}
