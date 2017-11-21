package array_hw;

import java.util.Random;
import java.util.Scanner;

public class EX037 {
    public static void main(String[] args) {
        System.out.println("Введите размерность матрицы N x N: ");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("N = ");
        int N = sc.nextInt();
        int min = 1000000;
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if ((i + 1) + (j + 1) < matrix.length + 1) {
                    matrix[i][j] = 0;
                }
                if ((i + 1) + (j + 1) > matrix.length + 1) {
                    matrix[j][i] = 0;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


