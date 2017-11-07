package The_iterative_process_HW;

import java.util.Scanner;

//Requla false method (Метод секущих или ,метод ложного положения)
public class EX33V {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение границы a = ");
        int a = in.nextInt();
        System.out.print("Введите значение границы b = ");
        int b = in.nextInt();
        int n = 1;
        double eps = 0.0001, x0 = a, x1 = b, z = x0, x2;
        x2 = x1 - (x1 - z / ((x1 * x1 * x1 + 3 * (x1 * x1) - 1) - (z * z * z + 3 * (z * z) - 1)));
        while (Math.abs(x2 - x1) > eps) {
             z = x1;
            x1 = x2;
            x2 = x1 - (x1 - z / ((x1 * x1 * x1 + 3 * (x1 * x1) - 1) - (z * z * z + 3 * (z * z) - 1)));
        }
        System.out.println("Искомое значение = " + x1);
    }
}