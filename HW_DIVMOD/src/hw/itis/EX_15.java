package hw.itis;

import java.util.Scanner;
// Построить число М - которое содержит только нечетные цифры числа N
public class EX_15 {
    public static void main(String[] args) {
        System.out.print("Введите число N = ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = 0, j = 1;
        while(N > 0){
         if (((N % 10) % 2) == 1){
             M += (N % 10) * j;
             j *= 10;
             N = N / 10;
         } else {
             N = N / 10;
         }
        }
    System.out.println("число M = " + M);
    }
}
