package Archive;

import java.util.Random;
import java.util.Scanner;

public class EX8С {
    public static void main(String[] args) {
        System.out.print("Enter m = ");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        int[] d = new int[m];
        int[] c = new int[m];
        int[] r = new int[m];
        int n = 0, l = 0;
        System.out.print("              Массив    Т1: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(2);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("              Массив    Т2: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = rand.nextInt(2);
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.print("Массив дизьюникции T1 и T2: ");
        for (int i = 0; i < d.length; i++) {// дизьюнкция, значения d принадлежат T1 или T2.
            if (a[i] > 0 || b[i] > 0) {
                d[i] = 1;
            } else {
                d[i] = 0;
            }
            System.out.print(d[i] + " ");
        }
        System.out.println();
        System.out.print("Массив  коньюнкции T1 и T2: ");
        for (int i = 0; i < c.length; i++) {// коньюнкция , значения с принадлежат Т1 и Т2.
            if (a[i] == b[i] && a[i] > 0) {
                c[i] = 1;
            } else {
                c[i] = 0;
            }
            System.out.print(c[i] + " ");
        }
        System.out.println();
        System.out.print("Массив    разности Т1 и Т2: ");
        for (int i = 0; i < r.length; i++) { // T1 / T2 значит , что r принадлежит T1 и не принадлежит T2.
            if (a[i] > 0 && a[i] != b[i]) {
                r[i] = 1;
            } else {
                r[i] = 0;
            }
            System.out.print(r[i] + " ");
        }
    }
}