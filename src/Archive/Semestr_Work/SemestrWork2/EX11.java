package Archive.Semestr_Work.SemestrWork2;

import java.util.Random;

//11 а) е) к) д)
public class EX11 {
    public static void main(String[] args) {
        int[][] A = new int[3][5];// входные данные д)
        double[] x = new double[3];
        WriteInMatrixRandomNumber(A);
        showMatrix(A);
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (FindMax(A[i]) <= 10) {// условие Pi к)
                    x[i] = F(A[i]);
                } else {
                    x[i] = G(A[i]);
                }
            }
            System.out.print(x[i] + " ");
        }
    }

    private static Random rand = new Random();

    public static void WriteInMatrixRandomNumber(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(15);
            }
        }
        System.out.println();
    }

    public static void showMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int FindMax(int[] row) {
        int max = row[0];
        for (int i = 1; i < row.length; i++) {
            if (row[i] > max) {
                max = row[i];
            }
        }
        return max;
    }

    public static double F(int[] row) {//Выражение F а)
        double MaxSin = Math.sin(row[0] * row[0] + 3.7);
        for (int i = 1; i < row.length; i++) {
            if (MaxSin < Math.sin(row[i] * row[i] + 3.7)) {
                MaxSin = Math.sin(row[i] * row[i] + 3.7);
            }
        }
        return MaxSin;
    }

    public static double G(int[] row) {//Выражение G е)
        double sum = 0;
        for (int i = 0; i < row.length; i++) {
            sum += Math.cos(row[i] + 0.8);
        }
        return sum;
    }
}
