package Archive.HW_iterproc.src.iterproces_HW;

import java.util.Scanner;

public class EX25 {
    public static void main(String[]args) {
        System.out.println("Введите числа x и eps: ");
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        double x = in.nextDouble();
        double eps = sc.nextDouble();
        double y0;
        if (x >= 1){
            y0 = x/3;
        }else{
            y0 = x;
        }
        double y1 = y0 - 1/3.0 *(y0 - x /( y0 * y0));
        while (Math.abs(y0-y1) > eps) {
            y0 = y1;
            y1 = y0 - 1 / 3.0 * (y0 - x / (y0 * y0));
        }
        System.out.println(y1);
    }
}
