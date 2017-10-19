package EX12;

import java.util.Scanner;
public class EX12A {
    public static void main(String[]args) {
        System.out.println("Введите числа x и eps: ");
        double S = 0,t = 1,eps,x;
        int n = 1;
        Scanner in = new Scanner(System.in);
        Scanner ep = new Scanner(System.in);
        x = in.nextDouble();
        eps = ep.nextDouble();
        while (Math.abs(t) > eps) {
            S += t;
            t *= x/n;
            n++;
        }
        System.out.println(S);
    }
}
