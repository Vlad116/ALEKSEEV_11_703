package Semestr_Work;

import java.util.Scanner;

// к д к
public class EX1_2 {
    public static void main(String[] args) {
        System.out.println("Введите n,m,h,z[0],z[1] :  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),
                m = sc.nextInt();
        double[] z = new double[n];
        int[] f = new int[m];
        double h = sc.nextDouble(), zi;
        z[0] = sc.nextDouble();
        z[1] = sc.nextDouble();
        for (int i = 2; i < n; i++) {
            z[i] = 0.8 + 2 * Math.sin(z[0]) - 5.5 * Math.sin(z[1]) * Math.sin(z[1]);
        }
        for (int j = 1; j <= m; j++) {
            for (int i = 0; i < n; i++) {
                zi = (z[i] + 1.5) * (z[i] + 1.5);
                if ((zi < j * h) && (zi >= (j - 1) * h)) {
                    f[j - 1]++;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.print(f[i] + ", ");
        }
    }
}