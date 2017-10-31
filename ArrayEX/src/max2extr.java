import java.util.Scanner;//подпишите, какая сортировка

import java.util.Random;

public class max2extr {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt();
        int[] a = new int[n];
        int c = a[0], t = 0, i, j, b;
        for (i = 0; i < a.length; i++) {
            a[i] = r.nextInt(10);
            System.out.print(a[i] + " ");
        }
        for (i = a.length; i > 0; i--) {
            c = a[0];
            t = i;
        }
        for (j = 1; j < i; j++) {
            if (a[j] < c) {
                c = a[j];
                t = j;
            }
            if (i != j) {
                b = a[t];
                a[t] = a[i];
                a[i] = b;
            }

        }
        System.out.println();
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
