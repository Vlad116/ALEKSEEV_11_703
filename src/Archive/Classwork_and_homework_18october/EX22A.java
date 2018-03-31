package Archive.Classwork_and_homework_18october;

import java.util.Scanner;

public class EX22A {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0, sum1 = 0;
        for (int i = 0; i < n; i++) {
            a[i] = (int) Math.round(Math.random() * 100 - 50);
            if (a[i] > 0) {
                sum += a[i];
            } else {
                sum1 += a[i];
            }
        }
        System.out.println("Сумма положительных компонентов = " + sum);
        System.out.println("Сумма отрицательных компонентов = " + sum1);
    }
}
