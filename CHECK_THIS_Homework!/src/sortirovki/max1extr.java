package sortirovki;

import java.util.Scanner;

import java.util.Random;
//Метод поиска локального экстремума по не возрастранию
public class max1extr {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = 0, t = 0, b = 0;// max,r,b
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(10);
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            max = a[i];
            t = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] >= max) {
                    max = a[j];
                    t = j;
                }
            }
            b = a[t];
            a[t] = a[i];
            a[i] = b;
            System.out.println();
            for (int x : a) {
                System.out.print(x + ", ");
            }
        }
    }
}
