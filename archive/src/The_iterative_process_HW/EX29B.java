package The_iterative_process_HW;

import java.util.Scanner;

public class EX29B {
    public static void main (String[]args) {
        System.out.print("введите eps = ");
        Scanner ep = new Scanner(System.in);
        double eps = ep.nextDouble();
        double x0 = 0, x1;
        int n = 1;
        x1 = Math.cos(x0);// вычислили пару
        while (Math.abs(x1 - x0) > eps){
            // проверяем с эпсилон
            x0 = x1;
            x1 = Math.cos(x0);// вычислили новую пару
            n++;    // прибавляем к индексу второго члена пары единицу
        }
        System.out.println("n = " + n);
    }
}
