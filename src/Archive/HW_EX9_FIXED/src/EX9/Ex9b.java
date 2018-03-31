package Archive.HW_EX9_FIXED.src.EX9;

import java.util.Scanner;

public class Ex9b {
    public static void main(String[] args) {
        System.out.println("Введите число m (m >= 1):");
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        double t = 0.5, sum = 0;//sum - значение суммы, k - счетчик , m - входные данные
        int k = 2;
        while (k <= m) {
            sum += t;
            t *= (k - 1.0) * (k - 1.0) / ((2 * k - 1) * (2 * k));
            k++;
        }
        System.out.println(sum);
    }
}
