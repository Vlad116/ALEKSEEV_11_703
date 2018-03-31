package Archive.HW_iterproc.src.iterproces_HW;

import java.util.Scanner;

public class EX27 {
    public static void main (String[]args) {
        System.out.print("Введите значение (0 < x < 2) x = ");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        System.out.print("Введите значение eps = ");
        double eps = in.nextDouble();
        double a0 = 1;
        double b0 = 1 - x;
        double a1 = a0 * (1.0 + b0);
        double b1 = b0 * b0;
        while (b1 > eps){
            a0 = a1;
            b0 = b1;
            a1 = a0 * (1.0 + b0);
            b1 = b0 * b0;
            System.out.println("1/x = " + a1);

        }
        System.out.println("1/x = " + a1);
    }
}