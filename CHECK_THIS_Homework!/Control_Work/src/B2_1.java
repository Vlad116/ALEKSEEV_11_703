import java.util.Scanner;//-

public class B2_1 {
    public static void main(String[] args) {
        System.out.println("Введите значение x и a ( a > 1) : ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a = in.nextInt();
        double eps = 0.00001;
        int k = 1;
        double  S = 0,
                t = x * (Math.log10(x) * Math.log10(x));
        while (Math.abs(t) > eps) {
            S += t;
            t *= (((-1.0 + a) * x * (Math.log10(x) * Math.log10(x))) / k);//вы же видите, что вот это x * (Math.log10(x) * Math.log10(x)
                    // не зависит от k, поэтому d = (-1.0 + a)/ k, и потом  t = d*x * (Math.log10(x) * Math.log10(x)
                    // а так вы получаете степень иксов и логарифмов
            k++;
        }
        System.out.println(S);
    }
}

