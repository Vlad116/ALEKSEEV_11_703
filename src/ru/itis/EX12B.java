package ru.itis;

import java.util.Scanner;

public class EX12B {
    public static void main(String[]args) {
        System.out.println("Введите числа x и eps: ");
        int x, k = 1, ft = 1, t = 1;
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        x = in.nextInt();
        double eps = sc.nextDouble();
        if (in.hasNextInt()) {
            double S = x;
            int p = -1;
            int st = 1;
            while (Math.abs(t) > eps) {
                S += t;
                t *= (1.0 * (st * x * x)) / ((ft * (2 * k + 1)) * p);
                p = -p;
                k++;
            }
            System.out.println(S);
        }
    }
}