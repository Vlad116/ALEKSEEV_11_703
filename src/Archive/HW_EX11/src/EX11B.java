package Archive.HW_EX11.src;

import java.util.Scanner;

public class EX11B {
    public static void main(String[] args) {
        System.out.println("Введите число i (i >= 0):");
        Scanner in = new Scanner(System.in);
        int i,k = 1;
        double t;// t - сумма
        if (in.hasNextInt()) {
            i = in.nextInt();
            double cs = 1;
            double sn = 1;
            t = 0 ;
            while (k <= i){
                cs *= Math.cos(k);
                sn *= Math.sin(k);
                t += cs / sn;
                k++;
            }
            System.out.println(t);
        } else {
            System.out.println("Вы ввели не число!");
        }
    }
}
