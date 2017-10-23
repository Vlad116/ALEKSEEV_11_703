package Classwork_and_homework_18october;//+-

import java.util.Scanner;

//Что не верно? Уходит за пределы массива...
public class EX22b {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int q = 0;
        for (int i = 0; i < n; i++) {
            a[i] = (int) Math.round(Math.random() * 100 - 50);
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            if ((a[i + 1] >= 0) & (a[i] < 0)) {  //длинно
                q++;
            } else {
                if ((a[i + 1] < 0) & (a[i] >= 0)) {
                    q++;
                }
            }
        }
        System.out.println();
        System.out.println("Число перемен знака равно = " + q);
    }
}
