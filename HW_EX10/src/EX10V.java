import java.util.Scanner;

public class EX10V {
    public static void main(String[]args) {
        System.out.println("Введите числа к(k >= 1) и x: ");
        int k, x, m = 1;
        Scanner in = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        if ((in.hasNextInt()) & (sn.hasNextInt())) {
            k = in.nextInt();
            x = sn.nextInt();
            double S = (x * x) / 2;
            int    st = 1;
            while (m < k) {
                m++;
                S += (((st * x * x) * (2.0 * m - 1.0))/ (2.0 * m));// В числителе всегда х в квадрате
            }
            System.out.println(S);
        } else {
            System.out.println("Вы ввели не число!");
        }
    }
}
