package iterproces_HW;

import java.util.Scanner;

public class EX23A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение x = ");
         double x = in.nextDouble();
        System.out.print("Введите значение границы a = ");
         int a = in.nextInt();
        System.out.print("Введите значение границы b = ");
         int b = in.nextInt();
         int v1 = a, v0 = v1;
         int v2 = v0 + v1;
         double s = Math.log10(v0 * x) + Math.log10(v1 * x);
        while (v2 <= b) {
            s  += Math.log10(v2 * x);
            v0 = v1;
            v1 = v2;
            v2 = v0 + v1;
        }
        System.out.println(s);
    }
}
