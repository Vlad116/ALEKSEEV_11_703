package Task038;

import java.util.Scanner;

//Gauss - Task038
public class Matrix {
    private int a[][], n;

    public void Read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n - размерность матрицы квадратной матрицы: ");
        n = sc.nextInt();
        a = new int[n][n];
        System.out.println("Ввод матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public void Gauss() {
        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                for (int k = 0; k < n; k++) {
                    a[i][k] = (a[i][k] * a[j][j]) - (a[j][k] * a[i][j]);
                    if (j != 0)
                        a[i][k] /= a[j][j];
                }
            }
        }
    }

    public void ShowMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}