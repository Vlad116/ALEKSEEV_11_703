package Archive.Classwork_and_homework_18october;

import java.util.Random;
import java.util.Scanner;

public class ArrayEX11b {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] z = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = r.nextInt(100);
        }
        System.out.println();
        for (int i = 0; i < n - 1; i++) {
            y[i] = x[i + 1];
        }
        y[n - 1] = x[0];
        for (int i = n - 1; i > 0; i--) {
            z[i] = x[i - 1];
        }
        z[0] = x[n - 1];
        for (int s : x) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (int s : y) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (int s : z) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
