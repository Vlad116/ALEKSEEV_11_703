package iterproces_HW;//+

import java.util.Scanner;

public class EX23B {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Введите значение x = ");
           double x = in.nextDouble();
        System.out.print("Введите значение границы a = ");
              int a = in.nextInt();
        System.out.print("Введите значение границы b = ");
              int b = in.nextInt();
         int v1 = a, v0 = v1, p = 1,k = 2;
         int v2 = v0 + v1;
         double t = v2/4.0;
         double s = 0;
        while (v2 <= b) {
            s += t * p * Math.cos(v2 * x) * Math.cos(v2 * x);
            v0 = v1;
            v1 = v2;
            v2 = v0 + v1;
            t *= v2 / 2.0;
            p = -p;
        }
        System.out.println("s = " + s);
    }
}
