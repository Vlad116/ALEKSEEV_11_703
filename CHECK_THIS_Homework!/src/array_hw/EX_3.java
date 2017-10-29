package array_hw;

import java.util.Random;

import java.util.Scanner;

public class EX_3 {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = a[0], r = 0, pr = 1;
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10);
            System.out.print(a[i] + " ");
            if (a[i] >= max) {
                max = a[i];
                r = i;
            }
        }
        System.out.println();
        for (int i = r + 1; i < a.length; i++) {
            if (a[i] != 0) {
                pr *= a[i];
            }
        }
        System.out.println("Произведение не равных нулю элементов стоящих после max = " + pr);
    }
}
