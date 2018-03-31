package Archive.StringEX;

import java.util.Scanner;

// Проверка пароля на криптоостойкость №300
public class EX300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        System.out.println(CryptographicProtectionTest(password));
    }

    public static boolean CryptographicProtectionTest(String password) {
        boolean satisfies = true;
        int lowercase = 0;
        int UPPERCASE = 0;
        int digit = 0;
        if (password.length() >= 8 && password.length() <= 100) {
            for (int i = 0; satisfies && i < password.length(); i++) {
                //if ((Character.isLowerCase(password.charAt(i))) || (Character.isUpperCase(password.charAt(i))) || (Character.isDigit(password.charAt(i))) {
                if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                    lowercase++;
                } else if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                    UPPERCASE++;
                } else if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                    digit++;
                } else if (password.charAt(i) == ' ') {
                    System.out.println("You can not enter a space");
                    satisfies = false;
                } else {
                    System.out.println("Invalid character");
                    satisfies = false;
                }
            }
            if ((satisfies) && (lowercase > 0) && (UPPERCASE > 0) && (digit > 0)) {
                System.out.println("Crypto-resistant password!");
            } else if ((satisfies) && (lowercase == 0) && (UPPERCASE > 0) && (digit > 0)) {
                System.out.println("add a lowercase a-z");
                satisfies = false;
            } else if (((satisfies) && (lowercase > 0) && (UPPERCASE == 0) && (digit > 0))) {
                System.out.println("add a uppercase A-Z");
                satisfies = false;
            } else if (((satisfies) && (lowercase > 0) && (UPPERCASE > 0) && (digit == 0))) {
                System.out.println("add a digit 0-9");
                satisfies = false;
            }
        } else if (password.length() < 8) {
            System.out.println("too short password");
            satisfies = false;
        } else {
            System.out.println("password is too long");
            satisfies = false;
        }
        return satisfies;
    }
}