package EX9;

import java.util.Scanner;

public class Ex9v {
    public static void main(String[]args){
        System.out.println("Введите число m(m >=1):");
        double sum = 0;//sum - значение суммы , k - счетчик , m - входные данные.
        int k = 0,m,t = 1;
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            m = in.nextInt();
            int p = 1;
            while (k < m){
                k++;
                t *= 3;
                sum = sum + (1.0 / ((2 * k + 1) * t)) * p;
                p = -p;
            }
            System.out.println(sum);
        } else {
            System.out.println("Вы ввели не число!");
        }
    }
}