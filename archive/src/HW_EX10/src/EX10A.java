package HW_EX10.src;

import java.util.Scanner;//+

public class EX10A {
    public static void main(String[] args) {
        System.out.println("Введите числа к(k >= 0) и x: ");
        int k, m = 1;
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        if ((in.hasNextInt()) & (sc.hasNextInt())) {
            k = in.nextInt();
            double x = sc.nextDouble();
            double S = x;
            double t = x;
            int p = -1;
            while (m <= k) {
                m++;
                t *= x * x * (2 * (k - 1) + 1) / (k * (2 * k + 1));
                S += t * p;
                p = -p;
            }
            System.out.println(S);
        } else {
            System.out.println("Вы ввели не число!");
        }
    }
}
