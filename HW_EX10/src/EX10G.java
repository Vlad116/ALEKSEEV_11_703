import java.util.Scanner;

public class EX10G {
    public static void main(String[]args) {
    System.out.println("Введите числа к(k >= 1) и x: ");
    int k, x, m = 1;
    Scanner in = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    if ((in.hasNextInt()) & (sc.hasNextInt())) {
        k = in.nextInt();
        x = sc.nextInt();
        double S = x;
        int st = 1;
        if (k % 2 == 0){
            while (m < k) {
                m++;
                S += ((st * x) / (2.0 * m));
            }
        } else {
            while (m < k) {
                m++;
                S += ((st * x) / ((2.0 * m) - 1.0));
            }
        }
        System.out.println(S);
    } else {
        System.out.println("Вы ввели не число!");
        }
    }
}