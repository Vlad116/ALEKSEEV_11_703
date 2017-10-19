package Classwork_and_homework_18october;

import java.util.Scanner;

import java.util.Random;

public class ArrayEX6 {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] z = new int[n];
        for (int i = 0; i < n;i++){
            x[i] = r.nextInt(100);
            System.out.print(x[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < n;i++){
            if (x[i] * x[i-1] < 0){
                y[i] = 1;
            }else{
                y[i] = 0;
            }
            System.out.print(y[i] + " ");
            if (x[i-1] > x[i]){
                z[i] = 1;
            }else{
                z[i] = 0;
            }
            System.out.println(z[i] + " ");
        }
    }
}