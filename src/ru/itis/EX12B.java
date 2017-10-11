package ru.itis;

import java.util.Scanner;

public class EX12B {
    public static void main(String[]args) {
        System.out.println("Введите числа x и eps: ");
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int x = in.nextInt();
        double eps = sc.nextDouble();
        int k = 0, p = 1;
        double S = 0, t = x;
            while (Math.abs(t) > eps) {
                S += t * p;
                p = -p;
                k++;
                t *= (1.0 * x * x) / (2 * k * (2 * k + 1));
            }
            System.out.println(S);
    }
}