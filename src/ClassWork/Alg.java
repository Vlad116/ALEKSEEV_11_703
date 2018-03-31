package ClassWork;

import java.util.Scanner;

public class Alg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = convertToArray(n);
        for (int x : arr) {
            System.out.print(x + " ");
        }
        int result = algorithm(n);
        System.out.println(result);
    }

    public static int algorithm(int n) {
        int arr[] = convertToArray(n);
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    k += factorial(arr.length - (i + 1));
                }
            }
        }
        return k;
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    public static int[] convertToArray(int n) {
        int arr[] = new int[lenght(n)];
        int i = lenght(n);
        while (n > 0) {
            arr[i - 1] = n % 10;
            i--;
            n /= 10;
        }

        return arr;
    }

    public static int lenght(int n) {
        int k = 0;
        while (n > 0) {
            n /= 10;
            k++;
        }
        return k;
    }
}
