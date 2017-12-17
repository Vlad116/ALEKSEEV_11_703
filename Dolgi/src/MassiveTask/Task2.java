package MassiveTask;

import java.util.Scanner;

// Перемножение двух матриц
public class Task2 {
    private static int x, y, z, t;
    private static Scanner scanner = new Scanner(System.in);

    private static void MatrixSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кол-во столбцов N первой матрицы должно быть равно M кол-ву строк второй матрицы ");
        System.out.println("Введите размерность первой матрицы N x M: ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println("Введите размерность второй матрицы N x M: ");
        z = scanner.nextInt();
        t = scanner.nextInt();
    }

    private static int[][] ReadMatrix(int b, int c) {
        System.out.println("Введите матрицу: ");
        int[][] matrix = new int[b][c];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static void ShowMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] Multiplication(int[][] a, int[][] b) {
        int[][] result = new int[x][t];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < t; j++) {
                for (int q = 0; q < z; q++) {
                    result[i][j] += a[i][q] * b[q][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MatrixSize();
        int[][] a = ReadMatrix(x, y);
        int[][] b = ReadMatrix(z, t);
        int[][] result = Multiplication(a, b);
        ShowMatrix(result);
    }
}