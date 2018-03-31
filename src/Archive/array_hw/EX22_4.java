package Archive.array_hw;

import java.util.Random;
import java.util.Scanner;

//22Г
public class EX22_4 {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(10);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        boolean f = false;
        for (int i = 0; i < a.length - 1 & !f; i++) {
            for (int j = i + 1; j < a.length & !f; j++)
                if (a[i] == a[j])
                    f = true;
        }
        if (f)
            System.out.println("Одинаковые компоненты имеются? YES! :) ");
        else
            System.out.println("Одинаковые компоненты имеются? NO!:( ");
    }
}

