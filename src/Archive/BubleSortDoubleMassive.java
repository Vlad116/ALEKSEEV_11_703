package Archive;

import java.util.Random;
import java.util.Scanner;

// Cитдиков  дз №1
public class BubleSortDoubleMassive {
    public static void main(String[] args) {

        System.out.println("Введите размерность матрицы N и M: ");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("N = ");
        int M = sc.nextInt();
        System.out.print("M = ");
        int N = sc.nextInt();
        int min = 1000000;
        int[][] A;
        A = fill(N, M);
        System.out.println("Не отсортированная матрица:" + "\n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n" + "Отсортированная матрица:" + "\n");
        BubleSort(A);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fill(int N, int M) {
        int[][] A = new int[N][M];
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = rand.nextInt(10);
            }
        }
        return A;
    }


    private static int[][] BubleSort(int matrix[][]) {
        int t;
        boolean f = false;
        for (int k = 0; k < matrix.length; k++) {
            f = false;
            for (int i = matrix[0].length - 1; i > 0 && !f; i--) {
                f = true;
                for (int j = 0; j < i; j++) {
                    if (matrix[k][j] > matrix[k][j + 1]) {
                        t = matrix[k][j];
                        matrix[k][j] = matrix[k][j + 1];
                        matrix[k][j + 1] = t;
                        f = false;
                    }
                }
            }
        }
        return matrix;
    }
}