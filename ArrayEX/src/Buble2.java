import java.util.Scanner;

public class Buble2 {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t, k = 0;
        int[] a = {2, 3, 5, 4, 6, 7, 8, 9};
        boolean f = false;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = a.length - 1; i > 0 & !f; i--) {
            f = true;
            k++;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    f = false;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(k);
    }
}