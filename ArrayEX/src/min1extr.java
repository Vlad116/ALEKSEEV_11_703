import java.util.Scanner;

import java.util.Random;

public class min1extr {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n = sc.nextInt();
        int[] a = new int[n];
        int c = a[0], r = 0, i, j, b;
        for (i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10);
            System.out.print(a[i] + " ");
        }
        for (i = 0; i < a.length - 1; i++) {
            c = a[i];
            r = i;
            for (j = i; j < a.length; j++) {
                if (a[j] < c) {
                    c = a[j];
                    r = j;
                }
                if (i != j) {
                    b = a[r];
                    a[r] = a[i];
                    a[i] = b;
                }
            }
        }
        System.out.println();
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
