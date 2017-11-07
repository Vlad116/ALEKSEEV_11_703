package hw_divmod;

import java.util.Scanner;

public class EX_13 {
    public static void main(String[] args) {
        System.out.print("Введите число N = ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int p = 1,SumN = 0, osr = 1;
        int j = 1;
        while (N / j > 0){
            osr = ((N / j) % 10 ) * p;
            j *= 10;
            SumN += osr;
            p = -p;
        }
        System.out.println("Знакопеременная сумма числа N = " + SumN);
    }
}

