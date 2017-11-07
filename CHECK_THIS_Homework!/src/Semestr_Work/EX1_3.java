package Semestr_Work;

import java.util.Scanner;

// а к з з
public class EX1_3 {
    public static void main(String[] args) {
        System.out.println("Введите n,eps,a[0],b[0] : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), j;
        double eps = sc.nextDouble(), F;
        double[] A = new double[n];
        double[] B = new double[n];
        A[0] = sc.nextDouble();
        B[0] = sc.nextDouble();
        boolean f = false;
        for (int i = 1; i < n; i++) {
            A[i] = (1 - A[i - 1] / 1 + B[i - 1] * B[i - 1]) * Math.sin(A[i - 1] * A[i - 1] + A[i - 1] * B[i - 1] + 2);
            B[i] = 0.8 + 2 * Math.sin(B[i - 1]) - 5.5 * Math.sin(A[i - 1]) * Math.sin(A[i - 1]);
        }
        for (j = 1; j < n - 1; j++) {
            for (int i = 1; i < n - 1 && !f; i++) {
                F = A[j] * A[j] - B[i] * B[i];
                if (F < eps) {
                    f = true;
                }
            }
            if (f) {
                System.out.println(A[j]);
                f = false;
            }
        }
    }
}