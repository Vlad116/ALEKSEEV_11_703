package ru.itis;

import java.util.Scanner;

public class Optim {
    public static void main(String[] args) {
        System.out.print("Введите значение v = ");// вводим значение в см^3 (0.2л = 200 cm^3, 0.5л = 500 cm^3, 1л = 1000 cm^3)
        Scanner in = new Scanner(System.in);
        double V = in.nextDouble();
        double st = 1/3.0;
        double r = Math.pow(( V / (Math.PI * 2.0)),st);
        double h = V / (Math.PI * r * r);
        System.out.println("радиус r = " + r);
        System.out.println("высота h = " + h);
    }
}

