import java.util.Scanner;

public class Catalan {
    public static void main(String[] args) {
        double G = 0;
        int k = 0, n;// k - счетчик, n - input.
        System.out.println("Введите число n:");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            n = in.nextInt();
            int p = 1;
            while (k < n) {
                k++;
                G += 1.0 / ((2.0 * k - 1.0) * (2.0 * k - 1.0)) * p;// Можно проще G += 1.0 / ((2* k - 1) * (2 * k - 1)) * p;
                p = -p;
            }
            System.out.println(G);

        } else {
            System.out.println("Вы ввели не число!");
        }
    }
}
