package iterproces_HW;

import java.util.Scanner;
// не могу понять почему при некоторых значениях  программа безбожно циклит...
public class EX28 {
    public static void main(String[] args) {
        System.out.print("Введите значение (0 < x < 2) x = ");
        Scanner in = new Scanner(System.in);
         double x = in.nextDouble();
        System.out.print("Введите значение eps = ");
         double eps = in.nextDouble();
         double a0 = x;
         double b0 = 1 - x;
         double a1 = a0 * (1.0 + b0 / 2.0);
         double b1 = b0 * b0 * (3.0 + b0);
        while (b1 > eps) {
             a0 = a1;
             b0 = b1;
             a1 = a0 * (1.0 + b0 / 2.0);
             b1 = b0 * b0 * (3.0 + b0);
            System.out.println("x ^ 1/2 = " + a1);
        }
        System.out.println("x ^ 1/2 = " + a1);
    }
}
