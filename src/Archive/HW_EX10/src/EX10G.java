package Archive.HW_EX10.src;

import java.util.Scanner;

public class EX10G {
    public static void main(String[] args) {
        System.out.println("Введите числа к(k >= 1) и x: ");
        int k, m = 1;
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        double x = in.nextDouble();
        double S = x, t2 = x, t1 = 1.0;
        while (m <= k * 2) {
            m++;
            if (m % 2 == 0) {
                t1 *= x * x / (m * 2);
                S += t1;
            } else {
                t2 *= x * x / (2 * m - 1);
                S += t2;
            }
        }
        System.out.println(S);
    }
}

