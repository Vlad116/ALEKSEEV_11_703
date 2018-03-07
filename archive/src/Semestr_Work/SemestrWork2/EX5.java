package Semestr_Work.SemestrWork2;

import java.util.Scanner;

//5 а а
public class EX5 {
    public static void main(String[] args) {
        System.out.print("Введите значение n = ");// n = 10
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double x;
        boolean f = false;

        double[] Fxi = new double[n];
        int [] xi = new int[n];

        for (int i = 0; i < n; i++) {
            xi[i] = i;
            Fxi[i] = Function(xi[i]);
        }

        for (int i = 0; i < 3; i++) {// x1 = 1,5 x2 = 5,3 x3 = 8,2
            x = sc.nextDouble();
            for (int j = 0; j < n-1 && !f; j++) {
                if (x >= xi[j] && x < xi[j + 1]) {
                    f = true;
                    System.out.println(Fyi(x, xi[j], xi[j + 1]));
                }
            }
            f = false;
        }
    }

    private static double Fyi(double x, double x1, double x2) {
        return ((x - x2) / (x1 - x2)) * Function(x1) + ((x - x1) / (x2 - x1) * Function(x2));
    }

    private static double Function(double Xi) {
        double F = (1 / (1 + Xi * Xi)) * Math.sin(Xi * Xi + Xi + 1);
        return F;
    }
}