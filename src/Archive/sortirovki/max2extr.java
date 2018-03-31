package Archive.sortirovki;

import java.util.Random;
import java.util.Scanner;

//Метод поиска локального экстремума по  возр.
public class max2extr {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = 0, t = 0, b = 0;
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(10);
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        for (int i = n - 1; i >= 0; i--) {
            max = a[i];
            t = i;
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] >= max) {
                    max = a[j];
                    t = j;
                }
            }
            b = a[i];
            a[i] = a[t];
            a[t] = b;
            System.out.println();
            for (int x : a) {
                System.out.print(x + ", ");
            }
        }
    }
}