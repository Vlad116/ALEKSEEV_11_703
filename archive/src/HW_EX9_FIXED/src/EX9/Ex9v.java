package HW_EX9_FIXED.src.EX9;

import java.util.Scanner;

public class Ex9v {
    public static void main(String[]args) {
        System.out.println("Введите число m(m >= 1):");
        double sum = 1;//sum - значение суммы , k - счетчик , m - входные данные.
        int k = 0, t = 1;
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int p = -1;
        while (k < m) {
            k++;
            t *= 3;
            sum += 1.0 / ((2 * k + 1) * t) * p;
            p = -p;
        }
        System.out.println(sum);
    }
}