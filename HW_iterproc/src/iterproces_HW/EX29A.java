package iterproces_HW;

import java.util.Scanner;

public class EX29A {
    public static void main (String[]args) {
        System.out.print("Введите eps = ");
        Scanner ep = new Scanner(System.in);
        double eps = ep.nextDouble();
        double x0 = 0, x1;
        int n = 1;
        x1 = (x0 + 1) / (x0 + 2);// вычислили пару
        while (Math.abs(x1 - x0) > eps){
            // проверяем с эпсилон
            x0 = x1;
            x1 = (x0 + 1) / (x0 + 2);// вычислили новую пару
            n++;    // прибавляем к индексу второго члена пары единицу
        }
    System.out.println("n = " + n);
    }
}
