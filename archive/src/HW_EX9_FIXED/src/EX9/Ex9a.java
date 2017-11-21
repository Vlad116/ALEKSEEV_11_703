package HW_EX9_FIXED.src.EX9;

import java.util.Scanner;

public class Ex9a {
    public static void main(String[]args) {
        System.out.println("Введите число m(m >=1):");
        double sum = 0;//sum - значение суммы , k - счетчик , m - входные данные.
        int k = 0,m;
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            m = in.nextInt();
            int p = 1;
            while (k < m) {
                k++;
                sum += 1.0 / (k * k) * p;
                p = -p;
            }
            System.out.println(sum);
        } else {
            System.out.println("Вы ввели не число!");
        }
    }
}