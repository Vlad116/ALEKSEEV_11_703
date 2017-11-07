package array_hw;

import java.util.Random;
import java.util.Scanner;

public class EX22D {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt(), u, k = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(10);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            u = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] != a[j])
                    u++;
                if (u == n-1) {
                    System.out.print(a[i] + ", ");
                    k++;
                }
            }
        }
        System.out.println();
        System.out.println("Число уникальных компонент = " + k );
    }
}
