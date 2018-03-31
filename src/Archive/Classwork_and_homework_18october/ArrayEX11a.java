package Archive.Classwork_and_homework_18october;

import java.util.Random;
import java.util.Scanner;

public class ArrayEX11a {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = r.nextInt(100);
            System.out.print(x[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++){
            y[i] = x[n - 1 - i];
            System.out.print(y[i] + " ");
        }
    }
}
