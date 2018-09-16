package HomeWork.ThreadTask;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Размер массива");

        int n = scanner.nextInt();

        System.out.println("Введите кол-во потоков");

        int k = scanner.nextInt(),
                data[] = new int[n], sumByThread = 0, sumByFor = 0;

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(1000);
        }

        ThreadSummator[] threads = new ThreadSummator[k];

        for (int number : data) {
            sumByFor += number;
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new ThreadSummator((n / k) * i, (n / k) * (i + 1), data);
            threads[i].start();
            threads[i].join();
            sumByThread += threads[i].getSum();
        }

        System.out.println("Сумма посчитанная циклом: " + sumByFor);

        System.out.println("Сумма посчитанная потоком: " + sumByThread);

    }
}
