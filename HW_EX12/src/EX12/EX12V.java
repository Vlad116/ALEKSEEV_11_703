package EX12;

import java.util.Scanner;

public class EX12V {
    public static void main(String[] args) {
        System.out.println("Введите числа x и eps: ");
        Scanner in = new Scanner(System.in);
        int n = 1, p = 1;
        double x = in.nextDouble();// -1 < x < 1
        double e = in.nextDouble(), t = x, s = 0;
        while (Math.abs(t) > e){
            s += p * t;
            n++;
            t *= x *(n - 1) / n;
            p = -p;
        }
        System.out.print(s);
    }
}
