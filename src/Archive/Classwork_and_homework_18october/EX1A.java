package Archive.Classwork_and_homework_18october;

import java.util.Random;
import java.util.Scanner;

public class EX1A {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n;
        n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(100);
            b[i] = r.nextInt(100);
            c += a[i] * b[i];
        }
        System.out.print(c + ", ");
    }
}