package ru.itis;

import java.util.Scanner;

public class EX12G {
    public static void main (String[]args){
        System.out.println("Введите числа x и eps: ");// почти такой же как б , если получиться б то этот тоже...
        int k = 1, ft = 1, t = 1;
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int x = in.nextInt();
        double eps = sc.nextDouble();
        if (in.hasNextInt() & sc.hasNextDouble()) {
            double S = x;
            int p = -1;
            int st = 1;
            /* переделаю while (Math.abs(t) > eps) {
                S += t;
                t *= (1.0 * (st * x * x)) / ((ft * (2 * k)) * p);
                p = -p;
                k++;
            }*/
            System.out.println(S);
        }
    }
}

