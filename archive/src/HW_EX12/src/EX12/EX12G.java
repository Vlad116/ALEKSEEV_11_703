package HW_EX12.src.EX12;//+

import java.util.Scanner;

public class EX12G {
    public static void main (String[]args){
        System.out.println("Введите числа x и eps: ");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double eps = in.nextDouble();
        int k = 0, p = 1;
        double S = 0, t = 1;
        while (Math.abs(t) > eps) {
            S += t * p;
            p = -p;
            k++;
            t *= (1.0 * x * x) / (2 * k * (2 * k - 1 ));
        }
        System.out.println(S);
    }
}


