package Archive.sortirovki;

import java.util.Random;
import java.util.Scanner;

// Сортировка поиском локальныъ экстремумов по не убыванию
public class min1extr {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt();
        int[] a = new int[n];
        int min = 100000, t = 0, b = 0;
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(10);
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            min = a[i];
            t = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] <= min) {
                    min = a[j];
                    t = j;
                }
            }
            b = a[t];
            a[t] = a[i];
            a[i] = b;
            System.out.println();
            for (int x : a) {
                System.out.print(x + ", ");
            }
        }
    }
}