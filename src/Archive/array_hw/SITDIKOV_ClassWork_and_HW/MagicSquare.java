package Archive.array_hw.SITDIKOV_ClassWork_and_HW;

import java.util.Scanner;

// ДЗ №5
public class MagicSquare {
    public static void main(String[] args) {
        System.out.println("В ручную введите матрицу N x N , что бы проверить является ли она магическим квадратом.");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int min = 1000000;
        // Вводим в ручную т.к. получить магический квадрат рандомом шансов мало.
        int[][] A = {{2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}};
        int[] SumS = new int[A.length];
        int[] SumC = new int[A.length];
        boolean f = true;
        int SumGl = 0;
        int SumPb = 0;

        for (int i = 0; i < A.length && f; i++) {
            int SumStr = 0;
            for (int j = 0; j < A[i].length; j++) {
                SumStr += A[i][j];
            }
            System.out.println("Суммма " + (i + 1) + "-ой строки = " + SumStr);
            SumS[i] = SumStr;
            if (SumStr != SumS[0]) {
                f = false;
            }
        }
        System.out.println();
        for (int i = 0; i < A[0].length && f; i++) {
            int SumColomn = 0;
            for (int j = 0; j < A.length; j++) {
                SumColomn += A[j][i];
            }
            System.out.println("Суммма " + (i + 1) + "-ого столбца = " + SumColomn);
            SumC[i] = SumColomn;
            if (SumC[i] != SumS[0]) {
                f = false;
            }
        }

        System.out.println();
        for (int i = 0; i < A.length && f; i++) {
            SumGl += A[i][i];
        }
        System.out.println("Суммма главной диагонали = " + SumGl);
        System.out.println();
        if (SumGl != SumS[0]) {
            f = false;
        }

        for (int i = 0; i < A.length && f; i++) {
            SumPb += A[i][A.length - i - 1];
        }
        System.out.println("Суммма побочной диагонали = " + SumPb);
        if (SumPb != SumS[0]) {
            f = false;
        }

        System.out.println();

        if (f) {
            System.out.println("Данная матрица является магическим квадратом!");
        } else {
            System.out.println("Данная матрица не является магическим квадратом!");
        }
    }
}