package Classwork_and_homework_18october;

import java.util.Scanner;

public class EX22G {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int k = 0, j = 0;
        for (int i = 0; i < n; i++) {
            a[i] = (int) Math.round(Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        a[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int q = 2; q < a[i]; q++) {
                if (a[i] % q == 0) {
                    k++;
                }
            }
            if (k > 0) {
                j++;
            }
            k = 0;
        }
        System.out.print("Число простых чисел = " + (n - j));
    }
}