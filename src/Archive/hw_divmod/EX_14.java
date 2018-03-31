package Archive.hw_divmod;

import java.util.Scanner;

public class EX_14 {
    public static void main(String[] args) {
        System.out.print("Введите число N = ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i = 1;
        while (N/10 > 0){
            N = N/10;
            i++;
        }
    System.out.println("Кол-во цифр в числе = " + i);
    }
}

