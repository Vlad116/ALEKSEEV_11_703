package array_hw;

import java.util.Scanner;

import java.util.Random;

public class EX8A {
    public static void main(String[] args) {
        System.out.print("Enter m = ");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        int n = 0, l = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(2);
            System.out.print(a[i] + " ");
            if(a[i] > 0){
                n++;
            }
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            b[i] = rand.nextInt(2);
            System.out.print(b[i] + " ");
            if (b[i] > 0){
                l++;
            }
        }
        System.out.println();
        System.out.println("Число элементов Т1 = " + n);
        System.out.println("Число элементов Т2 = " + l);
    }
}
