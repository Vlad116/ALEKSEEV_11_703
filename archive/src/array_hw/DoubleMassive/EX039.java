package array_hw.DoubleMassive;

import java.util.Random;
import java.util.Scanner;
//Не доделано, загружу завтра...
public class EX039 {
    public static void main(String[] args) {
        System.out.println("Введите размерность матрицы N и M: ");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("N = ");
        int M = sc.nextInt();
        System.out.print("M = ");
        int N = sc.nextInt();
        int[][] A = new int[N][M];
        System.out.print("Введите P = ");
        int P = sc.nextInt();
        int[] B = new int[P];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = rand.nextInt(10);
            }
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < P; i++){
            B[i] = rand.nextInt(10000);
            System.out.print(B[i] + " ");
        }

    }
}
