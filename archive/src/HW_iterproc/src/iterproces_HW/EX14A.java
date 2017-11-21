package HW_iterproc.src.iterproces_HW;

import java.util.Scanner;

public class EX14A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение x ");
        double x = in.nextDouble();
        System.out.println("Введите значение eps ");
        double eps = in.nextDouble();
        int k = 1, p = -1;
        double t = 1, S = 0;
        while (t >= eps) {
            S += t * p * (Math.sin(t * x) * Math.sin(t * x));
            k++;
            t *= 1.0 / k;
            p = -p;
        }
        System.out.println(S);
    }
}

