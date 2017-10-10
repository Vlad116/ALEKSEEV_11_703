package EX9;

import java.util.Scanner;

public class Ex9b {
    public static void main(String[] args) {
        System.out.println("Введите число m (m >= 1):");
        Scanner in = new Scanner(System.in);
        double sum = 0.5,ch = 1,zn = 2 ;//sum - значение суммы, k - счетчик , m - входные данные, ch-числитель дроби, zn-знаменатель дроби.
        int k = 1,m;
        if (in.hasNextInt()) {
            m = in.nextInt();
            while (k < m){
                k++;
                sum += ((ch * (k - 1.0)) * (ch * (k - 1.0))) / ((2 * k) * (2 * k - 1) * zn);//откуда возьмутся факториалы?
            }
            System.out.println(sum);
        } else {
            System.out.println("Вы ввели не число!");
        }
    }
}
