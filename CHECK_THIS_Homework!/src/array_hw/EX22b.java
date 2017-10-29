package array_hw;//+

import java.util.Scanner;

public class EX22b {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int q = 0;
        for (int i = 0; i < n; i++) {
            a[i] = (int) Math.round(Math.random() * 100 - 50);
            System.out.print(a[i] + " ");
        }
        for ( int i = 0; i < n-1; i++) {
            if (a[i]*a[i+1] < 0) q++;
        }
        System.out.println();
        System.out.println("Число перемен знака равно = " + q);
    }
}
