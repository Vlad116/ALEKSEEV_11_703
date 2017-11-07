package The_iterative_process_HW;

import java.util.Scanner;

public class EX_20D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("введите значение n = ");
        int n = in.nextInt();
        System.out.println("введите значение коэфицентов a,b,c,d,e,f,g,h: ");
        int
                a = in.nextInt(),
                b = in.nextInt(),
                c = in.nextInt(),
                d = in.nextInt(),
                e = in.nextInt(),
                f = in.nextInt(),
                g = in.nextInt(),
                h = in.nextInt();
        double
                x0 = a, y0 = x0,
                x1 = b, y1 = x1,
                x2 = c, y2 = x2,
                x3 = d * x2 + e * y1 + f * x0,
                y3 = g * x2 + h * y1;

        for (int i = 3; i < n; i++) {
            x0 = x1;
            y0 = y1;
            x1 = x2;
            y1 = y2;
            x2 = x3;
            y2 = y3;
            x3 = d * x2 + e * y1 + f * x0;
            y3 = g * x2 + h * y1;
        }
        System.out.println("Xk = " + x3);
        System.out.println("Yk = " + y3);
    }
}
