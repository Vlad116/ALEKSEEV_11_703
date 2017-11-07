package ru.itis;

import java.util.Random;
import java.util.Scanner;
// КВАНТОР СУЩЕСТВОВАНИЯ
public class kvE {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt();
        System.out.print("Enter B(x) = ");
        int c = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(10);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        boolean f = false;
        for (int i = 0; i < a.length - 1 & !f; i++) {
            if (a[i] == c)
                f = true;

        }
        if (f)
            System.out.println("YES!");
        else
            System.out.println("NO!");
    }
}
