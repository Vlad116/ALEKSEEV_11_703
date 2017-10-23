package iterproces_HW;

import java.util.Scanner;
public class EX28 {
    public static void main(String[] args) {
        System.out.print("Введите значение (0 < x < 2) x = ");
        Scanner in = new Scanner(System.in);
         double x = in.nextDouble();
        System.out.print("Введите значение eps = ");
         double eps = in.nextDouble();
         double a = x;
         double b = 1 - x;
        while (Math.abs(b) > eps) {
             a = a * (1.0 + b / 2.0);
             b = b * b * (3.0 + b);
            System.out.println("x ^ 1/2 = " + a);
        }
        System.out.println("x ^ 1/2 = " + a);
    }
}
