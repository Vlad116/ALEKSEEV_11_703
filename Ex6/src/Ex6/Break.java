package Ex6;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        System.out.println("Введите число n:");
        Scanner in = new Scanner(System.in);
        double G = 0, k = 0, n = 0;
        if (in.hasNextDouble()) {
            n = in.nextDouble();
        } else {    // этот фрагмент надо перенести в конец
            System.out.println("Вы ввели не число!");
        }
        int p = 1;
        double e = 0.91596;
        while (k < n) {
            k++;
            G = G + 1.0 / Math.pow((2.0 * k - 1.0), 2) * p;
            p = -p;
            // Как правильно реализовать 6 пункт б?
            // мы это еще не проходили
            if (G <= e){
                System.out.println(G);
                break;
            }
        }
    }
}
