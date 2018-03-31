package Archive.HW_EX10.src;

import java.util.Scanner;

public class EX10B {
    public static void main(String[] args) {
        System.out.println("Введите числа к(k >= 0) и x: ");
        int k, m = 1;
        Scanner in = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        if ((in.hasNextInt()) & (sn.hasNextDouble())) {
            k = in.nextInt();
            double x = sn.nextDouble();
            double S = x;
            double t = x;
            int p = -1;
            while (m <= k) {
                m++;
                t *= x * x * x * x * (4 * (m - 1) + 1) / ((2 * m * (2 * m - 1)) * (4 * m + 1));
                S += t * p;
                p = -p;
            }
            System.out.println(S);
        } else {
            System.out.println("Вы ввели не число!");
        }
    }
}