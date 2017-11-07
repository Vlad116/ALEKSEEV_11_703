package The_iterative_process_HW;

import java.util.Scanner;

public class EX24B {
    public static void main(String[] args) {
        System.out.print("Введите eps (eps > 0) = ");
        Scanner in = new Scanner(System.in);
        double eps = in.nextDouble();
        System.out.print("Введите x(0 <= x < Pi/2) = ");
        double x = in.nextDouble();
        int n = 2, p = -1;
        double  b0 = 1, c0 = 0,
                b1 = Math.cos(x),
                c1 = Math.sin(x),
                b = b0 * b1 - c0 * c1,
                c = c0 * b1 + b0 * c1,
                t = b1,
                S = t;
        while (Math.abs(t) >= eps) {
            if (n % 2 == 0){
                S += t * p;
                t = b / n;
            }
            c0 = c;
            b0 = b;
            b = b0 * b1 - c0 * c1;
            c = c0 * b1 + b0 * c1;
            n++;
            p = -p;
        }
        System.out.print("Сумма ряда равна = " + S);
    }
}
