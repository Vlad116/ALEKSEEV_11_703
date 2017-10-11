package ru.itis;

import java.util.Scanner;

public class EX12V {
    public static void main (String[]args) {
        System.out.println("Введите числа x(|x| < 1) и eps: ");
        double S = 0, t = 1, eps, x;
        int n = 1;
        Scanner in = new Scanner(System.in);
        Scanner ep = new Scanner(System.in);
        x = in.nextDouble();
        eps = ep.nextDouble();
        if (in.hasNextDouble() & ep.hasNextDouble() & (Math.abs(x) < 1)) {
            int p = 1;
            while (Math.abs(t) > eps) {
                S += t * p;
                p = -p;
                n++;
                x *= x;
                t *= x / n;
            }
            System.out.println(S);
        }
    }
}
