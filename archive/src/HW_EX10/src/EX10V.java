package HW_EX10.src;

import java.util.Scanner;

public class EX10V {
    public static void main(String[]args) {
        System.out.println("Введите числа к(k >= 1) и x: ");
        int k, m = 1;
        Scanner in = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        if ((in.hasNextInt()) & (sn.hasNextDouble())) {
            k = in.nextInt();
            double x = sn.nextDouble();
            double S = (x * x) / 2;
            double t = (x * x) / 2;
            while (m < k) {
                t *= x * x * (2 * m - 1) / (2 * m);
                S += t;
                m++;
            }
            System.out.println(S);
        } else {
            System.out.println("Вы ввели не число!");
        }
    }
}
