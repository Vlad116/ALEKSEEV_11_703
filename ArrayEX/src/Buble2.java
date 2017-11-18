
import java.util.Random;
import java.util.Scanner;

public class Buble2 {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        boolean f = false;
        int n, t, k = 0;
        n = sc.nextInt();
        //  int[] a = new int[n];
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
       // Random r = new Random(); //создание объекта класса  Random
      /*  for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(10);// получение нового случайного значения в диапазоне 0..99
        }*/
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
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
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        System.out.println(k);
    }
}