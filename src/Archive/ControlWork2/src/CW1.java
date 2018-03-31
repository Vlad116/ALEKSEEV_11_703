package Archive.ControlWork2.src;

import java.util.Scanner;

public class CW1 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        Input(A);
        ShowMatrix(A);
        System.out.println("Длина самой длинной последовательности подряд идущих элементов массива, равных нулю: " + MaxLengthZero(A));
    }

    private static int MaxLengthZero(int[] a) {
        int length = 0;
        int MaxLength = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                length++;
            } else if (length > MaxLength) {
                MaxLength = length;
                length = 0;
            }
        }
        if (a[a.length - 1] == 0) {
            MaxLength = length;
        }
        return MaxLength;
    }

    private static void ShowMatrix(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    private static void Input(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }
}