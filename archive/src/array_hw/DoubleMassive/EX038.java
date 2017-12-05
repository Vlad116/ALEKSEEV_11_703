package array_hw.DoubleMassive;

import java.util.Random;
import java.util.Scanner;

public class EX038 {
    public static void main(String[] args) {
    /*    System.out.print("Введите матрицу n x n: ");

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        double eps = 0.001;

        int n = sc.nextInt();
        int[][] l = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                l[i][j] = r.nextInt(10);
            }
        }
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(l[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Треугольная матрица : ");
        l = gaussMethod(n, l, eps);

        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l.length; j++) {
                System.out.print(l[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] gaussMethod(int n, int[][] a, double eps) {
        int i, j, k, l;
        double r;
        int m = n;

        i = 0;
        j = 0;
        l = 0;
        while (i < m && j < n) {
            r = 0;
            for (k = i; k < m - 1; k++) {
                if (Math.abs(a[k][j]) > r) {
                    l = k;      // Запомним номер строки
                    r = Math.abs(a[k][j]); // макс. эл-т
                }
            }
            if (r <= eps) {
                for (k = i; k < m; k++) {
                    a[k][j] = 0;
                }
                j++;
                continue;
            }

            if (l != i) {
                for (k = j; k < n; k++) {
                    r = a[i][k];
                    a[i][k] = a[l][k];
                    a[l][k] = (int) ((-1) * r);
                }
            }
            for (k = i + 1; k < m; k++) {
                r = (-1 * a[k][j] / a[i][j]);
                a[k][j] = 0;
                for (l = j + 1; l < n; ++l) {
                    a[k][l] += r * a[i][l];
                }
            }
            i++;
            j++;
        }
        return a;*/
    }
}