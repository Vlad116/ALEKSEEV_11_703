package HomeWork.ThreadTask;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Random random;
    private static Scanner scanner;

    public static void main(String[] args) {

        System.out.println("Размер массива");

        int n = scanner.nextInt();

        System.out.println("Введите кол-во потоков");

        int k = scanner.nextInt(),
                data[] = new int[n], summ;

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(1000);
        }

        ThreadSummator[] threads = new ThreadSummator[k];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new ThreadSummator((n / k) * i, (n / k) * (i + 1), data);
        }

    }
}
