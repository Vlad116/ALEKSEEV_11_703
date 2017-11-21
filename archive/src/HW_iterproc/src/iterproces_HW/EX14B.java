package HW_iterproc.src.iterproces_HW;//+

import java.util.Scanner;

public class EX14B {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Введите значение x = ");
         double x = in.nextDouble();
        System.out.print("Введите значение a = ");
         int a = in.nextInt();
        System.out.print("Введите значение eps = ");
         double eps = in.nextDouble();
         int k = 1;
         double t = 1.0 / a, S = 0;
        while (t >= eps) {
            S += t * Math.log10(t * x);
            k++;
            t *= 1.0 / a;
        }
        System.out.println(S);
    }
}
