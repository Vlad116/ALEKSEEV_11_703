package StringEX;

import java.util.Scanner;

public class EX227 {
    private static String makeEqualByLength(String str1, String str2) {
        /*  Этот метод делает строки равными по длине для удобства счёта (добавляет 0 переде числом) */
        int Difference = Math.abs(str1.length() - str2.length());
        if (str1.length() > str2.length()) {
            for (int i = 0; i < Difference; i++) {
                str2 = "0" + str2;
            }
            return str2;
        } else {
            for (int i = 0; i < Difference; i++) {
                str1 = "0" + str1;
            }
            return str1;
        }
    }

       public static String Summ(String str1, String str2) {
        /* Сложение очень больших чисел*/
        String FirstMemory = str1;
        String second = makeEqualByLength(str1, str2);  // Выравниваем длину чисел
        StringBuilder amount = new StringBuilder(); // строка для сохранения результата вычисления
        byte OneInTheMind = 0; //  выделим переменную для "единицы в уме"
        for (int i = str1.length() - 1; i >= 0; i--) {
            int sum = Character.getNumericValue(str1.charAt(i)) + Character.getNumericValue(second.charAt(i)) + OneInTheMind;
            OneInTheMind = 0;
            if (sum <= 9) {
                amount.insert(0, sum);
            } else {
                sum -= 10;
                OneInTheMind = 1;
                amount.insert(0, sum);
            }
        }
        if (OneInTheMind != 0) {
            amount.insert(0, OneInTheMind);
        }

        str1 = amount.toString();
        return str1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        makeEqualByLength(str1, str2);
        String sum = Summ(str1, str2);
        System.out.println("Сумма чисел равна: " +'\n' + sum);
    }
}