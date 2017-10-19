package iterproces_HW;

import java.util.Scanner;
//Метод простых итераций
public class EX32B {
    public static void main(String[] args) {
        System.out.print("Введите a = ");// т.к. по условию а - любое
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = 1;
        double eps = 0.0001, x0 = a, x1;
        x1 = 1 + 9 * Math.sin(x0) / 2;
        while (Math.abs(x1 - x0) > eps) {
            x0 = x1;
            x1 = 1 + 9 * Math.sin(x0) / 2;
        }
        System.out.println("Искомое значение = " + x1);
    }
}