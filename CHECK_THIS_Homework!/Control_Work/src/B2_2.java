import java.util.Scanner;

public class B2_2 {
    public static void main(String[] args) {
        System.out.println("Введите вещественное значение x и натуральное значение n: ");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double t, pr;
        int n = in.nextInt();
        int k = 1, f = 1;
        pr = 1;
        t = ((1.0 - x) * (1.0 - x) + 1 / 4.0);
        while (k <= n) {
            pr *= t;
            k++;
            f *= (k - 1);
            t *= ((1.0 - x) / ((f + 1) * (f + 1)));
            System.out.println(((f + 1) * (f + 1)));
        }
        System.out.println(pr);
    }
}
