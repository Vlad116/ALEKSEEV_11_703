package array_hw.SITDIKOV_ClassWork_and_HW;

import java.util.Random;
import java.util.Scanner;
//ДЗ №4
public class Transpore {
    public static void main(String[] args) {
        System.out.println("Введите размерность матрицы N x N: ");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("N = ");
        int N = sc.nextInt();
        int min = 1000000;
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = rand.nextInt(10);
            }
        }
        System.out.println("Изначальная матрица:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int t = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = t;
            }
        }
        System.out.println("Транспонированная матрица:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}