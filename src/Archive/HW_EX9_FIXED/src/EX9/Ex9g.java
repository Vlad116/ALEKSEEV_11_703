package Archive.HW_EX9_FIXED.src.EX9;

import java.util.Scanner;

public class Ex9g {
    public static void main(String[]args){
        System.out.println("Введите число m(m >=1):");
        double sum = 1;//sum - значение суммы , k - счетчик , m - входные данные.
        int k = 0,m,t = 1;
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            m = in.nextInt();
            while (k < m){
                k++;
                t *= 9;
                sum = sum + 1.0/((2 * k + 1) * t);
            }
            System.out.println(sum);
        } else {
            System.out.println("Вы ввели не число!");
        }
    }
}
