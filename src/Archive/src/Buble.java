package Archive.src;

import java.util.Random;
import java.util.Scanner;

public class Buble {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt(),t,k = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(10);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = a.length - 1; i > 0; i--) {
            k++;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
            for(int i = 0; i < a.length; i++){
                System.out.print(a[i] + " ");
            }
    System.out.println();
    System.out.println(k);
    }
}