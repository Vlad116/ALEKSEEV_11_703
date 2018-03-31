package Archive.ControlWork2.src;

import java.util.Scanner;

// Будем считать за букву символ латиницы
public class CW2 {
    public  static void ComparisonDigitsAndNumbers(String string) {
        string = string.replaceAll(" ", "");
        int Letters = 0;
        int Digits = 0;
        int Symbols = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                Letters++;
            } else if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                Letters++;
            } else if (string.charAt(i) >= '0' && string.charAt(i) <= '9') {
                Digits++;
            } else {
                Symbols++;
            }
        }
        if (Letters > Digits) {
            System.out.println("Букв в строке больше чем цифр!" + "\n" + "Букв: " + Letters + "\n" + "Цифр: " + Digits);
        } else if (Digits > Letters) {
            System.out.println("Цифр в строке больше чем букв!" + "\n" + "Букв: " + Letters + "\n" + "Цифр: " + Digits);
        } else {
            System.out.println("В строке равное кол-во букв и цифр!" + "\n" + "Букв: " + Letters + "\n" + "Цифр: " + Digits);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        ComparisonDigitsAndNumbers(string);
    }
}
