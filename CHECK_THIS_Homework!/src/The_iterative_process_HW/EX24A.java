package The_iterative_process_HW;

import java.util.Scanner;

public class EX24A {
    public static void main(String[] args) {
        System.out.print("Введите eps (eps > 0) = ");
        Scanner in = new Scanner(System.in);
        double eps = in.nextDouble();
        System.out.print("Введите x = ");
        double x = in.nextDouble();
        int n = 2;
        double S = 0, b0 = 1, c0 = 0,
                b1 = Math.cos(x),
                c1 = Math.sin(x),
                b = b0 * b1 - c0 * c1,
                c = c0 * b1 + b0 * c1,
                t = c1;
        while (Math.abs(t) >= eps) {
            S += t;
            c0 = c;
            b0 = b;
            b = b0 * b1 - c0 * c1;
            c = c0 * b1 + b0 * c1;
            n++;
            t *= c / (c0 * n);
        }
    System.out.print("Сумма ряда равна = " + S);
    }
}
